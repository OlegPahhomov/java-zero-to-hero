package ee.itcollage.level1;

import java.util.List;

public class Garage {

    private Ferrari ferrari;
    private List<Ferrari> ferraris;

    public Garage() {
    }

    public Ferrari getFerrari() {
        return ferrari;
    }

    public void setFerrari(Ferrari ferrari) {
        this.ferrari = ferrari;
    }

    public List<Ferrari> getFerraris() {
        return ferraris;
    }

    public void setFerraris(List<Ferrari> ferraris) {
        this.ferraris = ferraris;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "ferrari=" + ferrari +
                ", ferraris=" + ferraris +
                '}';
    }
}
