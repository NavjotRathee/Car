package Solo.Car.Service;
import Solo.Car.model.Car;

import java.util.List;

public interface CarService {

    public Car saveCar(Car car);
    public List<Car> getAllCars();
}
