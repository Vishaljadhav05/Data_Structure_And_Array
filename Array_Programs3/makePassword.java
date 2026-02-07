package Array_Programs3;

import java.util.Scanner;

// Write a program to genrate password(1. Simple ,2. Strong name and DOB in array)
//-> Take name and DOB from user and genrate password using array.
// -> First 2 character must be VJ 


//Output :-
// Enter your name:
// Ramesh
// Enter your DOB (dd-mm-yyyy):
// 01-01-1990   

public class makePassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your DOB (yyyy):");
        String dob = sc.nextLine();

        // Generate password
        char c = name.charAt(0);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            String newName = name.substring(0, 1);
            String password = "VJ" + newName + dob.replaceAll("-", "");
            System.out.println("Generated Password: " + password);
        }
        else {
            char c1 = name.charAt(0);
            char c2 = name.charAt(name.length() - 1);

            String newName = "" + c1 + c2;
            String password = "VJ" + newName + dob.replaceAll("-", "");
            System.out.println("Generated Password: " + password);
        }
        sc.close();
    }
}
