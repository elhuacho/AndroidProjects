package pe.com.mobileconsulting.viewcontrollers.entities;

public class Service {
    private String name;
    private String description;
    private String brand;
    private int pictureId;

    public Service(String name, String description, String brand, int pictureId) {
        this.name = name;
        this.description = description;
        this.brand = brand;
        this.pictureId = pictureId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }
}
