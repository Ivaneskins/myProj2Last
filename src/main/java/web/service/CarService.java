package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {

    List<Car> getCarsWithCount(List<Car> cars, Integer count);

    List<Car> createListCars();
}
