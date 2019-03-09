package ee.itcollage.level3;

public class LargestNumbest {

    //todo make tests work

    public static int pickLargest(int x1, int x2) {
        if (x1 > x2) {
            return x1;
        }
        return x2;
    }

    public static int pickLargest(int x1, int x2, int x3) {
        if (x1 > x2 && x1 > x3) {
            return x1;
        } else if (x2 > x1){
            return x2;
        } else {
            return x3;
        }
    }
}
