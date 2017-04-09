package co.tula.dao;


import co.tula.model.Car;
import co.tula.model.dto.CarDto;

import java.util.List;

public interface Dao {

    Car save(CarDto car);

    List<Car> getCars();

    void updateCar(int id, CarDto carDto);

    void removeCar(int id);

    Car getCar(int id);
}
