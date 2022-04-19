import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int ano = scanner.nextInt();

        if (ano >= 1900 && ano <= 3000) {
            if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
                System.out.println("Leap");
            } else {
                System.out.println("Regular");
            }
        }
    }
}