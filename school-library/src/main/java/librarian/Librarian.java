package librarian;

import java.util.*;



public class Librarian {
    //fields
    private String userID;
    private String password;

    //Constructor


    public Librarian(String userID, String password) {
        this.userID = userID;
        this.password = password;
    }

    public Librarian() {

    }

    //Getters and setters

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
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

    public static void sortByKey () {
        Map<String, String> inventory = new HashMap<>();
        ArrayList<String> sortedKeys = new ArrayList<String>(inventory.keySet());
        inventory.put("Dictionary1", "kdjew");
        inventory.put("Dictionary2", "ksjhw");
        inventory.put("Magazine1", "jxndge");
        inventory.put("Storybook 1", "nxmke");
        inventory.put("Dictionary3", "lsnje");
        inventory.put("Magazine2", "lsnje");
        inventory.put("Storybook2", "lsnje");
        inventory.put("Magazine3", "lsnje");
        inventory.put("Storybook3", "lsnje");
        inventory.put("Magazine4", "lsnje");
        Collections.sort(sortedKeys);
        for (String X : sortedKeys)
            System.out.println("Key = " + X + ", Value = " + inventory.get(X));
    }
   // public static void main(String[] args){
//           int sum=0;
//
//           Map<String, String> invent = new HashMap<>();
//           invent.put("Jayant", "kdjew");
//           invent.put("Abhishek", "ksjhw");
//           invent.put("Anushka", "jxndge");
//           invent.put("Amit", "nxmke");
//           invent.put("Danish", "lsnje");
//
//           System.out.println(invent);
//           for (int i=0; i<invent.size();i++){
//               sum=sum+1;
//           }
//        System.out.println("The total books are : "+sum);
       //}



    //ToString


    @Override
    public String toString() {

        return "Librarian{" +
                "userID='" + userID + '\'' +
                ", password='" + password + '\'' +
                '}';

    }

}
