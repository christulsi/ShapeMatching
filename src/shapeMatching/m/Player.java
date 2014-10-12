package shapeMatching.m;

public class Player{
    
	private String name;
	private int wins = 0;
	private int lose = 0;
	
	public Player(String name){
		
		setname(name);
	}
	
	
	public void setname(String name){
		
		this.name = name;
	}
	
	public String getname(){
		
		return name;
	}
	
	public void setwins(int wins){
		
		this.wins = wins;
	}
	
	public int getwins(){
		
		return wins;
	}
	
	
	public void setlose(int lose){
		
		this.lose = lose;
	}
	
	public int getlose(){
		
		return lose;
	}
	
}