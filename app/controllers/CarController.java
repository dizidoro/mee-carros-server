package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.car.CarDTO;
import models.car.CarManager;
import models.car.IdDTO;
import models.exception.*;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

public class CarController extends Controller {

    private final CarManager manager;

    public CarController() {
        this.manager = new CarManager();
    }

    public Result createCars(String pipedriveToken) {
        this.manager.createCars(pipedriveToken);
        return created();
    }

    public Result getAll(String pipedriveToken) {
        Result result;
        try {
            List<CarDTO> dtos = this.manager.getAllCars(pipedriveToken);
            result = ok(Json.toJson(dtos));
        } catch (NoSuchTokenException e) {
            Error error = new Error(e.getMessage());
            result = badRequest(Json.toJson(error));
        }
        return result;
    }


    public Result get(String pipedriveToken, Long id) {
        Result result;
        try {
            CarDTO dto = this.manager.getCar(pipedriveToken, id);
            result = ok(Json.toJson(dto));
        } catch (NoSuchTokenException e) {
            Error error = new Error(e.getMessage());
            result = badRequest(Json.toJson(error));
        } catch (NoCarWithSuchIdException e) {
            Error error = new Error(e.getMessage());
            result = notFound(Json.toJson(error));
        }
        return result;
    }


    public Result add(String pipedriveToken) {
        JsonNode json = request().body().asJson();
        if (json == null) {
            Error error = new Error("Sem corpo");
            return badRequest(Json.toJson(error));
        }
        CarDTO dto;
        try {
            dto = Json.fromJson(json, CarDTO.class);
        } catch (RuntimeException e) {
            Error error = new Error("Json mal formatado");
            return badRequest(Json.toJson(error));
        }

        Result result;
        try {
            IdDTO id = this.manager.addCar(pipedriveToken, dto);
            result = created(Json.toJson(id));
        } catch (MissingRequiredFieldsException |
                BelowMinimumCarYearException |
                InvalidCarColorException |
                NoSuchTokenException e) {
            Error error = new Error(e.getMessage());
            result = badRequest(Json.toJson(error));
        }
        return result;
    }

    public Result update(String pipedriveToken, Long id) {
        JsonNode json = request().body().asJson();
        if (json == null) {
            Error error = new Error("Sem corpo");
            return badRequest(Json.toJson(error));
        }

        CarDTO dto;
        try {
            dto = Json.fromJson(json, CarDTO.class);
        } catch (RuntimeException e) {
            Error error = new Error("Json mal formatado");
            return badRequest(Json.toJson(error));
        }

        Result result;
        try {
            this.manager.updateCar(pipedriveToken, id, dto);
            result = ok();
        } catch (MissingRequiredFieldsException |
                BelowMinimumCarYearException |
                InvalidCarColorException |
                NoSuchTokenException e) {
            Error error = new Error(e.getMessage());
            result = badRequest(Json.toJson(error));
        } catch (NoCarWithSuchIdException e) {
            Error error = new Error(e.getMessage());
            result = notFound(Json.toJson(error));
        }
        return result;
    }


    public Result delete(String pipedriveToken, Long id) {
        Result result;
        try {
            this.manager.deleteCar(pipedriveToken, id);
            result = ok();
        } catch (NoCarWithSuchIdException e) {
            Error error = new Error(e.getMessage());
            result = notFound(Json.toJson(error));
        } catch (NoSuchTokenException e) {
            Error error = new Error(e.getMessage());
            result = badRequest(Json.toJson(error));
        }

        return result;
    }
}
