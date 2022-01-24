import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gr1 = scanner.nextInt();
        double gr2 = scanner.nextInt();
        double gr3 = scanner.nextInt();
        gr1 = Math.ceil(((gr1 / 2)));
        gr2 = Math.ceil(((gr2 / 2)));
        gr3 = Math.ceil(((gr3 / 2)));

        int total = (int) Math.ceil(((gr1) + (gr2) + (gr3)));

        System.out.println(total);
    }
}