package school.mjc.stage0.loops.task2;

import java.io.BufferedWriter;
import java.io.PrintStream;

public class WordsBuilder {
    public void buildPhrase(char... chars) {


       StringBuilder output = new StringBuilder();
       int countOfChars = chars.length;
       int counter = 0;
       while (counter < countOfChars)
       {
           output.append(chars[counter]);
           counter++;
       }
       System.out.print(output);
    }
}
