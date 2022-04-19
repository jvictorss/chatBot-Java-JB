import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var firstWord = scanner.nextLine();
        var secondWord = scanner.nextLine();
        var thirdWord = scanner.next();
        var fourthWord = scanner.next();

        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);
        System.out.println(fourthWord);
    }
}