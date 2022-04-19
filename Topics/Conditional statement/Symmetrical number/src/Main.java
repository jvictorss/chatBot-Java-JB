import java.util.Objects;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String verify = scanner.nextLine();
        String reverse = new StringBuilder(verify).reverse().toString();

        if (Objects.equals(verify, reverse)) {
            System.out.println("1");
        } else {
            System.out.println("9");
        }
    }
}