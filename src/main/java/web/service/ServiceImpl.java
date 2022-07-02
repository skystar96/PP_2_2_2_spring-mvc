package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class ServiceImpl implements Service{
    @Override
    public List<Car> getCar(int count) {
        Car car1 = new Car("AUDI", "black", 400);
        Car car2 = new Car("BMW", "white",  700);
        Car car3 = new Car("Mercedes-Benz", "grey",  1000);
        Car car4 = new Car("Ford", "brown",  300);
        Car car5 = new Car("Toyota", "green",  500);

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);

        if (count > 0 && count < 5) {
            return carList.stream().limit(count).toList();
        } else {
            return carList;
        }
    }
}
