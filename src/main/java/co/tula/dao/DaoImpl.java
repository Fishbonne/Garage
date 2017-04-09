package co.tula.dao;

import co.tula.model.Brand;
import co.tula.model.Car;
import co.tula.model.Color;
import co.tula.model.Country;
import co.tula.model.dto.CarDto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.util.List;

@Repository
@Transactional(readOnly = true)
public class DaoImpl implements Dao {

    private final Logger LOG = LoggerFactory.getLogger(DaoImpl.class);

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public Car save(CarDto carDto) {
        Session session = sessionFactory.getCurrentSession();
        Brand brand = session.load(Brand.class, carDto.getBrandId());
        Color color = session.load(Color.class, carDto.getColorId());
        Country country = session.load(Country.class, carDto.getCountryId());
        Car car = new Car(carDto.getModel(), carDto.getReleaseYear(), brand, color, country);
        session.persist(car);
        LOG.info("Car successfully saved. Car details: {}", car);
        return car;

    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Car> getCars() {
        Session session = sessionFactory.getCurrentSession();
        List<Car> carList = session.createQuery("FROM Car").list();
        carList.forEach(car -> LOG.info("Car List: " + car));
        return carList;
    }

    @Override
    @Transactional
    public void updateCar(int id, CarDto carDto) {
        Session session = sessionFactory.getCurrentSession();
        Brand brand = session.load(Brand.class, carDto.getBrandId());
        Color color = session.load(Color.class, carDto.getColorId());
        Country country = session.load(Country.class, carDto.getCountryId());
        Car car = new Car(carDto.getModel(), carDto.getReleaseYear(), brand, color, country);
        car.setId(id);
        session.update(car);
        session.flush();
        LOG.info("Car successfully updated. Car details: {}", car);
    }

    @Override
    @Transactional
    public void removeCar(int id) {
        Session session = sessionFactory.getCurrentSession();
        Car car = session.load(Car.class, new Integer(id));
        session.delete(car);
        LOG.info("Car successfully removed. Car details: {}", car);
    }

    @Override
    public Car getCar(int id) {
        Session session = sessionFactory.getCurrentSession();
        Car car = session.get(Car.class, new Integer(id));
        Assert.notNull(car, "There is no car with id=" + id);
        LOG.info("Car successfully loaded. Car details: {}", car);
        return car;
    }
}
