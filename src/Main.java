import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {

    public static void main(String [] args) throws Exception{
        MyLanguageLexer lexer = new MyLanguageLexer(CharStreams.fromFileName("input/input.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MyLanguageParser parser = new MyLanguageParser(tokens);
        ParseTree tree = parser.commands();

        MyVisitor loader = new MyVisitor();
        loader.visit(tree);
    }
}
