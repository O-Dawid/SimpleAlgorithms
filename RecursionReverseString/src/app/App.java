package app;

public class App {

    public static String reverseString(String string, int i){

        if (string.isEmpty()){
            System.out.println("empty");
            System.out.println("Counter: "+i);
            return "";
        }

        i++;
        char firstLetter = string.charAt(0);

        return reverseString(string.substring(1),i)+firstLetter;
        
    }

    public static void main(String[] args) throws Exception {
        int i = 0;
        String string =reverseString("Hello", i);

        System.out.println(string);
    }
}