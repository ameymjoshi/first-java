package amey.puzzles;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Puzzle1 {
    
    /*
    Trolls are attacking your comment section!
    A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
    Your task is to write a function that takes a string and return a new string with all vowels removed.
    */
    static Scanner scan;
    public static void main(String[] args) {
        
        scan = new Scanner(System.in);
        String inputComment = scan.nextLine();
        String result = replaceVowel(inputComment);
        System.out.println(result);
        //String finalResult = cleanUp(result);
        //System.out.println(finalResult);
        scan.close();
    }

    private static String replaceVowel(String inputComment) {
        char[] inputUnderTest = inputComment.toCharArray();
        StringBuilder sb = new StringBuilder().append(inputComment);
        for(int counter=0; counter<=(inputComment.length()-1);counter++){
            if(inputUnderTest[counter]=='a' ||
                inputUnderTest[counter]=='e' ||
                inputUnderTest[counter]=='i' ||
                inputUnderTest[counter]=='o'||
                inputUnderTest[counter]=='u'){
                sb.setCharAt(counter,'*');
            }
        }

        return sb.toString();
    }

    private static String cleanUp(String result) {
        StringBuilder sb = new StringBuilder(result);
        //StringBuilder sb1 = new StringBuilder(result);
        char[] starString = result.toCharArray();
        for(int i=0;i<=(sb.length()-1);i++){
            if(starString[i]=='*'){
                sb.deleteCharAt(i);
            }
        }
        return sb.toString();
    }
}
