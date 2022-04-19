import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var firstName = scanner.next();
        var yearsOfExperience = scanner.next();
        var cuisinePreference = scanner.next();

        System.out.print("The form for " + firstName + " is completed. We will ");
        System.out.print("contact you if we need a chef who cooks ");
        System.out.print(cuisinePreference + " dishes and has " + yearsOfExperience + " years of experience.");
    }
}
