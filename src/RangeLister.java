public class RangeLister {

    int[] makeRange(int lower, int upper){

        int[] range = new int[(upper-lower) +1];
        for (int i = 0; i < range.length; i++) {
            range[i] = lower++;
        }
    return range;
    }

    void showRangeArray(int [] array){
        System.out.print("Elementy tablicy: [ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }
    public static void main(String[] args) {

        int[] range;

        RangeLister rangeLister = new RangeLister();

        range = rangeLister.makeRange(4,13);

        rangeLister.showRangeArray(range);

    }
}
