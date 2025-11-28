public class Point{
    public int x;
    public int y;

    public Point(int a, int b) {
        x = a;
        y = b;
    }
    public double distanceTo(Point b) {
        double dx = Math.pow(x - b.x, 2);
        double dy = Math.pow(y - b.y, 2);
        return Math.sqrt(dx + dy);
    }

}
