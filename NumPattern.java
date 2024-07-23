import java.util.Scanner;

public class NumPattern {
    public static void main(String[] args) {
        System.out.println("Enter Number For Row");
        int n;// number of rows
        Scanner ref = new Scanner(System.in);
        n = ref.nextInt();
        // print the pattern
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // print numbers in reverse order
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}