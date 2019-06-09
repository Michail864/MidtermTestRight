package datastructure;

import java.io.*;
import java.sql.PreparedStatement;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

import static databases.ConnectToSqlDB.connect;
import static databases.ConnectToSqlDB.connectToSqlDatabase;

public class DataReader {

    public static void main(String[] args) throws IOException {


        connectToSqlDatabase();
        LinkedList <String> textList = new LinkedList<>();
        Stack<String> stack = new Stack<String>();
        String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
        String string;
        File file = new File(textFile);
        BufferedReader br = new BufferedReader(new FileReader(file));
        while((string = br.readLine())!=null){
            System.out.println(string);
            for(String s: string.split("\\s+")){
                textList.add(s);
                stack.push(s);
            }

        }
        System.out.println(textList);
        for (String str: stack){
            System.out.println(str);
            PreparedStatement prep = connect.prepareStatement("insert into words (words)"+"values(?)");
            prep.setString(1,str);
            prep.execute();

        }
        Iterator<String> itr = stack.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }





    }

}
