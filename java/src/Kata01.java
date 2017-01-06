// http://moduscreate.com/12-intellij-idea-keyboard-shortcuts/

import java.util.Optional;

public class Kata01 {
    // Comment out the line below with a line comment command-/

    int i = 3;

    // put the cursor inside this function and select increasing blocks,    option-up
    // then decrease block selection option-down

    public void blah() {
        if ( true==false ) {
            foo(null);
            for(int i=0; i<12;++i) {
                foo("asdf");
            }
        }
    }


    // Comment out the function below with a block comment  shift-ctrl-/


    public void foo(String bla) {
        int j = 4;
    }


    // Delete line cmd-backspace

    int foo=3;


    // Reformat this code option-command-l

    public
        long bar(int
                 i, long j) { return i*j; }



}
