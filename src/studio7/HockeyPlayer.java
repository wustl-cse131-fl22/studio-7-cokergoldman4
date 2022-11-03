package studio7;

public class HockeyPlayer {
	
	private String name;
	private int jerseyNumber;
	private String hand;
	private String shootType;
	private int goals;
	private int assists;
	private int gamesPlayed;

	
	public HockeyPlayer(String name, int jerseyNumber, String hand, String shootType) {
		super();
		this.name = name;
		this.jerseyNumber = jerseyNumber;
		this.hand = hand;
		this.shootType = shootType;
		this.goals = 0;
		this.assists = 0;
		this.gamesPlayed = 0;
	}


	public void game(int goals, int assists) {
		this.goals += goals;
		this.assists += assists;
		this.gamesPlayed++;
	}
	
	public int getPoints() {
		return this.goals + this.assists;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getJerseyNumber() {
		return jerseyNumber;
	}


	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}


	public String getHand() {
		return hand;
	}


	public void setHand(String hand) {
		this.hand = hand;
	}


	public String getShootType() {
		return shootType;
	}


	public void setShootType(String shootType) {
		this.shootType = shootType;
	}


	public int getGoals() {
		return goals;
	}


	public void setGoals(int goals) {
		this.goals = goals;
	}


	public int getAssists() {
		return assists;
	}


	public void setAssists(int assists) {
		this.assists = assists;
	}


	public int getGamesPlayed() {
		return gamesPlayed;
	}


	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}
	
	public static void main(String[] args) {
		HockeyPlayer joe = new HockeyPlayer("Joe", 45, "right", "left");
		joe.game(8, 5);
		System.out.println(joe.getPoints());
	}
	
	
	

}
