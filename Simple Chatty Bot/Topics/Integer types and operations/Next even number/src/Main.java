import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            num += 2;
        } else {
            num += 1;
        }
        System.out.println(num);
    }
}