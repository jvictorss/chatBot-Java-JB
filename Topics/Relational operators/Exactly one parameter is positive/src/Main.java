import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean ad1 = a > 0 && b <= 0 && c <= 0;
        boolean ad2 = a <= 0 && b > 0 && c <= 0;
        boolean ad3 = a <= 0 && b <= 0 && c > 0;

        System.out.println(ad1 || ad2 || ad3);
    }
}