// https://medium.com/@AlexanderObregon/breaking-numbers-into-digits-with-java-logic-7ba6ec9b0e31
public class Main {
    public static void main(String[] args) {
        int number = 1234;
        System.out.println("The sum of all the digits in " + number + " is " + sumDigits(number));
    }

    public static int sumDigits(int number) {
        if(number < 0) return -1;
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number = number/ 10;
        }
        return sum;
    }
}