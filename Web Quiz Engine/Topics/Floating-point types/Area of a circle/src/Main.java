import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        final double  pi = Math.PI;
        double s = pi*r*r;
        System.out.println(s);
    }
}