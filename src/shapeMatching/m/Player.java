package shapeMatching.m;

public class Player{
    
	private String name;
	private int wins;
	private int lose;
	
	public Player(){
		
	}
	
	public Player(String name){
		this.setname(name);
	}
	
	
	public void setname(String name){
		this.name = name;
	}
	
	public String getname(){
		return this.name;
	}
	
	public void setwins(int wins){
		this.wins = wins;
	}
	
	public int getwins(){
		return this.wins;
	}
	
	
	public void setlose(int lose){
		this.lose = lose;
	}
	
	public int getlose(){
		return this.lose;
	}
	
	
}