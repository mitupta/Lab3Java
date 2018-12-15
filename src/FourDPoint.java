import java.awt.*;

public class FourDPoint extends Point {

    int z1,v1;
    Point point;

    public FourDPoint(int x, int y, int z1, int v1) {
        super(x, y);
        this.z1 = z1;
        this.v1 = v1;
    }

    public FourDPoint(Point point, int z1, int v1) {
        super(point);
        this.point = point;
        this.z1 = z1;
        this.v1 = v1;
    }

    public static void main(String[] args) {
        FourDPoint fdp = new FourDPoint(1,2,3,4);
        System.out.println("x wynosi: " + fdp.x);
        System.out.println("y wynosi: " + fdp.y);
        System.out.println("z wynosi: " + fdp.z1);
        System.out.println("v wynosi: " + fdp.v1);

        FourDPoint fdp2 = new FourDPoint(new Point(1,2), 3,4);
        System.out.println("x wynosi: " + fdp2.x);
        System.out.println("y wynosi: " + fdp2.y);
        System.out.println("z wynosi: " + fdp2.z1);
        System.out.println("v wynosi: " + fdp2.v1);
    }
}
