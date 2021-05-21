package com.oracle.coding.exercise;

public class TeamDetails {

	private String customerId;
	private String contractId;
	private String geoZone;
	private String teamCode;
	private String projectCode;
	private String buildDuration;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getGeoZone() {
		return geoZone;
	}

	public void setGeoZone(String geoZone) {
		this.geoZone = geoZone;
	}

	public String getTeamCode() {
		return teamCode;
	}

	public void setTeamCode(String teamCode) {
		this.teamCode = teamCode;
	}

	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getBuildDuration() {
		return buildDuration;
	}

	public void setBuildDuration(String buildDuration) {
		this.buildDuration = buildDuration;
	}

}
