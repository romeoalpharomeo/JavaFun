import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class PuzzleJavaTest {
    public static void main (String[] args) {
        PuzzleJava printSumOfArray = new PuzzleJava();
        ArrayList<Integer> sumAndArrayOut = printSumOfArray.puzzleSumAndArrayGreaterThan10();
        System.out.println(sumAndArrayOut);

        PuzzleJava printShuffledAndGreaterThan5 = new PuzzleJava();
        ArrayList<String> shuffledAnd5Out = printShuffledAndGreaterThan5.shuffleAndReturnNamesGreaterThan5();
        System.out.println(shuffledAnd5Out);

        PuzzleJava printShuffledAlphabetArray = new PuzzleJava();
        ArrayList<String> shuffledAlphabetOut = printShuffledAlphabetArray.shuffleAlphabet();
        System.out.println(shuffledAlphabetOut);

        PuzzleJava printRandom55To100 = new PuzzleJava();
        ArrayList<Integer> random55To100Out = printRandom55To100.generateAndReturnRandom55To100();
        System.out.println(random55To100Out);

        PuzzleJava printRandom55To100AndSort = new PuzzleJava();
        ArrayList<Integer> random55To100SortedOut = printRandom55To100AndSort.generateAndReturnRandom55To100AndSort();
        System.out.println(random55To100SortedOut);

        PuzzleJava printRandomString = new PuzzleJava();
        String randomStringOut = printRandomString.randomString();
        System.out.println(randomStringOut);

        PuzzleJava printRandomStringArray5 = new PuzzleJava();
        ArrayList<String> randomStringArray5Out = printRandomStringArray5.randomStringArray5();
        System.out.println(randomStringArray5Out);
    
    }
}
