package Management;
import java.util.ArrayList;
import java.util.List;

public class team {
	
	private List<CricketPlayer>c1;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public team(String name) {
		
		c1= new ArrayList<>();
		this.name = name;
	}
	
	
	public void addPlayer(CricketPlayer p1)
	{
		c1.add(p1);
		
	}
	
	public void removePlayer(int  id)
	{
		c1.remove(id);
	}
	
	public void DisplayPlayers()
	{
		System.out.println("Team Name is :"+name);
		System.out.println("\n");
		for(CricketPlayer p1:c1)
		{
			p1.display();
			System.out.println("\n");
			
		}
		
	}

	
	

}
