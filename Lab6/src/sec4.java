import java.util.Random;
public class sec4 {
    static void main(String[] args){
        Random rand = new Random();
        int[] array = new int[30];
        int size = array.length;
        int[] rando100 = new int[100];
        for (int i = 0; i < 30; i++) {
            rando100[i] = rand.nextInt(100);
        }
        for (int i = 0; i < size; i++) {
            array[i] = rando100[i];
        }
        int peaknum =0;
        int tallestPeak =0;
        for (int i = 0; i < size ; i++) {
            System.out.print(array[i]);
            if(i==0 && array[i] > array[i + 1]){
                System.out.print(" peak");
                peaknum++;
                if( array[i] > tallestPeak) tallestPeak =array[i];
            }  else if (i == (size -1) && array[i] > array[i - 1]) {
                System.out.print(" peak");
                peaknum++;
                if( array[i] > tallestPeak) tallestPeak =array[i];
            }  else if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                System.out.print(" peak");
                peaknum++;
                if( array[i] > tallestPeak) tallestPeak =array[i];
            }
            System.out.print("\n");
        }
        System.out.println("there are " + peaknum + " number of peaks");
        System.out.println("the tallest peak is " + tallestPeak);
    }
}
