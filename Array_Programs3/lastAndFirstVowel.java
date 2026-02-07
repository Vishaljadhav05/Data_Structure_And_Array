package Array_Programs3;

// WAP to Store 10 different words in a single dimensional array. Then display all such tokens which begins and ends with vowels.
// Example:
//  umbrella 
// table 
// computer 
// agenda 
 
//Output:
//  umbrella
//  agenda
public class lastAndFirstVowel {
    public static void main(String[] args) {
        String[] words = {"umbrella", "table", "computer", "agenda", "orange", "elephant", "ice", "apple", "orange", "unique"};
        String vowels = "aeiouAEIOU";
        
        for (String word : words) {
            if (vowels.indexOf(word.charAt(0)) != -1 && vowels.indexOf(word.charAt(word.length() - 1)) != -1) {
                System.out.println(word);
            }
        }
    }
}
