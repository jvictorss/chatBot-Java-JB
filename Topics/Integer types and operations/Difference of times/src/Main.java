import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int min = 60;
        int hourIn = scanner.nextInt();
        int minIn = scanner.nextInt();
        int secIn = scanner.nextInt();
        int hourOut = scanner.nextInt();
        int minOut = scanner.nextInt();
        int secOut = scanner.nextInt();
        int fullSecIn = (hourIn * min) * min;
        int fullSecOut = (hourOut * min) * min;
        int fullMinIn = minIn * min;
        int fullMinOt = minOut * min;
        int fullSecPrint = fullSecIn + fullMinIn + secIn;
        int fullSecPrintot = fullSecOut + fullMinOt + secOut;
        int difTime = fullSecPrintot - fullSecPrint;
        System.out.print(difTime);
    }
}