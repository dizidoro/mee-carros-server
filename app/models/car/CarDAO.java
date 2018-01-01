package models.car;

import models.exception.NoCarWithSuchIdException;
import models.exception.NoSuchTokenException;

import java.util.*;

class CarDAO {
    private static final CarDAO INSTANCE = new CarDAO();

    private static Long count = 0L;


    private synchronized Long next(){
        return ++count;
    }

    private static final Map<String, List<Car>> tokenToCars = new HashMap<>();

    private CarDAO() {
    }

    public static CarDAO getInstance() {
        return INSTANCE;
    }

    public void createCarList(String token){
        if(!tokenToCars.containsKey(token)){
            List<Car> cars = new ArrayList<>();
            tokenToCars.put(token, cars);
        }
    }

    public List<Car> getAll(String token) throws NoSuchTokenException {
        List<Car> cars;
        if (tokenToCars.containsKey(token)) {
            cars = tokenToCars.get(token);
        } else {
            throw new NoSuchTokenException(token);
        }
        return cars;
    }

    public Car get(String token, Long id) throws NoCarWithSuchIdException, NoSuchTokenException {
        List<Car> cars = this.getAll(token);
        Car requestedCar;
        try {
            requestedCar = cars.stream()
                    .filter(car -> car.getId().equals(id))
                    .findFirst().get();
        } catch (NoSuchElementException e) {
            throw new NoCarWithSuchIdException(id);
        }

        return requestedCar;
    }

    public Long add(String token, Car car) throws NoSuchTokenException {
        Long id = next();
        Car copyWithId = new Car(id, car.getPersonId(), car.getYear(), car.getModel(), car.getColor());
        List<Car> cars = this.getAll(token);
        cars.add(copyWithId);
        return id;
    }

    public void update(String token, Car car) throws NoSuchTokenException, NoCarWithSuchIdException{
        Car old = this.get(token, car.getId());
        old.setModel(car.getModel());
        old.setColor(car.getColor());
        old.setPersonId(car.getPersonId());
        old.setYear(car.getYear());
    }

    public void delete(String token, Long id) throws NoSuchTokenException, NoCarWithSuchIdException{
        List<Car> cars = this.getAll(token);
        boolean removed = cars.removeIf(car -> car.getId().equals(id));
        if(!removed){
            throw new NoCarWithSuchIdException(id);
        }
    }

}
