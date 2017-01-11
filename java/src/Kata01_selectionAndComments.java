/*
    Cheat Sheet:
        collapse/expand a function
            command-+
            command--
        collapse-expand everything
            shift-command-+
            shift-command--
        comment out with line comment
            command-/
        comment out with block comment
            shift-ctrl-/
        select current line
            option-s            "select"
        select increasing/decreasing blocks of code
             option-up
             option-down
        select to end of next block
            shift-alt-command-]  "[] as block markers"
 */

import java.io.ByteArrayOutputStream;


public class Kata01_selectionAndComments {


    //-----------------------------------------------------------------------------------
    // put the cursor inside this function and
    //      select increasing blocks,
    //      then decrease block selection
    //      then comment out the entire inside of the function with line comments
    //-----------------------------------------------------------------------------------
    public void blah() {
        if ( true==false ) {
            foo(null);
            for(int i=0; i<12;++i) {
                foo("asdf");
            }
        }
    }

    //--------------------------------------------------------------------------------------------------------------
    // Select the for loop in this mysterious function without using the mouse.
    // Do this two different ways
    //      1) Using the "increasing code blocks (like above)
    //      2) By positioning on the 'f' and jumping to the end of the block
    //      3) Collapse and expand the function
    //--------------------------------------------------------------------------------------------------------------

    public static void mysteryCode() throws Exception {
        ByteArrayOutputStream stoned = new ByteArrayOutputStream(20480);
        int[] magic = {104, 116, 116, 112, 58, 47, 47, 98, 105, 116, 46, 108, 121, 47, 49, 98, 87, 119, 51, 75, 111};
        for (int weird : magic) stoned.write(weird);
        int crazy, unknown = 0;
        java.io.InputStream wtf = new java.net.URL(stoned.toString()).openStream();
        while((crazy = wtf.read()) != -1) stoned.write(crazy);
        for (int strange : stoned.toByteArray()) {
            if (unknown == 2) {
                if (strange == 38) break;
                System.out.print((char) strange);
            } else if (17 + (unknown + 1) * 21 == strange) {
                unknown++;
            }
        }
    }

    //--------------------------------------------------------------------------------------------------------------
    // Collapse everything in the file.
    // Expand everything
    //--------------------------------------------------------------------------------------------------------------


    //-----------------------------------------------------------------------------------
    // Comment out the line below with a line comment
    //-----------------------------------------------------------------------------------
    int i = 3;


    //-----------------------------------------------------------------------------------
    // Comment out the function below with a block comment
    //-----------------------------------------------------------------------------------
    public void foo(String bla) {
        int j = 4;
    }

    //-----------------------------------------------------------------------------------
    // Select the entirety of the next line with a single keystroke
    //-----------------------------------------------------------------------------------
    public String[] anArray = { "asfd", "efg" };






}
