import java.util.Scanner;

public class coutDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int check_number = scn.nextInt();
        int count =0;
        for (int i = 0; i < n; i++) {
            if( check_number == n){
                count++;
                break;
            }else{
                System.out.println("no found");
            }
        }
    }
}
