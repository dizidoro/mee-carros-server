package models.car;

import models.exception.NoCarWithSuchIdException;
import models.exception.NoSuchTokenException;

import java.util.List;

class CarService {
    private static final CarService INSTANCE = new CarService();

    private final CarDAO dao = CarDAO.getInstance();

    private CarService() {
    }

    public static CarService getInstance() {
        return INSTANCE;
    }

    public void createCarList(String pipedriveToken){
        dao.createCarList(pipedriveToken);
    }

    public List<CarDTO> getAll(String pipedriveToken) throws NoSuchTokenException {
        List<Car> cars = dao.getAll(pipedriveToken);
        List<CarDTO> carDtos = CarAssembler.toDTO(cars);
        return carDtos;
    }

    public CarDTO get(String pipedriveToken, Long id) throws NoSuchTokenException, NoCarWithSuchIdException {
        Car car = dao.get(pipedriveToken, id);
        CarDTO dto = CarAssembler.toDTO(car);
        return dto;
    }

    public Long add(String pipedriveToken, Car car) throws NoSuchTokenException{
        return dao.add(pipedriveToken, car);
    }

    public void update(String pipedriveToken, Car car) throws NoSuchTokenException, NoCarWithSuchIdException {
        dao.update(pipedriveToken, car);
    }

    public void delete(String pipedriveToken, Long id) throws NoSuchTokenException, NoCarWithSuchIdException {
        dao.delete(pipedriveToken, id);
    }


}
