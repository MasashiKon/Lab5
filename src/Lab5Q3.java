import java.util.ArrayList;
import java.util.List;

public class Lab5Q3 {
    public static void main(String[] args) {
        List<Car> carList =  new ArrayList<>();

        carList.add(new Car("Honda", "Integra", 1985));
        carList.add(new Car("Volkswagen", "Beetle", 1938));
        carList.add(new Car("Jeep", "Wrangler YJ", 1987));

        carList.sort(null);

        System.out.println(carList);
    }
}

class Car implements Comparable<Car> {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    

    @Override
    public String toString() {
        return "{\nbrand=" + brand + ",\nmodel=" + model + ",\nyear=" + year + "\n}\n";
    }

    @Override
    public int compareTo(Car o) {
        return this.year - o.year;
    }
    
}
