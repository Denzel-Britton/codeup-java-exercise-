package movies;



public class Movie {
//It should have private fields for name and category,
    private String name;
    private String category;

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }
}



