package math.problems;

import java.util.ArrayList;

public class PrimeNumber {

    public static void main(String[] args) {
        /*
         * Find list of Prime numbers from number 2 to 1 million.
         * Try the best solution as possible.Which will take less CPU life cycle.
         * Out put number of Prime numbers on the given range.
         *
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         */
            String primeNumbers = " ";
        ArrayList<Integer> myLIst = new ArrayList<Integer>();
        databases.ConnectToSqlDB connect = new databases.ConnectToSqlDB();

            for (int i=1; i<=1000000; i++){
                int counter =0;
                for (int n=i;n>=1;n--){
                    if (i%n==0){
                        counter++;
                    }
                    if(counter ==2){
                        myLIst.add(i);
                        primeNumbers = primeNumbers + i + " ";
                    }
                }

            }
            connect.insertDataFromArrayListToSqlTable(myLIst, "PrimeNumbers", "PrimeNumbers");

    }

}
