public class FizzBuzz {
    public String fizzBuzz(int num) {
        if (num % 3 == 0) {
            if (num % 5 == 0) {
                return "FizzBuzz";
            }
            else {
                return "Fizz";
            }
        }
        else if (num % 5 == 0) {
            if (num % 3 == 0) {
                return "FizzBuzz";
            }
            else {
                return "Buzz";
            }
        }
        else {
            String strnum = new String(num);
            return strnum;
        }
    }
}