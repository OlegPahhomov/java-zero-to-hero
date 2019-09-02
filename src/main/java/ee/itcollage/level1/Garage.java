package ee.itcollage.level1;

import java.util.List;
import java.util.StringJoiner;

public class Garage {

    private Ferrari ferrari;
    private List<Ferrari> cars;

    public Ferrari getFerrari() {
        return ferrari;
    }

    public void setFerrari(Ferrari ferrari) {
        this.ferrari = ferrari;
    }

    public List<Ferrari> getCars() {
        return cars;
    }

    public void setCars(List<Ferrari> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return cars.toString();
    }
}
