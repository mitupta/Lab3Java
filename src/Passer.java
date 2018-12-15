import java.awt.*;

public class Passer {

    Point point = new Point(1,1);
    int x = 1;

    public static void main(String[] args) {

        Passer passer = new Passer();

        /*System.out.println("Point: " + passer.point);
        passer.changePoint(passer.point);
        System.out.println("Changed point: " + passer.point);

        System.out.println("x: " + passer.x);
        passer.changeX(passer.x);
        System.out.println("Changed x: " + passer.x);
*/

        passer.toUpperCase(args);

        for (String str : args) {
            System.out.println(str);
        }

    }

    void changePoint(Point point){
        point.x = 7;
        point.y = 9;
    }

    void changeX(int x){
        x = 8;
    }

    void toUpperCase(String[] text){
        for (int i = 0; i < text.length; i++) {
            text[i] = text[i].toUpperCase();
        }
    }
}
