package be.vdab.movies;

public class Genre {
    private String name;

    public Genre(String name) {
        this.name = name;
    }

    // only used for JPA
    protected Genre() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
