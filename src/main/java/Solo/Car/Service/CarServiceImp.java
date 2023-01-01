package Solo.Car.Service;
import Solo.Car.model.Car;
import Solo.Car.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImp implements CarService{

@Autowired
private CarRepository carRepository;
    @Override
    public Car saveCar(Car car){
        return carRepository.save(car);
    }

    @Override
    public List<Car> getAllCars(){
        return carRepository.findAll();
    }

}
