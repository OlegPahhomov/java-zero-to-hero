package ee.itcollage.level1;

public class Driving {

    public static void main(String[] args) {

        //todo find a way to call methods from your ferrari
        // create new methods
        Ferrari ferrari1 = new Ferrari();
        ferrari1.drift();
        Ferrari.examine();
        ferrari1.examine();
        Ferrari ferrari2 = new Ferrari();
        String drive = ferrari2.drive();
        ferrari2.examine();
    }
}
