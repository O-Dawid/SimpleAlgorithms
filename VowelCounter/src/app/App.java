package app;

import java.util.Arrays;
import java.util.List;

public class App {




    public static void main(String[] args) throws Exception {

        List<Character> vowels = Arrays.asList('a','e','i','o','u');
        int counter = 0;
        String string = "How many vowels in this String";

        for (Character character : string.toCharArray()) {
            if(vowels.contains(character))
                counter++;
            
        }



        System.out.println(counter);
    }
}