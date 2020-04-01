package app;

public class EditDistanceProblem { 
    static int i=0;
 public int editDistanceRecursion(String firstString, String secondString, int lengthOfFirstString, int lengthOfSecondString){
            //If any of the string if empty then number of operations
            //needed would be equal to the length of other string
            //(Either all characters will be removed or inserted)
            i++;
            if(lengthOfFirstString==0)
                return lengthOfSecondString; //all elements will be inserted.
            if(lengthOfSecondString==0)
                return lengthOfFirstString; // all elements will be removed.

            //If last characters are matching, ignore the last character
            // and make a recursive call with last character removed.
            if(firstString.charAt(lengthOfFirstString-1)==secondString.charAt(lengthOfSecondString-1))
                return editDistanceRecursion(firstString, secondString, lengthOfFirstString-1, lengthOfSecondString-1);
                
            //If nothing above worked then we need to try all 3 operations
            //and choose the minimum among them
            int insert = editDistanceRecursion(firstString, secondString, lengthOfFirstString, lengthOfSecondString-1);
            int remove = editDistanceRecursion(firstString, secondString, lengthOfFirstString-1, lengthOfSecondString);
            int replace = editDistanceRecursion(firstString, secondString, lengthOfFirstString-1, lengthOfSecondString-1);

            return 1 + Math.min(insert, //Insert
                    Math.min(remove, replace)); //Replace
        }
 public static void main(String[] args) {
        String s1 = "sk";
        String s2 = "sok";
        
        EditDistanceProblem ed = new EditDistanceProblem();
        System.out.println("Minimum Edit Distance -(Recursion): " + ed.editDistanceRecursion(s1, s2, s1.length(), s2.length()));
        System.out.println("Recursion counter: " + i);
    }
}