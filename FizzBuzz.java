public class FizzBuzz {
    public String fizzBuzz(int number) {
        // fizzbuzz logic here
        String stringToPrint = "";
        if (number % 3 != 0 && number % 5 != 0) {
            stringToPrint += number;
        }
        if (number % 3 == 0) {
            stringToPrint += "Fizz";
        }
        if (number % 5 == 0) {
            stringToPrint += "Buzz";
        }
        return stringToPrint;
    }
}

