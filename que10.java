import java.util.Scanner;
public class que10 {
    public static void main(String args[]) {
        Scanner jv = new Scanner(System.in);
        int oddcount = 0;
        int evencount = 0;
        for (int i = 0; i < 5; i++) {
            int num = jv.nextInt();
                if (num % 2 == 0){
                    evencount++;
            }
            else
            {
                    oddcount++;
            }
        }
        System.out.println(oddcount);
        System.out.println(evencount);
    }
}
