import java.util.Random;

public class JackPot {



    public static void main(String[] args) {



        RandomPick win = new RandomPick();
        win.r1 = 7;
        win.r2 = 7;
        win.r3 = 7;

        int count;

        System.out.println("Wygrywające nry: ");

        System.out.println(win.r1 + " " + win.r2 + " " + win.r3);

        /*RandomPick pick = new RandomPick();

        System.out.println(pick.r1 + " " + pick.r2 + " " + pick.r3 );*/

        for (int i = 0; i < 1500; i++) {

            RandomPick pick = new RandomPick();
            if (pick.equals(win)) {
                System.out.println("TRAFIONE [" + pick.r1 + " " + pick.r2 + " " + pick.r3 + "] za " + i + " razem");
                break;
            }
        }


    }


}

class RandomPick{
    Random random = new Random();
    int r1;
    int r2;
    int r3;


    public int[] losowanie() {
        int r1 = random.nextInt(10);
        int r2 = random.nextInt(10);
        int r3 = random.nextInt(10);
        int [] array = {r1,r2,r3};
        return array;
    }




    @Override
    public String toString() {
        return "RandomPick [" +
                "r1=" + r1 +
                ", r2=" + r2 +
                ", r3=" + r3 +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RandomPick that = (RandomPick) o;
        return r1 == that.r1 &&
                r2 == that.r2 &&
                r3 == that.r3;
    }


}






