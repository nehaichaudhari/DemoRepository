package com.containment;

public class Author {
	private int authorId;
	private String aname;
	
	Author(){
		
	}
	
	Author(int authorId,String aname){
		this.authorId=authorId;
		this.aname=aname;
	}
	
	//getter setter
	public void setAuthorId(int authorId) {
		this.authorId=authorId;
	}
	
	public int getAuthorId() {
		return authorId;
	}
	
	public void setAname(String aname) {
		this.aname=aname;
	}
	
	public String getAname() {
		return aname;
	}
	
	//toString
	public String toString() {
		return "\nAuthor id is: "+authorId+"\nName is: "+aname;
	}

}
