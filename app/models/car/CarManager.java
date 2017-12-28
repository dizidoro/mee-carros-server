package models.car;

import models.exception.*;

import java.util.List;

public class CarManager {


    private final CarService service = CarService.getInstance();

    public CarManager() {
    }

    public void createCars(String pipedriveToken){
        service.createCarList(pipedriveToken);
        System.out.println("CARS CREATED "+ pipedriveToken);
    }

    public CarDTO getCar(String pipedriveToken, Long id)
            throws NoSuchTokenException, NoCarWithSuchIdException {
        return this.service.get(pipedriveToken, id);
    }

    public List<CarDTO> getAllCars(String pipedriveToken) throws NoSuchTokenException {
        return this.service.getAll(pipedriveToken);
    }

    public IdDTO addCar(String pipedriveToken, CarDTO dto)
            throws MissingRequiredFieldsException,
            BelowMinimumCarYearException,
            InvalidCarColorException,
            NoSuchTokenException {
        if (dto.missesRequiredFields()) {
            throw new MissingRequiredFieldsException();
        }

        Car car = this.fromDto(dto);
        Long id = this.service.add(pipedriveToken, car);
        return new IdDTO(id);
    }

    public void updateCar(String pipedriveToken, Long id, CarDTO dto)
            throws MissingRequiredFieldsException,
            InvalidCarColorException,
            BelowMinimumCarYearException,
            NoSuchTokenException,
            NoCarWithSuchIdException {
        if (dto.missesRequiredFields()) {
            throw new MissingRequiredFieldsException();
        }
        dto.id = id;
        Car car = this.fromDto(dto);
        this.service.update(pipedriveToken, car);
    }

    public void deleteCar(String pipedriveToken, Long id)
            throws NoCarWithSuchIdException, NoSuchTokenException {
        this.service.delete(pipedriveToken, id);
    }

    private Car fromDto(CarDTO dto) throws BelowMinimumCarYearException, InvalidCarColorException {
        Long personId = dto.personId;
        Year year = new Year(dto.year);
        String model = dto.model;
        Color color;
        try {
            color = Color.valueOf(dto.color);
        } catch (IllegalArgumentException e) {
            throw new InvalidCarColorException(dto.color);
        }
        Car car;
        if (dto.id != null) {
            car = new Car(dto.id, personId, year, model, color);
        } else {
            car = new Car(personId, year, model, color);
        }
        return car;
    }

}
