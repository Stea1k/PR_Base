import java.util.ArrayList;
import java.util.LinkedList;


public class coord_strategy {
	//strategy name
	//game size
	//array[player1 value, player2 value]
	private static String stratName;
	private static LinkedList<Integer> stratValues;
	private static Integer IntendedGameSize;
	
	protected String getStratName(){
		return this.stratName;
	}
	protected LinkedList<Integer> getStratValues(){
		return this.stratValues;
	}
	protected Integer getIntendedGameSize(){
		Integer gs =this.getStratValues().size();
		return gs;
	}
	
	protected void setStratName(String s){
		this.stratName = s;
	}
	protected void setStratValues(ArrayList<Integer> values){
		for(int x = 0; x < values.size(); x ++){
			this.stratValues.add(values.get(x));
		}
	}
	protected void setIntendedGameSize(){
		this.IntendedGameSize = this.getIntendedGameSize();
	}
	
	public coord_strategy(String n, ArrayList<Integer> values){
		setStratName(n);
		setStratValues(values);
		setIntendedGameSize();
	}
}
