package ee.itcollage.level12;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class CarPicker {

    public static void main(String[] args) {
        //todo 3 simulate picking a car

        List<Car> garage = Arrays.asList(
                buildCar("Lamborgini Avendator", 2000000, false, 10.0),
                buildCar("Tesla Roadster", 100000, true, 9.0),
                buildCar("Toyota Prius", 20000, false, 5.0),
                buildCar("Lada", 5000, false, 2.0),
                buildCar("Bicycle", 100, false, 0.5)
        );
        System.out.println("Garage contains: \n" + garage);
        //todo 3.1 what does garage print? Can you make it print something prettier?

        //todo 3.2 Ask user how much money do they have and pick them a car or cars based on cars you have in garage
        // uncomment following lines for reading input example
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much money do you have?");
        String input = scanner.nextLine();
        System.out.println("Your input: " + input);
        Integer money = Integer.valueOf(input);

        System.out.println("What rating do you want?");
        String input2 = scanner.nextLine();
        System.out.println("Your input: " + input2);
        Double rating = Double.valueOf(input2);


        System.out.println("Do you want your car to be electric?");
        String input3 = scanner.nextLine();
        System.out.println("Your input: " + input3);
        boolean electric = Boolean.valueOf(input2);

        Optional<Car> shopCarOp = garage.stream()
                .filter(car -> car.getCost() < money)
                .filter(car -> car.getUserRating() > rating)
                .filter(car -> car.isElectric() == electric)
                .findAny();

        if (shopCarOp.isPresent()) {
            System.out.println("Shop recommends you: ");
            System.out.println(shopCarOp.get().getModel());
        } else {
            System.out.println("no car found change params");
        }

        //todo ADVANCED
        // ask user 2nd question (+rating)

        //todo ADVANCED
        // ask user 3rd question (+electric)
    }

    private static Car buildCar(String name, int cost, boolean electric, double userRating) {
        Car car = new Car();
        car.setModel(name);
        car.setCost(cost);
        car.setElectric(electric);
        car.setUserRating(userRating);
        return car;
    }
}