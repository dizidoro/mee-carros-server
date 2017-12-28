package models.person;

class Person {
    private Long pipedriveId;
    private String name;

    public Person(Long pipedriveId, String name) {
        this.pipedriveId = pipedriveId;
        this.name = name;
    }

    public Long getPipedriveId() {
        return pipedriveId;
    }

    public String getName() {
        return name;
    }
}
