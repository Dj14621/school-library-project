package books;

import javax.xml.transform.Result;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Dictionary extends Book{
    //Fields
    public static Set<Dictionary> dictionaryList = new HashSet<>();
    private String language;
    private Integer edition;
    private String esbn;

    //Constructor

    public Dictionary(String title, Integer bookID, double price, String author, String language, Integer edition, String esbn) {
        super(title, bookID, price, author);
        this.language = language;
        this.edition = edition;
        this.esbn = esbn;
    }




    //Getters and setters


    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getEdition() {
        return edition;
    }

    public void setEdition(Integer edition) {
        this.edition = edition;
    }

    public String getEsbn() {
        return esbn;
    }

    public void setEsbn(String esbn) {
        this.esbn = esbn;
    }
    //Methods
    public Integer numberOfDictionaries() {
        return 177;

    }
    //to load list of dictionaries
    public static void loadDictionaries(String filename) {
        ArrayList <String> result = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            while (br.ready()) {
                result.add(br.readLine());
            }
            for (int i =0; i<= result.size() -1; i++) {

                String[] line = result.get(i).split(",");
                Dictionary dictionary1 = new Dictionary(line[0], Integer.parseInt(line[1]), Double.parseDouble(line[2]), line[3], line[4], Integer.parseInt(line[5]), line[6]);
                Dictionary dictionary2 = new Dictionary(line[0], Integer.parseInt(line[1]), Double.parseDouble(line[2]), line[3], line[4], Integer.parseInt(line[5]), line[6]);
                Dictionary dictionary3 = new Dictionary(line[0], Integer.parseInt(line[1]), Double.parseDouble(line[2]), line[3], line[4], Integer.parseInt(line[5]), line[6]);
                Dictionary dictionary4 = new Dictionary(line[0], Integer.parseInt(line[1]), Double.parseDouble(line[2]), line[3], line[4], Integer.parseInt(line[5]), line[6]);
                System.out.println(result.toString());

                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
