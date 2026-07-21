public class array11 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int first = arr[0];
        for (int i = 0; i < arr.length - 2; i++) {
            arr[i] = arr[i + 2];
        }
        arr[arr.length - 2] = first;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
