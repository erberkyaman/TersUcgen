import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayısını Giriniz : ");
        int n = input.nextInt();

        for (int i = n - 1; i >= 1; i--) {

            for (int a = 1; a <= (n - i); a++) {
                System.out.print(" ");
            }
            for (int b = 1; b <= (2 * i) - 1; b++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
