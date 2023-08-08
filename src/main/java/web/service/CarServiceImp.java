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

    @Override
    public List<Car> createListCars() {

        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("Ford", 2, 2010));
        carsList.add(new Car("Lada", 1, 2020));
        carsList.add(new Car("Citroen", 4, 2015));
        carsList.add(new Car("Hyunday", 3, 2005));
        carsList.add(new Car("BMV", 5, 2018));

        return carsList;
    }
}
