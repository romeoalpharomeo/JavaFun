public class StringManipulator {
    public String stringAndConcat(String one, String two) {
        String stringToPrint = "";
        one = one.trim();
        stringToPrint += one;
        two = two.trim();
        stringToPrint += two;
        return stringToPrint;
    }
    public Integer getIndexOrNull(String thisString, char thisChar) {
        int indexThisString = thisString.indexOf(thisChar);
        if (indexThisString == -1) {
            return null;
        }
        return indexThisString;
    }
    public Integer getIndexOrNull(String firstString, String secondString) {
        int indexFirstString = firstString.indexOf(secondString);
        if (indexFirstString == -1) {
            return null;
        }
        return indexFirstString;
    }
    public String concatSubstring(String anotherOne, int numberOne, int numberTwo, String anotherTwo) {
        if (numberOne > anotherOne.length() || numberTwo > anotherOne.length()) {
            return "Out of range.";
        }
        String stringToPrintTwo = "";
        String indexAnotherOne = anotherOne.substring(numberOne, numberTwo);
        stringToPrintTwo += indexAnotherOne;
        stringToPrintTwo += anotherTwo;
        return stringToPrintTwo;
    }
}