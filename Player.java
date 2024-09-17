package Management;

// This is the first class that we are going to make
// it is a basic player class, we will inherit from this class
// for the class CricketPlayer and FootballPlayer.



public class Player {
	
	private String name;
	private int age;
	private int id;
	private int shirtNumber;
	private String country;
	
	public String getName()
	{
		return name;
	}
	
	
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getShirtNumber() {
		return shirtNumber;
	}
	public void setShirtNumber(int shirtNumber) {
		this.shirtNumber = shirtNumber;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	public Player(String name, int age, int id, int shirtNumber, String country) {
	
		this.name = name;
		this.age = age;
		this.id = id;
		this.shirtNumber = shirtNumber;
		this.country = country;
	}
	
	public void display()
	{
		
		System.out.println("Name of the player is :"+name);
		System.out.println("Age of the player is :"+age);
		System.out.println("Id of the player is :"+id);
		System.out.println("ShirtNumber of the player is :"+shirtNumber);
		System.out.println("Country of the player is :"+country);
		
	}
	
	
	
	

}
