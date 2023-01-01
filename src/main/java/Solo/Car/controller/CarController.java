package Solo.Car.controller;
import Solo.Car.model.Car;
import Solo.Car.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/car")
@CrossOrigin
public class CarController {
    @Autowired
    private CarService carService;

    @PostMapping("/add")
    public String add(@RequestBody Car car){
        carService.saveCar(car);
        return "New Car is added";
    }

    @GetMapping("/getAll")

    public List<Car> getAllCars(){
        return carService.getAllCars();
    }
}
