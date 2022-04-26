package librarian;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.*;



public class Librarian {
    //fields
    private String userId;
    private String password;

    //Constructor


    public Librarian(String userID, String password) {
        this.userId = userID;
        this.password = password;
    }

    public Librarian() {

    }

    //Getters and setters


    public String getMemberId() {
        return userId;
    }

    public void setMemberId(String memberId) {
        this.userId = memberId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //Methods
    public String checkOutBooks() {
        return checkOutBooks();
    }
    public static double collectFees() {
        double[] weeklyFees = new double[5];
        weeklyFees[0] = 14.00;
        weeklyFees[1] = 20.00;
        weeklyFees[2] = 6.50;
        weeklyFees[3] = 17.00;
        weeklyFees[4] = 25.00;
        double sum = 0;
        for (int i=0; i <5; i++) {
            sum = sum + weeklyFees[i];
        }
        System.out.println(sum);
        return sum;
    }

    public static boolean sortByKey () {
        Map<String, String> inventory = new HashMap<>();
       ArrayList<String> sortedKeys = new ArrayList<String>(inventory.keySet());
//        inventory.put("Dictionary1", "English to English");
//        inventory.put("Dictionary2", "English to Spanish");
//        inventory.put("Magazine1", "beauty");
//        inventory.put("Storybook 1", "Djurdjura landscape");
//        inventory.put("Dictionary3", "English to Arabic");
//        inventory.put("Magazine2", "Health");
//        inventory.put("Storybook2", "Dinosaur World");
//        inventory.put("Magazine3", "Sport");
//        inventory.put("Storybook3", "The club");
//        inventory.put("Magazine4", "Travel");
//
        Collections.sort(sortedKeys);
        for (String X : sortedKeys)
            System.out.println("Key = " + X + ", Value = " + inventory.get(X));
        return sortByKey();
    }


    //ToString


    @Override
    public String toString() {
        return "Librarian{" +
                "userID='" + userId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
