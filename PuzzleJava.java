import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class PuzzleJava {
    public ArrayList<Integer> puzzleSumAndArrayGreaterThan10() {
        ArrayList<Integer> greaterThan10Array = new ArrayList<Integer>();
        int sum = 0;
        int[] array = {3,5,1,2,7,9,8,13,25,32};
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (array[i] > 10) {
                greaterThan10Array.add(array[i]);
            }
        }
        System.out.println(sum);
        return greaterThan10Array;
    }

    public ArrayList<String> shuffleAndReturnNamesGreaterThan5() {
        ArrayList<String> shuffledArray = new ArrayList<String>();
        ArrayList<String> greaterThan5Array = new ArrayList<String>();
        String[] array = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        for (int i = 0; i < array.length; i++) {
            shuffledArray.add(array[i]);
            if (array[i].length() > 5) {
                greaterThan5Array.add(array[i]);
            }
        }
        Collections.shuffle(shuffledArray);
        System.out.println(shuffledArray);
        return greaterThan5Array;
    }

    public ArrayList<String> shuffleAlphabet() {
        ArrayList<String> shuffledAlphabetArray = new ArrayList<String>();
        // ArrayList<String> greaterThan5Array = new ArrayList<String>();
        String[] array = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        for (int i = 0; i < array.length; i++) {
            shuffledAlphabetArray.add(array[i]);
        }
        Collections.shuffle(shuffledAlphabetArray);
        String first = shuffledAlphabetArray.get(0);
        String last = shuffledAlphabetArray.get(shuffledAlphabetArray.size() - 1);
        if (first == "A" || first == "E" || first == "I" || first == "O" || first == "U" || first == "Y") {
            System.out.println("This is a vowel");
        }
        else {
            System.out.println(first);
        }
        System.out.println(last);
        return shuffledAlphabetArray;
    }

    public ArrayList<Integer> generateAndReturnRandom55To100() {
        ArrayList<Integer> random55To100Array = new ArrayList<Integer>();
        int numberOfValues = 10;
        int min = 55;
        int max = 100;
        int i = 0;
        while (i < numberOfValues) {
            double valueToAdd = Math.floor(Math.random()*(max-min+1)+min);
            // Here, we type casted from double to int so that we could display an array list of integers instead of doubles
            int replaceDouble = (int) valueToAdd;
            random55To100Array.add(replaceDouble);
            i++;
        }
        return random55To100Array;
    }

    public ArrayList<Integer> generateAndReturnRandom55To100AndSort() {
        ArrayList<Integer> random55To100ArraySorted = new ArrayList<Integer>();
        int numberOfValues = 10;
        int minRandom = 55;
        int maxRandom = 100;
        int i = 0;
        while (i < numberOfValues) {
            double valueToAdd = Math.floor(Math.random()*(maxRandom-minRandom+1)+minRandom);
            // Here, we type casted from double to int so that we could display an array list of integers instead of doubles
            int replaceDouble = (int) valueToAdd;
            random55To100ArraySorted.add(replaceDouble);
            i++;
        }
        // Here, we sorted our reandomized array
        Collections.sort(random55To100ArraySorted);
        // Here, we set up our variables and conditionals for getting the max and min values from our sorted array
        int maxArray = random55To100ArraySorted.get(0);
        int minArray = random55To100ArraySorted.get(0);
        for (int j = 0; j < numberOfValues; j++) {

            if (random55To100ArraySorted.get(j) > maxArray) {
                maxArray = random55To100ArraySorted.get(j);
            }
            if (random55To100ArraySorted.get(j) < minArray) {
                minArray = random55To100ArraySorted.get(j);
            }
        }
        System.out.println(maxArray);
        System.out.println(minArray);
        return random55To100ArraySorted;
    }

    public String randomString() {
        ArrayList<String> shuffledAlphabetArray = new ArrayList<String>();
        String[] array = {"A", "G", "B", "X", "N", "Q"};

        for (int i = 0; i < 5; i++) {
            shuffledAlphabetArray.add(array[i]);
        }
        // This shuffles our string array
        Collections.shuffle(shuffledAlphabetArray);
        String stringToPrint = "";
        // This creates a string out of our shuffled array
        for (int j = 0; j < 5; j++) {
            stringToPrint += shuffledAlphabetArray.get(j);
        }

        // System.out.println(shuffledAlphabetArray);
        return stringToPrint;
    }

    public ArrayList<String> randomStringArray5() {
        // This is our ArrayList that we will add our array values to in order to shuffle/randomize them and generate random strings from
        ArrayList<String> shuffledAlphabetArray = new ArrayList<String>();
        // This is the ArrayList that we will be adding our random strings to late
        ArrayList<String> randomStringArray5 = new ArrayList<String>();
        // This array contains the characters we will be working off of to make our random strings
        String[] array = {"A", "G", "B", "X", "N", "Q"};
        // This loop creates the array that we will shuffle soon
        for (int i = 0; i < 5; i++) {
            shuffledAlphabetArray.add(array[i]);
        }

        // This string will be added to later and once it contains 5 characters, it will be added to the randomStringArray5 ArrayList
        String stringToPrint = "";
        // This loop is set up to add our random strings to the ArrayList that is storing them (indicated above in notes) 
        for (int q = 0; q < 10; q++) {
            // Here, we are finally shuffling the ArrayList that we created earlier, it is inside the loop so that we get a new random string on each iteration
            Collections.shuffle(shuffledAlphabetArray);
            // We need to clear the stringToPrint variable each iteration, so, we set it as empty again here
            stringToPrint = "";
            // This loop is creating the random string by adding to our empty string until 5 characters is reached
            for (int j = 0; j < 5; j++) {
            stringToPrint += shuffledAlphabetArray.get(j);
            }
        // This is adding our 5 character random strings to our ArrayList, notice the placement, it is inside the 10 iteration loop but outside of the 5 iteration loop. The nested loop is setup so that we create a string with 5 character(5 iterations) and add those 5 character long strings to the ArrayList(10 iterations)
        randomStringArray5.add(stringToPrint);
        }
        return randomStringArray5;
    }
}

