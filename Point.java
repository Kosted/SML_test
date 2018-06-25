public class Point {
    private Double x;
    private Double y;

    Point(Double _x, Double _y) {
        x = _x;
        y = _y;
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "x = " + x + "; y = " + y;
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }


    public static void main(String[] args) {
        Point fP = new Point(0.0, 0.0);
        Point sP = new Point(2.0, 2.0);
        System.out.println("coordinates of the first point: " + fP.toString() +
                "\ncoordinates of the second point: " + sP.toString() + "\ndistance = " + distance(fP, sP));
    }
}
