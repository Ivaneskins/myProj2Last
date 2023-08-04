package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count
            , Model model) {
		List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("Ford", 2, 2010));
        carsList.add(new Car("Lada", 1, 2020));
        carsList.add(new Car("Citroen", 4, 2015));
        carsList.add(new Car("Hyunday", 3, 2005));
        carsList.add(new Car("BMV", 5, 2018));

        carsList = carService.getCarsWithCount(carsList, count);

        model.addAttribute("cars", carsList);
        return "cars";
    }
}
