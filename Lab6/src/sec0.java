public class sec0 {
    public static void main(String[] args){
        int[] myArr = {4, 8, 15, 16, 23, 42};
        // length is 6
        // value of first element is 4
        //index value of last element is 6
        // value of the third element is 15
        // the value of myArr[3] is 16
        // If we try to access myArr[10] it gives an index out of bounds error
        for(int i =0; i < myArr.length; i++){
            System.out.println(myArr[i]);
        }
        System.out.println(myArr[10]);
        // index value is out of bounds of the myArr sp it gives an error
    }
}
