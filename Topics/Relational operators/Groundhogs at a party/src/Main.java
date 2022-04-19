import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int peanutButterCups = Integer.parseInt(scanner.next());
        boolean isItAWeekend = Boolean.parseBoolean(scanner.next());

        if (peanutButterCups >= 10 && peanutButterCups <= 20 && !isItAWeekend) {
            System.out.println(true);
        } else {
            System.out.println(peanutButterCups >= 15 && peanutButterCups <= 25 && isItAWeekend);
        }
    }
}
