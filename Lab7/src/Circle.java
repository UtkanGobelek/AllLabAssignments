public class Circle{
    public Point center;
    public float r;

    public Circle(Point ctr, int i) {
        center = ctr;
        r = i;
    }
    public void circleRadius() {
        System.out.println("center point (" + center.x +","+ center.y + "), radius " + r);
    }

}
