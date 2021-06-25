package amey.puzzles;

import java.util.Scanner;

public class Puzzle1 {
    
    /*
    Trolls are attacking your comment section!
    A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
    Your task is to write a function that takes a string and return a new string with all vowels removed.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String result = replaceVowel(scan.nextLine());
        System.out.println(result);
        scan.close();
    }

    public static String replaceVowel(String nextLine) {
        char[] inputStr = nextLine.toCharArray();
        StringBuilder inputStrCopy = new StringBuilder(nextLine);
        for (int i=0;i<inputStr.length;i++) {
            if(charMatchesVowel(inputStr[i])){
                inputStrCopy.deleteCharAt(i);
                inputStr = inputStrCopy.toString().toCharArray();
                i--;                
            }
        }
        return inputStrCopy.toString();
    }

    private static boolean charMatchesVowel(char c) {
        if(c=='a' || c=='e' || c=='i' ||c=='o' ||c=='u' ||
            c=='A' || c=='E' || c=='I' ||c=='O' ||c=='U'){
                return true;
            }
        return false;
    }
}
