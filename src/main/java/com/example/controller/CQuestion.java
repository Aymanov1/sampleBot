package com.example.controller;

public class CQuestion {

	private String msgTemplate;
	private String msgFirstAnswer;
	private String msgSecondAnswer;
	private String titleTemplate;
	private String msgSecondAnswerToSend;
	private String msgFirstAnswerToSend;
	private int idEvent;

	public CQuestion() {
		super();
	}

	public CQuestion(String msgTemplate, String msgFirstAnswer, String msgSecondAnswer, String titleTemplate,
			String msgSecondAnswerToSend, String msgFirstAnswerToSend, int idEvent) {
		super();
		this.msgTemplate = msgTemplate;
		this.msgFirstAnswer = msgFirstAnswer;
		this.msgSecondAnswer = msgSecondAnswer;
		this.titleTemplate = titleTemplate;
		this.msgSecondAnswerToSend = msgSecondAnswerToSend;
		this.msgFirstAnswerToSend = msgFirstAnswerToSend;
		this.idEvent = idEvent;
	}

	public int getIdEvent() {
		return idEvent;
	}

	public void setIdEvent(int idEvent) {
		this.idEvent = idEvent;
	}

	public String getMsgTemplate() {
		return msgTemplate;
	}

	public void setMsgTemplate(String msgTemplate) {
		this.msgTemplate = msgTemplate;
	}

	public String getMsgFirstAnswer() {
		return msgFirstAnswer;
	}

	public void setMsgFirstAnswer(String msgFirstAnswer) {
		this.msgFirstAnswer = msgFirstAnswer;
	}

	public String getMsgSecondAnswer() {
		return msgSecondAnswer;
	}

	public void setMsgSecondAnswer(String msgSecondAnswer) {
		this.msgSecondAnswer = msgSecondAnswer;
	}

	public String getTitleTemplate() {
		return titleTemplate;
	}

	public void setTitleTemplate(String titleTemplate) {
		this.titleTemplate = titleTemplate;
	}

	public String getMsgSecondAnswerToSend() {
		return msgSecondAnswerToSend;
	}

	public void setMsgSecondAnswerToSend(String msgSecondAnswerToSend) {
		this.msgSecondAnswerToSend = msgSecondAnswerToSend;
	}

	public String getMsgFirstAnswerToSend() {
		return msgFirstAnswerToSend;
	}

	public void setMsgFirstAnswerToSend(String msgFirstAnswerToSend) {
		this.msgFirstAnswerToSend = msgFirstAnswerToSend;
	}

}
