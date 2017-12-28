package models.car;

import java.util.ArrayList;
import java.util.List;

class CarAssembler {

    public static CarDTO toDTO(Car car) {
        CarDTO dto = new CarDTO();
        dto.id = car.getId();
        dto.personId = car.getPersonId();
        dto.year = car.getYear().getValue();
        dto.model = car.getModel();
        dto.color = car.getColor().name();
        return dto;
    }

    public static List<CarDTO> toDTO(List<Car> cars){
        List<CarDTO> dtos = new ArrayList<>();
        for(Car car : cars){
            dtos.add(toDTO(car));
        }
        return dtos;
    }
}
