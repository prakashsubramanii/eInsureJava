package com.hackathon.einsure.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Policy {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long id;
private String insurer;
private String plan;
private String entryAge;
private int maxMaturityAge;
private String policyTerm;
private String minimumPremium;
private String minimumSumAssured;

public String getInsurer() {
	return insurer;
}
public void setInsurer(String insurer) {
	this.insurer = insurer;
}
public String getPlan() {
	return plan;
}
public void setPlan(String plan) {
	this.plan = plan;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getEntryAge() {
	return entryAge;
}
public void setEntryAge(String entryAge) {
	this.entryAge = entryAge;
}
public int getMaxMaturityAge() {
	return maxMaturityAge;
}
public void setMaxMaturityAge(int maxMaturityAge) {
	this.maxMaturityAge = maxMaturityAge;
}
public String getPolicyTerm() {
	return policyTerm;
}
public void setPolicyTerm(String policyTerm) {
	this.policyTerm = policyTerm;
}
public String getMinimumPremium() {
	return minimumPremium;
}
public void setMinimumPremium(String minimumPremium) {
	this.minimumPremium = minimumPremium;
}
public String getMinimumSumAssured() {
	return minimumSumAssured;
}
public void setMinimumSumAssured(String minimumSumAssured) {
	this.minimumSumAssured = minimumSumAssured;
}

};
