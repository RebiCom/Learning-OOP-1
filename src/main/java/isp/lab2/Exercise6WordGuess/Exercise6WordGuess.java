package isp.lab2.Exercise6WordGuess;

import java.util.Scanner;

public class Exercise6WordGuess {

    /**
     * This method will return the number of occurrences of a character in a word
     *
     * @param c
     * @param word
     * @return
     */
    public static int[] getOccurrencePositions(char c, char[] word)
    {
        int count = 0;
        for (char value : word)
        {
            if (value == c)
                count++;
        }
        int[] positions = new int[count];
        int j = 0;
        for (int i = 0; i < word.length; i++) {
            if (word[i] == c) {
                positions[j++] = i;
            }
        }
        return positions;

    }

    public static void main(String[] args) {
        // Înlocuiesc null cu un cuv real si il salvez ca String pt comparare
        String selectedWord = "programare";
        char[] word = selectedWord.toCharArray();
        char[] progress = new char[word.length];
        for (int i = 0; i < progress.length; i++) progress[i] = '_';

        boolean solved = false;
        Scanner scanner = new Scanner(System.in);

        int tries = 0;
        while (tries < 10 && !solved) {
            System.out.println("Enter a letter: ");
            String input = scanner.nextLine();

            if (input.isEmpty()) continue;
            char letter = input.charAt(0);

            int[] occurrences = getOccurrencePositions(letter, word);
            if (occurrences.length > 0) {
                System.out.println("Correct! Letter '" + letter + "' found at positions: " + java.util.Arrays.toString(occurrences));

                for (int pos : occurrences) //actualizez cu litera ghicita
                {
                    progress[pos] = letter;
                }
            } else
            {
                System.out.println("Letter '" + letter + "' is not in the word.");
            }
            System.out.println("Current progress: " + String.valueOf(progress));
            if (String.valueOf(progress).equals(selectedWord))
            {
                solved = true;
            }
            tries++;
        }

        if (solved) {
            System.out.println("\nCongratulations! You guessed the word: " + selectedWord);
            System.out.println("Total tries: " + tries);
        } else {
            System.out.println("\nGame over! You used all tries. The word was: " + selectedWord);
        }
    }
    }
