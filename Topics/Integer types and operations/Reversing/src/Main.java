import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int reverse = 0;

        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }

        System.out.println(reverse);
        // put your code here
    }
}