package SetsAndMaps;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountLettersExercise {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Java source file: ");
        String filename = input.nextLine();

        File file = new File(filename);
        if (file.exists()) {
            System.out.println("The filename " + filename
                    + " has " + countVowels(file) + " vowels and " + countConsonants(file) + " consonants.");
        } else {
            System.out.println("File " + filename + " does not exist");
        }
    }


    public static int countVowels(File file) throws Exception {
        Set<Character> vowelSet = new HashSet<Character>(Arrays.asList('A', 'E', 'I', 'O', 'U'));
        System.out.println(vowelSet);
        int countVowels = 0;


        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            char[] word1 = input.next().toCharArray();

            for (int i = 0; i < word1.length; i++) {
                if (vowelSet.contains(Character.toUpperCase(word1[i]))) {
                    countVowels++;
                }
            }
        }

        return countVowels;

    }

    public static int countConsonants(File file) throws Exception {
        // Array of all Java keywords + true, false and null
        /*String keywordVowels = "AEIOUaeiou";
        char[] stringToCharArray = keywordVowels.toCharArray();*/
        /*System.out.println(stringToCharArray);*/

        Set<Character> vowelSet = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U'));
        int countConsonants = 0;

        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            char[] word1 = input.next().toCharArray();

            for (int i = 0; i < word1.length; i++) {
                if (!vowelSet.contains(Character.toUpperCase(word1[i]))&& Character.isAlphabetic(word1[i])) {
                    countConsonants++;
                }
            }
        }

        return countConsonants;

    }


}
