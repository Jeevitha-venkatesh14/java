import java.util.Scanner;
public class que7 {
    public static void main(String args[]) {
        Scanner jv = new Scanner(System.in);
        int n1 = jv.nextInt();
        int n2 = jv.nextInt();
        if (n1 % n2 == 0) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }
    }
}
