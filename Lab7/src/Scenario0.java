public class Scenario0 {
    public static void main(String[] args) {
        Point ctr = new Point(0, 0);
        Point secnd = new Point(3,4);
        Circle crc = new Circle(ctr, 3);
        System.out.println("center's distance to the secnd point is "+ ctr.distanceTo(secnd));
        crc.circleRadius();
    }
}

