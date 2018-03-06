package com.example.controller;

public class DQuestion {

	private String imageUrl;
	private String boldTitle;
	private String normalTitle;
	private String channelToken;
	private String userId;
	private String label;
	private String data;
	private String mode;
	private int idEvent;

	public DQuestion(String imageUrl, String boldTitle, String normalTitle, String label, String data, String mode,
			int idEvent) {
		super();
		this.imageUrl = imageUrl;
		this.boldTitle = boldTitle;
		this.normalTitle = normalTitle;

		this.label = label;
		this.data = data;
		this.mode = mode;
		this.idEvent = idEvent;
	}

	public DQuestion() {
		super();
	}

	public DQuestion(String imageUrl, String boldTitle, String normalTitle, String label, String data, String mode) {
		super();
		this.imageUrl = imageUrl;
		this.boldTitle = boldTitle;
		this.normalTitle = normalTitle;
		this.label = label;
		this.data = data;
		this.mode = mode;
	}

	public int getIdEvent() {
		return idEvent;
	}

	public void setIdEvent(int idEvent) {
		this.idEvent = idEvent;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getBoldTitle() {
		return boldTitle;
	}

	public void setBoldTitle(String boldTitle) {
		this.boldTitle = boldTitle;
	}

	public String getNormalTitle() {
		return normalTitle;
	}

	public void setNormalTitle(String normalTitle) {
		this.normalTitle = normalTitle;
	}

	public String getChannelToken() {
		return channelToken;
	}

	public void setChannelToken(String channelToken) {
		this.channelToken = channelToken;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

}
