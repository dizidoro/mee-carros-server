package models.person;

class PersonAssembler {

    public static PersonDTO toDTO(Person person){
        return new PersonDTO(person.getPipedriveId(), person.getName());
    }
}
