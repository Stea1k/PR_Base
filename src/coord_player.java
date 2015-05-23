
public class coord_player {
	//name
	//player num
	//action
	//score
	private static String name;
	private static Integer playerNum;
	private static Integer action;
	private static Integer score;
	
	protected String getName(){
		return this.name;
	}
	protected Integer getPlayerNum(){
		return this.playerNum;
	}
	protected Integer getAction(){
		return this.action;
	}
	protected Integer getScore(){
		return this.score;
	}
	protected void setName(String n){
		this.name = n;
	}
	protected void setPlayerNum(int i){
		this.playerNum = i;
	}
	protected void setAction(int i){
		this.action = i;
	}
	protected void setScore(int i){
		this.score = i;
	}
	public coord_player(String n,int i){
		setName(n);
		setPlayerNum(i);
		setScore(0);
	}
}
