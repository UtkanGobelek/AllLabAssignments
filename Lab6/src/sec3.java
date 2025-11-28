import java.util.Random;
public class sec3 {
    public static void main(String[] args){
        Random rand = new Random();
        int sunny = 0, cloudy = 0, rainy = 0, stormy = 0;
        int size = 1000000;

        String[] weatherArray = new String[100];
        for (int i = 0; i < 40; i++) weatherArray[i] = "Sunny";
        for (int i = 40; i < 70; i++) weatherArray[i] = "Cloudy";
        for (int i = 70; i < 90; i++) weatherArray[i] = "Rainy";
        for (int i = 90; i < 100; i++) weatherArray[i] = "Stormy";

        for (int i = 0; i < size; i++) {
            String weather = weatherArray[rand.nextInt(100)];
            switch (weather) {
                case "Sunny":
                    sunny++;
                    break;
                case "Cloudy":
                    cloudy++;
                    break;
                case "Rainy":
                    rainy++;
                    break;
                case "Stormy":
                    stormy++;
                    break;
            }
        }


        System.out.println("Weather counts:");
        System.out.println("Sunny: " + sunny);
        System.out.println("Cloudy: " + cloudy);
        System.out.println("Rainy: " + rainy);
        System.out.println("Stormy: " + stormy);

        System.out.println("\nWeather percentages:");
        System.out.printf("Sunny: %.2f%%\n", (sunny * 100.0) / size);
        System.out.printf("Cloudy: %.2f%%\n", (cloudy * 100.0) / size);
        System.out.printf("Rainy: %.2f%%\n", (rainy * 100.0) / size);
        System.out.printf("Stormy: %.2f%%\n", (stormy * 100.0) / size);

    }
}
