package datastructure;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import static databases.ConnectToSqlDB.connectToSqlDatabase;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

    String query = "insert into test(name)" + "values (?)";

        ArrayList<String> myList = new ArrayList<String>();

        myList.add("Hello");
        myList.add("My");
        myList.add("Name");
        myList.add("Is");
        myList.add("Apu");

        myList.remove("Apu");
        myList.add("Mike");


        for (String item : myList){
            System.out.println(item);


        }
        int count =0;
        while (myList.size()>count){
            System.out.println(myList.get(count));
            count++;

        }

        connectToSqlDB.insertDataFromArrayToSqlTable(myList, "arrayListExample", "words");

        List<String> newList = connectToSqlDB.readDataBase("arrayListExample", "words");



    }

}
