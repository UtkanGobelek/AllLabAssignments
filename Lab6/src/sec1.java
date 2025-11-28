import java.util.Scanner;
public class sec1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1000 + i;
        }
        System.out.println("current roster size is 20, enter the new roster size");
        int input = sc.nextInt();
        int[] larger = new int[input];
        for (int i = 0; i < arr.length; i++) {
            larger[i] = arr[i];
            System.out.println(arr[i]);
        }
        for (int i = 0; i < larger.length; i++) {
            System.out.println("the larger roster id's" + larger[i]);
        }

    }
}
