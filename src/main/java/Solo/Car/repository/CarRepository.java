package Solo.Car.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Solo.Car.model.Car;
import org.springframework.stereotype.Repository;

@Repository

public interface CarRepository extends JpaRepository<Car,Integer> {

}
