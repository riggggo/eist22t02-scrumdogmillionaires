package hello.world.demo.restaurant;

public class Review {

    private String username;

    private String comment;

    private Integer rating;

    public Review(String username, String comment, Integer rating) {
        this.username = username;
        this.comment = comment;
        this.rating = rating;

    }

    public String getUsername() {
        return username;
    }

    public String getComment() {
        return comment;
    }

    public Integer getRating() {
        return rating;
    }
}
