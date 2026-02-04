package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private final List<Car> cars;

    public CarServiceImp() {

        cars = new ArrayList<>();
        cars.add(new Car("Toyota", 2020, "John"));
        cars.add(new Car("BMW", 2018, "Sarah"));
        cars.add(new Car("Subaru", 2015, "Simon"));
        cars.add(new Car("Suzuki", 2024, "Anna"));
        cars.add(new Car("Honda", 2022, "Mihael"));
    }

    @Override
    public List<Car> getCars(int count) {

        if(count <= 0 || count >=5) {
            count = 5;
        }
        return cars.subList(0, Math.min(count, cars.size()));
    }

}
