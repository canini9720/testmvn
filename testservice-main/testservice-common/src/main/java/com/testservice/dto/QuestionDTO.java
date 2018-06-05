package com.testservice.dto;

public class QuestionDTO  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long questionId;
	
	private String question;
	
	private String questionEn;
	
	private String questionAr;
	
	private Long answer;
	
	private String answerString;

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	
	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Long getAnswer() {
		return answer;
	}

	public void setAnswer(Long answer) {
		this.answer = answer;
	}

	public String getQuestionEn() {
		return questionEn;
	}

	public void setQuestionEn(String questionEn) {
		this.questionEn = questionEn;
	}

	public String getQuestionAr() {
		return questionAr;
	}

	public void setQuestionAr(String questionAr) {
		this.questionAr = questionAr;
	}

	public String getAnswerString() {
		return answerString;
	}

	public void setAnswerString(String answerString) {
		this.answerString = answerString;
	}
	
	
	
}
