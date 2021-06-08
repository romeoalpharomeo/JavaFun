import java.util.Arrays;
import java.util.ArrayList;

public class BasicsTest {
    public static void main (String[] args) {
        Basics print255 = new Basics();
        int runIt = print255.printTo255();
        System.out.println(runIt);

        Basics printOdds255 = new Basics();
        int runIt2 = printOdds255.printOddsTo255();
        System.out.println(runIt2);

        Basics printSum255 = new Basics();
        int runIt3 = printSum255.printSumsTo255();
        System.out.println(runIt3);

        Basics printTheArray = new Basics();
        int[] runIt4 = printTheArray.printArray();
        System.out.println(Arrays.toString(runIt4));

        Basics printMaxOfArray = new Basics();
        int[] runIt5 = printMaxOfArray.printMaxOfArray();
        System.out.println(Arrays.toString(runIt5));

        Basics printAvgOfArray = new Basics();
        int[] runIt6 = printAvgOfArray.printAverageOfArray();
        System.out.println(Arrays.toString(runIt6));

        Basics printArrayOfOdds = new Basics();
        ArrayList<Integer> runIt7 = printArrayOfOdds.createArrayWithOdds();
        System.out.println(runIt7);

        Basics printMaxMinAvg = new Basics();
        int[] maxMinAvgArray = {1,2,3,4,10,5};
        System.out.println(printMaxMinAvg.maxMinAvgArray(maxMinAvgArray));

        Basics printGreaterThanY = new Basics();
        int numToCheck = 3;
        int[] checkArray = {2,3,4,5,6};
        ArrayList<Integer> runIt8 = printGreaterThanY.greaterThanY(numToCheck, checkArray);
        System.out.println(runIt8.size());

        Basics printSquareValues = new Basics();
        int[] squareArray = {2,3,4};
        ArrayList<Integer> runIt9 = printSquareValues.squareTheValues(squareArray);
        System.out.println(runIt9);

        Basics printReplaceNegatives = new Basics();
        int[] replaceArray = {-1,-4,2,-3,4,-5,-6};
        ArrayList<Integer> runIt10 = printReplaceNegatives.replaceNegatives(replaceArray);
        System.out.println(runIt10);

        Basics printShiftArray = new Basics();
        int[] shiftArray = {1,2,3,4,5};
        ArrayList<Integer> runIt11 = printShiftArray.shiftArrayFront(shiftArray);
        System.out.println(runIt11);

    }
}
