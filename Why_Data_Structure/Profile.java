public class Profile {
    String name;
    String dob;
    String phone;
    String city;
    int age;

    Profile(){

    }
    
    Profile(String name,String dob, int age, String phone, String city)
    {
        this.name = name;
        this.dob = dob;
        this.phone = phone;
        this.city = city;
        this.age = age;
    }
    
    void welcome(String name)
    {
        System.out.println("Welcome " + name);
        

    }

    void displayName()
    {
        System.out.println("Welcome " + name);
        System.out.println("Age: " + age);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Phone Number: " + phone);
        System.out.println("City: " + city);
    }
}
