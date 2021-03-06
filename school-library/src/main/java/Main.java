import books.Dictionary;
import books.Magazine;
import librarian.Librarian;
import members.Staff;
import members.Student;

import java.util.*;

import static books.Dictionary.dictionaryList;


import static books.Dictionary.loadDictionaries;
import static librarian.Librarian.collectFees;
import static librarian.Librarian.sortByKey;
import static librarian.Login.*;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Dictionary dictionary = new Dictionary("almunjid", 9876, 77.89, "Theo Morachi", "Arabic", 6, "ar8765");
        Magazine magazine = new Magazine("la femme de demain", 9845, 10.00, "Monica Salas", "Beauty", 2022);

        System.out.println("\nWelcome to Deer Park Library\n");
        signIn();

        //Objects
        Librarian librarian1 = new Librarian("ma134", "pw134");
        Librarian librarian2 = new Librarian("ma145", "pw145");


        Student student1 = new Student("S00001", "Adam", "Hara", 2012, 4, 'M');
        Student student2 = new Student("S00002", "Muad", "Nacer", 2011, 5, 'M');
        Student student3 = new Student("S00003", "Madina", "Jacobs", 2010, 6, 'F');
        Student student4 = new Student("S00004", "Rachel", "Clark", 2013, 4, 'F');

        Staff staff1 = new Staff("M001", "Maden", "Wills", 1983, "Teacher", "Teaching");
        Staff staff2 = new Staff("M002", "Chris", "Daniels", 1966, "AdminHelper", "Office");


        Dictionary dictionary1 = new Dictionary("Longman", 0001, 68.99, "Mark Smith", "English", 5, "DII093756");
        Dictionary dictionary2 = new Dictionary("Oxford", 1235, 55.00, "Dina Saria", "English to French", 4, "DI0384");
        Dictionary dictionary3 = new Dictionary("Oxford", 1835, 95.00, "Maria Saria", "English to French", 4, "DI0384");
        Dictionary dictionary4 = new Dictionary("Web", 1277, 58.00, "Dina osaka", "English to Arabic", 6, "DI0384");


        System.out.println("Welcome to Deer Park Library\n");
        System.out.println("This Librarian list: ");
        System.out.println(librarian1);
        System.out.println(librarian2);

        System.out.println("This is Student List: ");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

        System.out.println("this staff list: ");
        System.out.println(staff1);
        System.out.println(staff2);
        System.out.println("checking again");
        //To do at the library
        while (true) {
            switch (toDoAtLibrary()) {
                case 1:
                    System.out.println("Add a book");
                    //("C:\\FannieProjects\\school-library\\dictionary-load.txt");
                    dictionaryList.add(dictionary1);
                    dictionaryList.add(dictionary2);
                    System.out.println(dictionary1);
                    System.out.println(dictionary2);
                    break;
                case 2:
                    System.out.println("Return a book");
                    dictionaryList.add(dictionary3);
                    dictionaryList.add(dictionary4);
                    System.out.println(dictionary3);
                    System.out.println(dictionary4);

                    break;
                case 3:
                    System.out.println(" Collect fees");
                    System.out.println(Librarian.collectFees());
                    break;
                case 4:
                    System.out.println("Sort by keys");
                    Map<String, String> inventory = new HashMap<>();
                    ArrayList<String> sortedKeys = new ArrayList<String>(inventory.keySet());
                    inventory.put("Dictionary1", "English to English");
                    inventory.put("Dictionary2", "English to Spanish");
                    inventory.put("Magazine1", "beauty");
                    inventory.put("Storybook1", "Djurdjura landscape");
                    inventory.put("Dictionary3", "English to Arabic");
                    inventory.put("Magazine2", "Health");
                    inventory.put("Storybook2", "Dinosaur World");
                    inventory.put("Magazine3", "Sport");
                    inventory.put("Storybook3", "The club");
                    inventory.put("Magazine4", "Travel");
                    inventory.put("Dictionary", "English to English");
                    inventory.put("Storybook4", "Travel");
                    inventory.put("Magazine5", "Fitness");
                    //System.out.println(inventory.keySet());

                    Collections.sort(sortedKeys);

                    for (String X : sortedKeys)
                        System.out.println("Key = " + X + ", Value = " + inventory.get(X));

                    System.out.println(inventory.keySet());

                    break;
                case 5:
                    System.out.println("Thank you for visiting Deer Park library today!. See you next time!! ");
                    System.out.println("");
                    System.exit(0);
                default:
                    System.out.println("Enter 1-5");
            }

        }



    }

}
