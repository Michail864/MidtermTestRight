package math.problems;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        FindLowestDifference fl = new FindLowestDifference();
        fl.sort(array1);
        fl.findMinDifference(array1);
        fl.sort(array2);
        fl.findMinDifference(array2);


    }

    public int[] sort(int[] array){
        for (int i=0; i<array.length-1; i++){
            for (int j=0; j<array.length-1;j++){
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1] = temp;
                }
            }
        }
return array;
    }

    public void findMinDifference(int [] array){
        int minDiff = array[1] - array[0];


        for (int i=2; i<array.length; i++){
            minDiff = Math.min(minDiff, array[i] - array[i-1]);

        }
        System.out.println(minDiff);

    }

}
