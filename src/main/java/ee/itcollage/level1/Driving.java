package ee.itcollage.level1;

public class Driving {

    public static void main(String[] args) {
        //todo find a way to call methods from your ferrari
        // create new methods

        Ferrari ferrari = new Ferrari();
        ferrari.drive();
        ferrari.stop();
        String name = ferrari.name();
        System.out.println(name);
        //ferrari.drift();
    }
}
