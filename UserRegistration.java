import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Programme");
        //UC1
        /*First name starts with Cap and has minimum 3 characters*/
        System.out.println("Enter your FirstName :");
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        String regex1 = "^([A-Z]{1}+[a-z]{2,})$";
        Pattern p1 = Pattern.compile(regex1);
        Matcher m1 = p1.matcher(firstName);
        boolean result1 = m1.matches();
        if (result1 == true) {
            System.out.println("Valid");
        } else {
            System.out.println("please enter a Valid name");
        }
    }
}
