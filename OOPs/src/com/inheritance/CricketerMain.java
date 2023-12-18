package com.inheritance;

class Cricketer {
	private int playerId;
	private String name;
	private boolean isBaller;
	private float strikerate;
	private int runs;

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setIsBaller(boolean isBaller) {
		this.isBaller = isBaller;
	}

	public boolean getIsBaller() {
		return isBaller;
	}

	public void setStrikerate(float strikerate) {
		this.strikerate = strikerate;
	}

	public float getStrikerate() {
		return strikerate;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getRuns() {
		return runs;
	}

}

public class CricketerMain {
	public static void main(String[] args) {
		Cricketer c1 = new Cricketer();
		c1.setPlayerId(1);
		c1.setName("sachin");
		c1.setIsBaller(true);
		c1.setStrikerate(86.23f);
		c1.setRuns(18426);
		System.out.println("player is: "+c1.getPlayerId());
		System.out.println("name is: "+c1.getName());
		System.out.println("player is baller: "+c1.getIsBaller());
		System.out.println("stricke rate: "+c1.getStrikerate());
		System.out.println("runs: "+c1.getRuns());
	}
}
