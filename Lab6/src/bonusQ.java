import java.util.Random;
public class bonusQ {
    public static void main(String[] args){
        int[][] quizes = new int[5][4]; // 5 students, 4 quizzes
        int[] sums = new int[5];
        int s =0;
        int q =0;
        int highest = 0;
        int highests =-1;
        int highestq = -1;
        for (s = 0; s < quizes.length; s++){
            for (q = 0; q < quizes[s].length; q++){
                quizes[s][q] = twod(s, q);
                sums[s] += quizes[s][q];
                if ( quizes[s][q] > highest){
                    highest = quizes[s][q];
                    highests = s;
                    highestq = q;
                }

            }
        }
        float[] quizAvgs = new float[4];

        for (q = 0; q < 4; q++) {
            int quizSum = 0;
            for (s = 0; s < 5; s++) {
                quizSum += quizes[s][q];
            }
            quizAvgs[q] = (float) (quizSum / 5.0);
        }

        s = 0;
        q = 0;
        for (s = 0; s < quizes.length; s++){
            System.out.print("Student " + (s+1) + ": ");
            for (q = 0; q < quizes[s].length; q++){
                System.out.print(quizes[s][q] + " ");
            }
            int averg = sums[s] / 4;
            System.out.printf(" the students average (rounded) is %02d.",averg);
            System.out.println();
        }
        System.out.println("Quiz averages:");
        for (q = 0; q < quizAvgs.length; q++) {
            System.out.printf("Quiz %d Avg: %.2f%n", q+1, quizAvgs[q]);
        }
        System.out.printf("Highest score is %d by Student %d on Quiz %d%n", highest, highests +1, highestq +1);

    }

    public static int twod(int s, int q){
        Random rand = new Random();
        return rand.nextInt(101);
    }
}
