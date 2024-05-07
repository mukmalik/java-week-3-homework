public class Program16Point {
    int x,y;
    public Program16Point()
    {

    }
    public Program16Point(int x, int y)
    {
        this.x =x;
        this.y=y;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance()
    {
        return  Math.sqrt((0 - x) * (0 - x) + (0 - y) * (0 - y));
    }
    public double distance(int x1,int y1)
    {
        return  Math.sqrt((x1 - x) * (x1- x) + (y1 - y) * (y1- y));
    }
    public double distance(double x1,double y1)
    {
        return Math.sqrt((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y));
    }

    public static void main(String[] args) {
        Program16Point first = new Program16Point(6, 5);
        Program16Point second = new Program16Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second.x,second.y));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Program16Point point = new Program16Point();
        System.out.println("distance()= " + point.distance());
    }
}
