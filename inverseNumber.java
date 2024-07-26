import java.util.Scanner;

public class inverseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int inverted =0;
        int original_place = 1;
        while (n != 0) {
            int original_digit = n % 10;
            int inverted_digit = original_place;
            int inverted_place = original_digit;

            inverted = inverted + inverted_digit * (int)Math.pow(10, inverted_place-1);
            n = n/10;
            original_place++;
        }
        System.out.println(inverted);
      }
}
