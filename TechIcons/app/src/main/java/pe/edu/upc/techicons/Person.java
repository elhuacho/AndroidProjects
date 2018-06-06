package pe.edu.upc.techicons;

public class Person {
    private String name;
    private String title;
    private String company;
    private String bio;
    private int pictureId;

    public Person(String name, String title, String company, String bio, int pictureId) {
        this.name = name;
        this.title = title;
        this.company = company;
        this.bio = bio;
        this.pictureId = pictureId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }
}
