package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {

    @Override
    public List<Car> getCarsWithCount(List<Car> cars, Integer count) {
        if(count != null) {
            cars = cars.stream().limit(count).collect(Collectors.toList());
        }
        return cars;
    }
}
