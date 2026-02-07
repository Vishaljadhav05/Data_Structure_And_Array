package Array_Programs3;

import java.util.Scanner;

//WAP to take input multiple Strings in an array and convert them to uppercase and print the pairs of vowels occuring in the string.

// Exmaple :-
// Enter the number of strings:
// 2
// Enter string 1: beautiful
// Enter string 2: beauties

// Output :-
// String 1: BEAUTIFUL
// Vowel pairs in String 1: ea, ui
// String 2: BEAUTIES
// Vowel pairs in String 2: ea, ui, ie

public class UppercaseVowelPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter string " + (i + 1) + ":");
            strings[i] = sc.nextLine();
        }
        
        for (int i = 0; i < n; i++) {
            String upperCaseString = strings[i].toUpperCase();
            System.out.println("String " + (i + 1) + ": " + upperCaseString);
            
            String vowels = "AEIOU";
            StringBuilder vowelPairs = new StringBuilder();
            
            for (int j = 0; j < upperCaseString.length() - 1; j++) {
                char c1 = upperCaseString.charAt(j);
                char c2 = upperCaseString.charAt(j + 1);
                
                if (vowels.indexOf(c1) != -1 && vowels.indexOf(c2) != -1) {
                    if (vowelPairs.length() > 0) {
                        vowelPairs.append(", ");
                    }
                    vowelPairs.append(c1).append(c2);
                }
            }
            
            System.out.println("Vowel pairs in String " + (i + 1) + ": " + vowelPairs.toString());
        }

        sc.close();
    }
}
