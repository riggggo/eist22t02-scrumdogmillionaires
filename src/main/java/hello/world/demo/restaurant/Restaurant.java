package hello.world.demo.restaurant;



import java.time.LocalTime;
import java.util.List;


import hello.world.demo.EmailService;
import org.apache.catalina.User;

public class Restaurant {
    private String name;
    private String description;
    private Location location;
    private List<String> pictures;
    private List<String> ratings;

    private List<String> comments;
    private LocalTime openingTimes;
    private LocalTime closingTime;
    private String website;
    private String priceCategory;

    public Restaurant(String name, String description, Location location, List<String> pictures, List<String> ratings,
			List<String> comments, LocalTime openingTimes, LocalTime closingTime, String website, String priceCategory) {
		super();
		this.name = name;
		this.description = description;
		this.location = location;
		this.pictures = pictures;
		this.ratings = ratings;
		this.comments = comments;
		this.openingTimes = openingTimes;
		this.closingTime = closingTime;
		this.website = website;
		this.priceCategory = priceCategory;
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

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public List<String> getPictures() {
		return pictures;
	}

	public void setPictures(List<String> pictures) {
		this.pictures = pictures;
	}

	public List<String> getRatings() {
		return ratings;
	}

	public void setRatings(List<String> ratings) {
		this.ratings = ratings;
	}

	public List<String> getComments() {
		return comments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}

	public LocalTime getOpeningTimes() {
		return openingTimes;
	}

	public void setOpeningTimes(LocalTime openingTimes) {
		this.openingTimes = openingTimes;
	}

	public LocalTime getClosingTime() {
		return closingTime;
	}

	public void setClosingTime(LocalTime closingTime) {
		this.closingTime = closingTime;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getPriceCategory() {
		return priceCategory;
	}

	public void setPriceCategory(String priceCategory) {
		this.priceCategory = priceCategory;
	}

	public void passReservation(Reservation reservation, User user){
	}

	public void cancelReservation(Reservation reservation, User user){
		EmailService.confirmCancellation(reservation);
	}

	public void getDetail(){
	}

	public void checkAvailability(LocalTime date){
	}
}
