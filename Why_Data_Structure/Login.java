import java.util.Scanner;

public class Login {

    public static void main(String[] args) 
    {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter email id: ");
        String email = s.next();
        System.out.println("Enter password: ");
        String pass = s.next();

        if (email.equals("admin@gmail.com") && pass.equals("admin123")) 
        {
            String name = "Vishal"; //This name must come from database
            String dob = "01-01-2026";
            String city = "Indore";
            String phoneNo = "0123456789";
            int age = 20;

            Profile p = new Profile(name, dob, age, phoneNo,city);
            p.welcome(name);
            p.displayName();
            
        }
        else
        {
            System.out.println("Invalid Login");
        }


        s.close();
    }
}