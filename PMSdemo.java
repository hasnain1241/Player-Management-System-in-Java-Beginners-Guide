package Management;

public class PMSdemo {

	public static void main(String[] args) {
	
		CricketPlayer c1=new CricketPlayer("Babar Azam", 28, 1, 56, "Paksitan", "Batsman", 15000, 21, 241);
		CricketPlayer c2 = new CricketPlayer("Virat Kohli", 35, 1, 72, "India", "Batsman", 22000, 28, 254);
		CricketPlayer c3 = new CricketPlayer("Joe Root", 33, 2, 44, "England", "Batsman", 18000, 17, 229);
		CricketPlayer c4 = new CricketPlayer("Pat Cummins", 30, 3, 10, "Australia", "Bowler", 3500, 200, 49);
		CricketPlayer c5 = new CricketPlayer("Kane Williamson", 34, 1, 38, "New Zealand", "Batsman", 16000, 14, 219);
		CricketPlayer c6 = new CricketPlayer("Shaheen Afridi", 24, 4, 2, "Pakistan", "Bowler", 1000, 180, 40);
		CricketPlayer c7 = new CricketPlayer("Jos Buttler", 33, 2, 30, "England", "Wicketkeeper-Batsman", 11000, 8, 206);
		CricketPlayer c8 = new CricketPlayer("Trent Boult", 34, 3, 7, "New Zealand", "Bowler", 1500, 250, 51);
		CricketPlayer c9 = new CricketPlayer("David Warner", 37, 1, 45, "Australia", "Batsman", 19000, 20, 250);
		CricketPlayer c10 = new CricketPlayer("Jasprit Bumrah", 30, 4, 5, "India", "Bowler", 1200, 170, 45);
		CricketPlayer c11 = new CricketPlayer("Shakib Al Hasan", 36, 2, 15, "Bangladesh", "All-rounder", 12000, 110, 260);
		CricketPlayer c12 = new CricketPlayer("Quinton de Kock", 31, 2, 25, "South Africa", "Wicketkeeper-Batsman", 14000, 11, 214);
		
		
		
		team t1=new team("Islamabad Titans");
		team t2 = new team("Lahore Leopards");
		team t3 = new team("Karachi Kings");
		team t4 = new team("Peshawar Panthers");
		
		
		t1.addPlayer(c11);
		t2.addPlayer(c10);
		t3.addPlayer(c12);
		t4.addPlayer(c9);
		t1.addPlayer(c1);
		
		t1.DisplayPlayers();

		
		
	}

}
