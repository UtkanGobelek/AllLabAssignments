import java.util.Random;
public class sec2 {
    public static int[] moveOneToTheRight(int[] array){
        int length = array.length;
        int last = array[length - 1];

        for (int i = length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = last;
        return array;
    }
    public static void main(String[] args){
        Random rand = new Random();
        int size = rand.nextInt(11) + 10;
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = rand.nextInt(100);
        }

        for ( int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i] + " before");
        }

        int[] newArray = moveOneToTheRight(numbers);

        for ( int i = 0; i < newArray.length; i++){
            System.out.println(newArray[i] + " after");
        }

    }
}
