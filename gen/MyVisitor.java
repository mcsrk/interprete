import java.util.HashMap;

import static java.lang.Double.valueOf;

public class MyVisitor<T> extends MyLanguageBaseVisitor<T> {
    HashMap<String,Object> table = new HashMap<>();

    @Override
    public T visitRepeat(MyLanguageParser.RepeatContext ctx) {
        int times = (int)(double)(Double)visitExpr(ctx.expr());
        for(int i=0 ; i<times ; i++){
            visitCommands(ctx.commands());
        }
        return null;
    }

    public T visitConditional(MyLanguageParser.ConditionalContext ctx) {
        String op = ctx.ROP().getText();
        Double num1 = (Double) visitExpr(ctx.expr(0));
        Double num2 = (Double) visitExpr(ctx.expr(1));
        Boolean ans ;

        switch (op) {
            case "<":
                ans = num1 < num2;
                break;
            case "<=":
                ans = num1 <= num2;
                break;
            case ">":
                ans = num1 > num2;
                break;
            case ">=":
                ans = num1 >= num2;
                break;
            case "==":
                ans = Math.abs(num1 - num2) < 0.000000001;
                break;
            case "!=":
                ans = Math.abs(num1 - num2) > 0.000000001;
                break;
            default :
                throw new IllegalArgumentException(op + "es un operador inválido!");
        }
        if (ans) {
            visitCommands(ctx.commands());
        }
        // En caso de que el programa funete exista posibilidad de un else, hay que verificar que
        // el contexto/comando obtenido tenga un else para poder ejecutarlo en el lenguaje en
        // el que se interpreta
        return null;
    }

    @Override
    public T visitCommand(MyLanguageParser.CommandContext ctx) {
        if (ctx.printexpr() != null) {
            Double ans = (Double) visitExpr(ctx.printexpr().expr());
            System.out.println(ans);
        } else if (ctx.VAR() != null) {//>Existe tk var
            String name = ctx.ID().getText();
            if (table.get(name) != null) {//Existe un id en la tabla de simbolos, entonces sería err:redelcaración
                int line = ctx.ID().getSymbol().getLine();
                int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
                System.err.printf("<%d:%d> Error semantico, la variable con nombre: \"" + name + "\" ya fue declarada.\n", line, col);
                System.exit(-1);
            } else {
                table.put(name, visitExpr(ctx.expr()));//Sino existe el id en tabla de simbolos, la añade
            }
        } else {
            return visitChildren(ctx);
        }
        return super.visitCommand(ctx);
    }

    @Override
    public T visitExpr(MyLanguageParser.ExprContext ctx) {
        if (ctx.DOUBLE() != null) {
            Double num = valueOf(ctx.DOUBLE().getText());
            return (T) num;
        } else if (ctx.PIZQ() != null) {
            return visitExpr(ctx.expr(0));
        } else if (ctx.ID() != null) {
            String name = ctx.ID().getText();//trae lexema de id
            Object value;
            if ((value = table.get(name)) == null) {//busca lexena de id en tabla de simbolos
                int line = ctx.ID().getSymbol().getLine(); //si no está declarada, error: no se puede usar
                int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
                //Podría ser en .out también.
                System.err.printf("<%d:%d> Error semantico, la variable con nombre \"" + name + "\" no fue declarada.\n", line, col);
                System.exit(-1);
                return null;
            } else {
                return (T) value; //retorna el lexema
            }
        } else {
            String op = (ctx.MULOP() != null ? ctx.MULOP().getText() : ctx.SUMOP().getText());
            Double num1 = (Double) visitExpr(ctx.expr(0)); // visita de forma recursiva
            Double num2 = (Double) visitExpr(ctx.expr(1)); // visita de forma recursiva
            Double ans = null;

            switch (op) {
                case "+":
                    ans = num1 + num2;
                    break;
                case "-":
                    ans = num1 - num2;
                    break;
                case "*":
                    ans = num1 * num2;
                    break;
                case "/":
                    ans = num1 / num2;
                    break;
            }
            return (T) ans;
        }
    }


}