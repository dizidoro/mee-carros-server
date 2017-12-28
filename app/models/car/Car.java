package models.car;

class Car {
    private Long id;
    private Long personId;
    private Year year;
    private String model;
    private Color color;

    public Car(Long personId, Year year, String model, Color color) {
        this.personId = personId;
        this.year = year;
        this.model = model;
        this.color = color;
    }

    public Car(Long id, Long personId, Year year, String model, Color color) {
        this.id = id;
        this.personId = personId;
        this.year = year;
        this.model = model;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


}
