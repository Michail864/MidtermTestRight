package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
        int n1 =0;
        int n2 =1;
        int n3;
        int count = 39;

        for (int i=0; i<count;i++){
            n3 = n1 +n2;
            n1=n2;
            n2=n3;

        }

    }
}