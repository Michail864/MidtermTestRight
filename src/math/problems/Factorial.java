package math.problems;

public class Factorial {

    public int factorial (int number){
        int n = 1;
        int fact = 1;

        for (n=1; n<number;n++){

            fact = fact *n;

        }
      return fact;
    }

    public static void main(String[] args) {

        Factorial factorial = new Factorial();
        factorial.factorial(7);


    }
}
