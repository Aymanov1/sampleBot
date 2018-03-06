package com.example.controller;

public class EventHelper {

	private int idEvent;
	private String nameEvent;
	private String typeEvent;
	private String typeFunction;
	private Integer previous;
	private String intentName;

	public EventHelper(int idEvent, String nameEvent, String typeEvent, String typeFunction, Integer previous,
			String intentName) {
		super();
		this.idEvent = idEvent;
		this.nameEvent = nameEvent;
		this.typeEvent = typeEvent;
		this.typeFunction = typeFunction;
		this.previous = previous;
		this.intentName = intentName;
	}

	public EventHelper() {
		super();
	}

	public int getIdEvent() {
		return idEvent;
	}

	public void setIdEvent(int idEvent) {
		this.idEvent = idEvent;
	}

	public String getNameEvent() {
		return nameEvent;
	}

	public void setNameEvent(String nameEvent) {
		this.nameEvent = nameEvent;
	}

	public String getTypeEvent() {
		return typeEvent;
	}

	public void setTypeEvent(String typeEvent) {
		this.typeEvent = typeEvent;
	}

	public String getTypeFunction() {
		return typeFunction;
	}

	public void setTypeFunction(String typeFunction) {
		this.typeFunction = typeFunction;
	}

	public Integer getPrevious() {
		return previous;
	}

	public void setPrevious(Integer previous) {
		this.previous = previous;
	}

	public String getIntentName() {
		return intentName;
	}

	public void setIntentName(String intentName) {
		this.intentName = intentName;
	}

}
