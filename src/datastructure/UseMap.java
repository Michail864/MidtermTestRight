package datastructure;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

import static databases.ConnectToSqlDB.connect;
import static databases.ConnectToSqlDB.connectToSqlDatabase;

public class UseMap {

    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {

        List <String> list = new ArrayList<String>();
        list.add("Mike");
        list.add("John");
        list.add("Kyle");
        Map <String, List<String>> map = new HashMap<String, List<String>>();
        map.put("freshmen",list);


        Iterator<String> itr1 = map.keySet().iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
        Iterator<List<String>>itr = map.values().iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

     connectToSqlDatabase();
        for (String key:map.keySet()){
            System.out.println(key);

            PreparedStatement prep = connect.prepareStatement("insert into study (students)" + "values (?)");
            prep.setString(1, key);
            prep.execute();
        }
        for (List<String> key: map.values()){
            System.out.println(key);
            PreparedStatement prep = connect.prepareStatement("insert into study (name)" + "values (?)");
            prep.setString(2, key);
            prep.execute();
        }



    }

}
