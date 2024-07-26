import java.util.Scanner;

public class Positon_sum {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int Odd = 0; // to get odd number
        int Even = 0; // to get even number
        int r = 0; // to get remainder


        // declare m because don't want to change the original value of n.
        // starts i from 1.
        // Loop will run till m is not equal to 0.
        // increment i.
        // Then decrement the number.
        for (int m = n, i = 1; m!=0; i++, m = m/10) { 
            // get remainder and check if remainder is divisible by 2 then add to even.
            r = m%10;
            if (i % 2 == 0) {
                Even = Even + r;
            }else{
                // Else the number is odd and add reminder to ODD.
                Odd = Odd + r;
            }
        }
        
        System.out.println("Even number is " + Even);
        System.out.println("Odd number is " + Odd);
    }


    
}