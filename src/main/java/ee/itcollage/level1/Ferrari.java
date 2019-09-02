package ee.itcollage.level1;

import java.util.StringJoiner;

public class Ferrari {

    private String name;

    public Ferrari() {
        this("Default ferrari");
    }

    public Ferrari(String name) {
        this.name = name;
    }

    public void drive(){
        System.out.println("RRRRRRRRRRR");
    }

    public void stop(){
        System.out.println("EHEHEHEHEHEHE");
    }

    public String name(){
        return "Ferrari F50";
    }

    public void drift(){
        System.out.println("drift");
        //todo add method body
    }

    //todo create more methods


    @Override
    public String toString() {
        return name;
    }
}
