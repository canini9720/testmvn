package com.testservice.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ElephantRidingSoapDTO  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@XmlElement(required = false)
	private Long emiratesID;

	@XmlElement(required = false)
	private Long referenceNo;
	
/*	@XmlElement(required = true)
	private Float height;
	
	@XmlElement(required = true)
	private Float weight;
	
	@XmlElement(required = true)
	private String landLine;
	
	@XmlElement(required = true)
	private String fax;
	
	@XmlElement(required = true)
	private String homeAddress;
	
	@XmlElement(required = true)
	private String poBox;
	
	@XmlElement(required = true)
	private String email;
	
	
	@XmlElement(required = true)
	private String emergencyName;
	
	
	@XmlElement(required = true)
	private Long horseRiding;
	
	@XmlElement(required = true)
	private Long yearOfExp;
	
	@XmlElement(required = true)
	private String emergencyMobile;
	
	
	@XmlElement(required = true)
	private String comments;
	
	@XmlElement(required = true)
	private QuestionDTO[] questionDetails;
	
	@XmlElement(required = true)
	private String trainingCenter;*/

	public Long getEmiratesID() {
		return emiratesID;
	}

	public void setEmiratesID(Long emiratesID) {
		this.emiratesID = emiratesID;
	}

	public Long getReferenceNo() {
		return referenceNo;
	}

	public void setReferenceNo(Long referenceNo) {
		this.referenceNo = referenceNo;
	}

/*	public Float getHeight() {
		return height;
	}

	public void setHeight(Float height) {
		this.height = height;
	}

	public Float getWeight() {
		return weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	public String getLandLine() {
		return landLine;
	}

	public void setLandLine(String landLine) {
		this.landLine = landLine;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getPoBox() {
		return poBox;
	}

	public void setPoBox(String poBox) {
		this.poBox = poBox;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmergencyName() {
		return emergencyName;
	}

	public void setEmergencyName(String emergencyName) {
		this.emergencyName = emergencyName;
	}

	public Long getHorseRiding() {
		return horseRiding;
	}

	public void setHorseRiding(Long horseRiding) {
		this.horseRiding = horseRiding;
	}

	public Long getYearOfExp() {
		return yearOfExp;
	}

	public void setYearOfExp(Long yearOfExp) {
		this.yearOfExp = yearOfExp;
	}

	public String getEmergencyMobile() {
		return emergencyMobile;
	}

	public void setEmergencyMobile(String emergencyMobile) {
		this.emergencyMobile = emergencyMobile;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public QuestionDTO[] getQuestionDetails() {
		return questionDetails;
	}

	public void setQuestionDetails(QuestionDTO[] questionDetails) {
		this.questionDetails = questionDetails;
	}

	public String getTrainingCenter() {
		return trainingCenter;
	}

	public void setTrainingCenter(String trainingCenter) {
		this.trainingCenter = trainingCenter;
	}

	
*/
	
	
	
	
	
	

}
