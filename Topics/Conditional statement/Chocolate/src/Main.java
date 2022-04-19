import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String result = "YES";
        final int sizeX = scanner.nextInt();
        final int sizeY = scanner.nextInt();
        final int segments = scanner.nextInt();

        final int sizeChocolate = sizeX * sizeY;

        if (segments > sizeChocolate) {
            result = "NO";

        } else if (segments % sizeX != 0 && segments % sizeY != 0) {
            result = "NO";
        }

        System.out.println(result);

    }
}