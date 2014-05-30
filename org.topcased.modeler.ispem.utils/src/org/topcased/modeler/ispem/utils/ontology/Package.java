package org.topcased.modeler.ispem.utils.ontology;

import java.util.ArrayList;
import java.util.List;

public class Package {
private String name;
private String uri;
private String description;
private String ontologyUri="";
private List<Package> childrens;
public Package()
{
	name="";
	uri="";
	setOntologyUri("");
	description="";
	childrens= new ArrayList<Package>();
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getUri() {
	return uri;
}
public void setUri(String uri) {
	this.uri = uri;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public List<Package> getChildrens() {
	return childrens;
}
public String getOntologyUri() {
	return ontologyUri;
}
public void setOntologyUri(String ontologyUri) {
	this.ontologyUri = ontologyUri;
}
}
