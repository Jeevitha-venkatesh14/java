public class array15 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 9, 6};
        int Evencount = 0;
        int oddcount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                Evencount++;
            }
           else if (arr[i] % 2 != 0) {
                oddcount++;
            }
        }
        System.out.println("EVEN count = " + Evencount);
        System.out.print("ODD count =" + oddcount);
    }
}