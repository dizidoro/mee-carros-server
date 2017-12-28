package models.car;

public class CarDTO {
    public Long id;
    public Long personId;
    public Integer year;
    public String model;
    public String color;

    boolean missesRequiredFields(){
        if(isNull(this.personId) || isNull(this.year) || isNull(model) || isNull(color)){
            return true;
        }
        if(isEmpty(model) || isEmpty(color)){
            return true;
        }
        return false;
    }

    private boolean isNull(Object object){
        return object == null;
    }

    private boolean isEmpty(String field){
        return field.equals("");
    }
}
