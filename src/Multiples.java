import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ceiling = sc.nextInt() - 1;
        System.out.println(ceiling / 3 + ceiling / 5 - ceiling / 15);
    }
}
