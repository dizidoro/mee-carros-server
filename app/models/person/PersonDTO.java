package models.person;

public class PersonDTO {
    public Long id;
    public String name;

    public PersonDTO(Long id, String name){
        this.id = id;
        this.name = name;
    }

    public boolean missesRequiredFields(){
        return id == null;
    }
}
