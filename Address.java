package spring;

public class Address {
	private String lane;
	private String city;
	private String state;
	@Override
	public String toString() {
		return "Address [lane=" + lane + ", city=" + city + ", state=" + state + "]";
	}
	public Address() {
		super();
		this.lane = "";
		this.city = "";
		this.state = "";
	}
	public Address(String lane, String city, String state) {
		super();
		this.lane = lane;
		this.city = city;
		this.state = state;
	}
	public String getLane() {
		return lane;
	}
	public void setLane(String lane) {
		this.lane = lane;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

}
