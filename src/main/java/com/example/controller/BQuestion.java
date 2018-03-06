package com.example.controller;

import java.util.Map;

public class BQuestion {

	private String imageURL;
	private String boldTitle;
	private String normalTitle;
	private Map<String, String> hashMap;
	private String nextOrSeeMore;
	private String nextOrSeeMoreAnswer;
	private String channelToken;
	private String userId;
	private int idEvent;

	public BQuestion(String imageURL, String boldTitle, String normalTitle, Map<String, String> hashMap,
			String nextOrSeeMore, String nextOrSeeMoreAnswer, int idEvent) {
		super();
		this.imageURL = imageURL;
		this.boldTitle = boldTitle;
		this.normalTitle = normalTitle;
		this.hashMap = hashMap;
		this.nextOrSeeMore = nextOrSeeMore;
		this.nextOrSeeMoreAnswer = nextOrSeeMoreAnswer;
		this.idEvent = idEvent;
	}

	public Map<String, String> getHashMap() {
		return hashMap;
	}

	public void setHashMap(Map<String, String> hashMap) {
		this.hashMap = hashMap;
	}

	public int getIdEvent() {
		return idEvent;
	}

	public void setIdEvent(int idEvent) {
		this.idEvent = idEvent;
	}

	public BQuestion() {
		super();
	}

	public BQuestion(String imageURL, String boldTitle, String normalTitle, Map<String, String> hashMap,
			String nextOrSeeMore, String nextOrSeeMoreAnswer) {
		super();
		this.imageURL = imageURL;
		this.boldTitle = boldTitle;
		this.normalTitle = normalTitle;
		this.hashMap = hashMap;
		this.nextOrSeeMore = nextOrSeeMore;
		this.nextOrSeeMoreAnswer = nextOrSeeMoreAnswer;

	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
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

	public String getNextOrSeeMore() {
		return nextOrSeeMore;
	}

	public void setNextOrSeeMore(String nextOrSeeMore) {
		this.nextOrSeeMore = nextOrSeeMore;
	}

	public String getNextOrSeeMoreAnswer() {
		return nextOrSeeMoreAnswer;
	}

	public void setNextOrSeeMoreAnswer(String nextOrSeeMoreAnswer) {
		this.nextOrSeeMoreAnswer = nextOrSeeMoreAnswer;
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

}
