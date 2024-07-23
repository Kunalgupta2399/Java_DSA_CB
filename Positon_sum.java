import java.util.Scanner;

/**
 * Positon_sum
 */
public class Positon_sum {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int Odd = 0;
        int Even = 0;
        int r = 0;

        for (int m = n, i = 1; m!=0; i++, m = m/10) {
            r = m%10;
            if (i % 2 == 0) {
                Even = Even + r;
            }else{
                Odd = Odd + r;
            }
        }
        
        System.out.println("Even number is " + Even);
        System.out.println("Odd number is " + Odd);
    }


    
}