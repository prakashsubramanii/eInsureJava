package com.hackathon.einsure.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="")
public class PolicyDetails {

private Long id;
private String description;
private List<String> features;
private TermsandConditions terms;

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public List<String> getFeatures() {
	return features;
}
public void setFeatures(List<String> features) {
	this.features = features;
}
public TermsandConditions getTerms() {
	return terms;
}
public void setTerms(TermsandConditions terms) {
	this.terms = terms;
}


}
