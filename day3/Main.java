import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int i = 2;
        while (i <= N) {
            System.out.println(i);
            i += 2;
        }
    }
}
