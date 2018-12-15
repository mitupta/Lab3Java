import java.awt.*;

public class Box2 {

    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;


    Box2(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    Box2(Point topLeft, Point bottomRight) {
        x1 = topLeft.x;
        y1 = topLeft.y;
        x2 = bottomRight.x;
        y2 = bottomRight.y;
    }

    Box2(Point topLeft, int w, int h){
        x1 = topLeft.x;
        y1 = topLeft.y;
        x2 = x1 + w;
        y2 = y1 + h;
    }

    void PrintBox() {
        System.out.print("Box: <");
        System.out.print(x1 + "," + y1 + " ; " );
        System.out.print(x2 + "," + y2 );
        System.out.println(">");
    }

    public static void main(String[] args) {
        Box2 box2;
        System.out.println("Działa konstruktor ze współrzędnymi (25,25) i (50,50)");
        box2 = new Box2(25,25,50,50);
        box2.PrintBox();

        //z punktami (10,10) i (20,20)

        System.out.println("Działa konstruktor ze współrzędnymi punktów(10,10) i (20,20)");
        box2 = new Box2(new Point(10,10), new Point(20,20));
        box2.PrintBox();

        System.out.println("Działa konstruktor ze współrzędnymi punktów(12,12) i w = 30 i h = 40");
        box2 = new Box2(new Point(12,12), 30, 40);
        box2.PrintBox();
        //z punktem (12,12) i z szerokoscia 30 i wys 40


    }
}
