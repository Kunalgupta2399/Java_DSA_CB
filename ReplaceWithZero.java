public class ReplaceWithZero {
    public static void main(String[] args) {
        int n = 105;
        int copy = n;
        int multiply = 1;

        while (n > 0) {
            int digit = n % 10;
            if (digit == 0) {
                copy = copy + multiply * 5;
                System.out.println(copy);
            } 
            multiply = multiply * 10;
            System.out.println(multiply);
            n = n/10;
            System.out.println(n);
        }
        System.out.println(copy);
    }
}
