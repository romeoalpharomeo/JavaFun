import java.util.Arrays;
import java.util.ArrayList;

public class Basics {
    public Integer printTo255() {
        int i = 1;
        while (i<255) {
            System.out.println(i);
            i++;
        }
        return i;
    }

    public Integer printOddsTo255() {
        int i = 1;
        while (i<255) {
            if (i % 2 != 0)
            System.out.println(i);
            i++;
        }
        return i;
    }

    public Integer printSumsTo255() {
        int sum = 0;
        for (int i = 0; i < 255; i++) {
            System.out.println("New Number:" + i);
            sum += i;
            System.out.println("sum: " + sum);
            
        }
        return sum;
        
    }

    public int[] printArray() {
        int[] myArray = {1,3,5,7,9,13};
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        return myArray;
    }

    public int[] printMaxOfArray() {
        int[] myArray = {-1,3,-5,-7,-9,-13};
        int arrayMax = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            // arrayMax = myArray[i];
            if (myArray[i] > arrayMax) {
                arrayMax = myArray[i];
            }
        }
        System.out.println(arrayMax);
        return myArray;
    }

    public int[] printAverageOfArray() {
        int[] myArray = {2,10,3,6};
        double sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        double arrayAverage = sum / myArray.length;
        System.out.println(arrayAverage);
        return myArray;
    }

    public ArrayList<Integer> createArrayWithOdds() {
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        int i = 0;
        for (i = 0; i <= 255; i++) {
            if (i % 2 != 0)
            myArray.add(i);
        }
        return myArray;
    }

    public ArrayList<Integer> greaterThanY(int target, int[] array) {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > target) {
                newArray.add(array[i]);
            }
        }
        return newArray;

    }

    public ArrayList<Integer> squareTheValues(int[] array) {
        ArrayList<Integer> sqArray = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            int square = array[i] * array[i];
            sqArray.add(square);
        }
        return sqArray;

    }

    public ArrayList<Integer> replaceNegatives(int[] array) {
        ArrayList<Integer> zeroArray = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                zeroArray.add(0);
            }
            else {
                zeroArray.add(array[i]);
            }
        }
        return zeroArray;

    }

    public ArrayList<Object> maxMinAvgArray(int[] myArray) {
        ArrayList<Object> list = new ArrayList<Object>();
        int max = myArray[0];
        int min = myArray[0];
        double sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
            if (myArray[i] > max) {
                max = myArray[i];
            }
            if (myArray[i] < min) {
                min = myArray[i];
            }
        }
        double avg = sum / myArray.length;
        list.add(max);
        list.add(min);
        list.add(avg);
        return list;

    }

    public ArrayList<Integer> shiftArrayFront (int[] array) {
        ArrayList<Integer> shftArray = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            shftArray.add(array[i]);
    }
        shftArray.remove(0);
        shftArray.add(0);
        return shftArray;
}
}