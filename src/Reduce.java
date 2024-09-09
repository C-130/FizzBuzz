import java.util.Scanner;

public class Reduce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(reduce(sc.nextInt()));
    }
    public static int reduce(int n){
        if (n == 0){
            return 0;
        } else if (n % 2 == 0) {
            return 1 + reduce(n / 2);
        } else {
            return 1 + reduce(n - 1);
        }
    }
}
