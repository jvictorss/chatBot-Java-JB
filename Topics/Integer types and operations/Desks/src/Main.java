import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students;
        int chairs = 0;

        while (scanner.hasNext()) {
            students = scanner.nextInt();
            chairs += students / 2 + students % 2;
        }

        System.out.println(chairs);
    }
}