package com.revature.model;

public class Entity {
	private int id;
	private String TODO;
	private Boolean Completed;
	
	public Entity(String TODO,Boolean Completed){
		super();
		this.TODO = TODO;
		this.Completed = Completed;
	}
	public Entity() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTODO() {
		return TODO;
	}
	public void setTODO(String tODO) {
		TODO = tODO;
	}
	public Boolean isCompleted() {
		return Completed;
	}
	public void setCompleted(Boolean completed) {
		Completed = completed;
	}
	@Override
	public String toString() {
		return "entity [id=" + id + ", title=" + TODO + ", completed=" + Completed + "]";
	}

}
