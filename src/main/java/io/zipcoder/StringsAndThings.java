package io.zipcoder;
import java.lang.Character;
import java.util.Objects;


/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input) {
        String word = input + " ";
        int count = 0;

        //word.substring(word.length() - 1);
        //System.out.println(word);

        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == ' ' && (word.charAt(i - 1) == 'y' || word.charAt(i - 1) == 'z')) {
                System.out.print(word.charAt(i - 1) + " ");
                count++;
                System.out.println(count);
            }
        }
        return count;
    }


    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : removeString("Hello there", "llo") // Should return "He there"
     * removeString("Hello there", "e") //  Should return "Hllo thr"
     * removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove) {
        String removedString = base.replace(remove, "");
        return removedString;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     * containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */


    public Boolean containsEqualNumberOfIsAndNot(String input) {
        //Iterate through string and see if "is" and "not" there.
        String is = "is";
        String not = "not";
        int numberIs = 0;
        int numberNot = 0;
        String newString = "";

        //newString = input.replaceAll("\\s", "");

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'i' && input.charAt(i + 1) == 's') {
                numberIs++;
                System.out.println("Found an Is" + numberIs);
            } else if ((input.charAt(i) == 'n' && (input.charAt(i + 1) == 'o' && input.charAt(i + 2) == 't'))) {
                numberNot++;
                System.out.println("Found a not!" + numberNot);
            } else {
                System.out.println("Next");
            }
        }
            if (numberIs == numberNot) {
                System.out.print(numberIs);
                System.out.print(numberNot);
                System.out.println("True!");
                return true;
            }
            return false;
    }


        /**
         * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
         * Return true if all the g's in the given string are happy.
         * example : gHappy("xxggxx") // Should return  true
         *           gHappy("xxgxx") // Should return  false
         *           gHappy("xxggyygxx") // Should return  false
         */
        public Boolean gIsHappy (String input) {
            String word = input;
            int count = 0;
            int lengthOf = word.length();

        for (int i = 0; i < lengthOf - 2; i++) {
            Character ch1 = new Character('g');
            Character ch2 = new Character(input.charAt(i));
            Character ch3 = new Character(input.charAt(i + 1));
            Character ch4 = new Character(input.charAt(i + 2));

            if (ch1.equals(ch2) && (ch2.equals(ch3)))
                return true;
        }
        return false;
    }


        /**
         * We'll say that a "triple" in a string is a char appearing three times in a row.
         * Return the number of triples in the given string. The triples may overlap.
         * example :  countTriple("abcXXXabc") // Should return 1
         *            countTriple("xxxabyyyycd") // Should return 3
         *            countTriple("a") // Should return 0
         */
        public Integer countTriple (String input){
            String word = input;
            int count = 0;
            int lengthOf = word.length();


            for (int i = 0; i < lengthOf - 2; i++) {
                char currentChar = word.charAt(i);
                if (currentChar == input.charAt(i + 1) && currentChar == input.charAt(i + 2)) {
                    System.out.println(input);
                    count++;
                    System.out.println(count);
                }
            }
            return count;
        }
    }
