public class Nth_Fibonacci {

    // 0,1,1,2,3,5,8,13,21,34,55..... so on;
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;
        int c=0;

        if ( n == 0){// if user enter value 0 return 0;
            System.out.println(a);
        }else if ( n == 1){//if user enter value 0 return 0;
            System.out.println(b);
        }else{ // if user enter 10;
            for (int i = 1; i < n; i++) { // loop from 1 to 9 to get 10th value
                c = a + b; // add and store in c
                // swap the value
/*intially value of a is 0 and b is 1, i am storing value of b in a
, so that i can again use a and b and store sum in c */                 
                a = b;
                b = c;
            }
        }
        System.out.println(c);
    }
}
