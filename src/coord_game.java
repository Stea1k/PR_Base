import java.util.LinkedList;


public class coord_game {
	//gameName
	//game type
	//available players
	//available strategies
	private static String gameName;
	private static String gameType;
	private static LinkedList<coord_player> players;
	private static LinkedList<coord_strategy> gameStratList;
	
	protected String getGameName(){
		return this.gameName;
	}
	protected String getGameType(){
		return this.gameType;
	}
	protected LinkedList<coord_player> getPlayers(){
		return this.players;
	}
	protected LinkedList<coord_strategy> getGameStratList(){
		return this.gameStratList;
	}

	//set of players depends on game being played.
	//set of Strategies depends on game being played.
	protected void setGameName(String n){
		this.gameName = n;
	}
	protected void setGameType(String g){
		this.gameType = g;
	}
	protected void setPlayers(){
		this.players = new LinkedList<coord_player>();
	}
	protected void setGameStratList(){
		this.gameStratList = new LinkedList<coord_strategy>();
	}
	
	//TODO: These probably belong within the coordination main file.
	//<>
	public void addPlayerToPlayers(coord_player p){
		this.players.add(p);
	}
	public void addStratToStratList(coord_strategy s){
		this.gameStratList.add(s);
	}
	//<>
	
	public coord_game(String Name, String Type){
		setGameName(Name);
		setGameType(Type);
		setPlayers();
		setGameStratList();
	}
}
