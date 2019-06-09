package math.problems;


public class FindMissingNumber {

    public static void main(String[] args) {


        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        System.out.println(missingNumber(array));

    }

    public static int missingNumber(int [] arr){
        int n = 10;
        int total = n*(n +1)/2;
        int total1 =0;
        for (int i=0;i<arr.length; i++){
            total1 +=arr[i];
        }
        int missingNumb = total - total1;
        return missingNumb;
    }
}
