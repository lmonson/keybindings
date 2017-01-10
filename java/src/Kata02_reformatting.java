/*
    Cheat Sheet:
        optimize imports
            ctrl-option-o
        reformat code
            option-command-l
        join multiple lines into one
            shift-ctrl-j
        split one line into many
            command-enter (while at the split point)
                split point at bol --> add line before
                split point at eol --> add line after
        insert blank line after line where the cursor is
            shift-enter
 */

//-----------------------------------------------------------------------------------
// Optimize the imports
//-----------------------------------------------------------------------------------
import java.io.ByteArrayOutputStream;
import java.io.BufferedInputStream;
import java.io.CharArrayReader;

public class Kata02_reformatting {

    //-----------------------------------------------------------------------------------
    // For this multi-line statement
    //      reformat it to match style rules
    //      "join" it onto a single line
    //-----------------------------------------------------------------------------------
    public static void lineCombine() {
        System.out.println("this "+
            "something else"+"asd"
                        +"   this"
                        +new Integer(
                                Integer.parseInt("123"))
                .toString());
    }

    //-----------------------------------------------------------------------------------
    // For this multi-line statement
    //      split it into at least 3 lines.
    //-----------------------------------------------------------------------------------
    public static String lineSplit() {
        return "this is a very, very long line that, you can imagine, might appear on multiple lines if the text were to exceed some threshold";
    }

    //-----------------------------------------------------------------------------------
    // Add blank lines before the return statement.
    // Add blank lines after the return statement.
    //-----------------------------------------------------------------------------------
    public static int lineMethod() {
        return 1;
    }


    //-----------------------------------------------------------------------------------
    // Put cursor in the middle of the "String result..." line.  Insert a blank line after
    //-----------------------------------------------------------------------------------
    public static String makeNewLine() {
        String result ="this is a very, very long line that, you can imagine, might appear on multiple lines if the text were to exceed some threshold";
        return result;
    }

    //-----------------------------------------------------------------------------------
    // Reformat this code   (don't need to select it)
    //-----------------------------------------------------------------------------------
    public
    long bar(int      i,
             long j) { return i*j; }


}
