package Management;

// this shows simple inheritance

public class CricketPlayer extends Player {
	
	private String type; // bat, bowl, allrounder
	private int RunsScored;
	private int Wickets;
	private int Catches;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getRunsScored() {
		return RunsScored;
	}
	public void setRunsScored(int runsScored) {
		RunsScored = runsScored;
	}
	public int getWickets() {
		return Wickets;
	}
	public void setWickets(int wickets) {
		Wickets = wickets;
	}
	public int getCatches() {
		return Catches;
	}
	public void setCatches(int catches) {
		Catches = catches;
	}
	public CricketPlayer(String name, int age, int id, int shirtNumber, String country, String type, int runsScored,
			int wickets, int catches) {
		super(name, age, id, shirtNumber, country);
		this.type = type;
		RunsScored = runsScored;
		Wickets = wickets;
		Catches = catches;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Runs scored by the player is :"+RunsScored);
		System.out.println("Wickets Taken by the player is :"+Wickets);
		System.out.println("Catches held by the player is :"+Catches);
		
		
	}
	
	

}
