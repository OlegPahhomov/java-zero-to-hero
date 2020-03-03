package ee.itcollage.level1;

import java.util.List;

public class Garage {

    private Ferrari ferrari;
    private List<Ferrari> cars;

    public Garage(Ferrari ferrari) {
        this.ferrari = ferrari;
    }

    public Garage() {
    }

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
        final StringBuilder sb = new StringBuilder("Garage{");
        sb.append("ferrari=").append(ferrari);
        sb.append(", cars=").append(cars);
        sb.append('}');
        return sb.toString();
    }
}
