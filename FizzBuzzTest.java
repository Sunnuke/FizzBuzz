public class FizzBuzzTest {
    public static void fizzBuzzTest(String[] args) {
        FizzBuzz str = new FizzBuzz();
        String fb1 = str.fizzBuzz(6);
        String fb2 = str.fizzBuzz(10);
        String fb3 = str.fizzBuzz(30);
        String fb4 = str.fizzBuzz(11);
        System.out.println("Test 1: 6 = " + fb1);
        System.out.println("Test 2: 10 = " + fb2);
        System.out.println("Test 3: 30 = " + fb3);
        System.out.println("Test 4: 11 = " + fb4);
    }
}