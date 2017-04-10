package co.tula.web;

import co.tula.dao.Dao;
import co.tula.model.Car;
import co.tula.model.dto.CarDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private Dao dao;

    @PostMapping(value = "/cars", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity addCar(@RequestParam(value = "model") String model,
                                 @RequestParam(value = "releaseYear") int releaseYear,
                                 @RequestParam(value = "brandId") int brandId,
                                 @RequestParam(value = "colorId") int colorId,
                                 @RequestParam(value = "countryId") int countryId) {
        Car created = dao.save(new CarDto(model, releaseYear, brandId, colorId, countryId));
        URI uriOfNewResource = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/cars/{id}")
                .buildAndExpand(created.getId()).toUri();
        return ResponseEntity.created(uriOfNewResource).build();
    }

    @GetMapping(value = "/cars", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Car> getCars() {
        return dao.getCars();
    }

    @PutMapping(value = "/cars/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity updateCar(@PathVariable(value = "id") int carId,
                                    @RequestParam(value = "model") String model,
                                    @RequestParam(value = "releaseYear") int releaseYear,
                                    @RequestParam(value = "brandId") int brandId,
                                    @RequestParam(value = "colorId") int colorId,
                                    @RequestParam(value = "countryId") int countryId) {
        CarDto carDto = new CarDto(model, releaseYear, brandId, colorId, countryId);
        dao.updateCar(carId, carDto);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

    @DeleteMapping(value = "/cars/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity removeCar(@PathVariable(value = "id") int id) {
        dao.removeCar(id);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

    @GetMapping(value = "/cars/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Car getCar(@PathVariable(value = "id") int carId) {
        return dao.getCar(carId);
    }
}
