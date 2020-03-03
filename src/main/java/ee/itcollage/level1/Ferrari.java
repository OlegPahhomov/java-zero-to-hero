package ee.itcollage.level1;

public class Ferrari {

    public void drive(){
        System.out.println("RRRRRRRRRRR");
    }

    public void stop(){
        System.out.println("EHEHEHEHEHEHE");
    }

    public void drift(){
        //todo add method body
    }

    //todo create more methods

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ferrari{");
        sb.append('}');
        return sb.toString();
    }
}
