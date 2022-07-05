package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.ServiceImpl;

import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(
            value = "count",
            defaultValue = "5",
            required = false) int count, Model model, ServiceImpl service) {

        List<Car> carList = service.getCar(count);
        model.addAttribute("cars", carList);

        return "cars";
    }
}
