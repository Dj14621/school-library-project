package librarian;

import members.Member;
import members.Staff;
import members.Student;
import java.io.IOException;
import java.util.Scanner;

public class Login {
    public static void signIn(){

        Scanner input = new Scanner(System.in);
        System.out.println("Please login to the station\n");
       // String userID = "";
       // String password = "";
        System.out.println("Enter userID: \n");
        String userID = input.nextLine();
        System.out.println("Enter password: \n");
        String password = input.nextLine();

        if(userID.equals("ma123")&& password.equals("1234")) {
            System.out.println("Thank you for login");
        }else {
            System.out.println("Invalid UserId or Password");
        }
    }
    public static int toDoAtLibrary() {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                 \nPlease tell me what to do at the library: Pick an option:\n
                Option 1. Pickup a book
                Option 2. Return a book
                Option 3. Pay late fees
                Option 4. Exit
                 """);
        return input.nextInt();
    }

}
