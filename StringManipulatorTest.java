public class StringManipulatorTest {
    public static void main (String[] args) {
        StringManipulator test = new StringManipulator();
        String testArgs = test.stringAndConcat("  Hello  ", "  World  ");
        System.out.println(testArgs);

        StringManipulator manipulator = new StringManipulator();
        char letter = 'o';
        Integer a = manipulator.getIndexOrNull("Coding", letter);
        Integer b = manipulator.getIndexOrNull("Hello World", letter);
        Integer c = manipulator.getIndexOrNull("Hi", letter);
        System.out.println(a); // 1
        System.out.println(b); // 4
        System.out.println(c); // null

        StringManipulator manipulatorTwo = new StringManipulator();
        String word = "Hello";
        String subString = "lo";
        String notSubString = "friend";
        Integer d = manipulatorTwo.getIndexOrNull(word, subString);
        Integer e = manipulatorTwo.getIndexOrNull(word, notSubString);
        System.out.println(d); // 2
        System.out.println(e); // null

        StringManipulator manipulator3 = new StringManipulator();
        String word2 = manipulator3.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word2); // eworld
    }
}