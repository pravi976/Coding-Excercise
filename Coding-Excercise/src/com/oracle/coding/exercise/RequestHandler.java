package com.oracle.coding.exercise;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RequestHandler {

	public List<TeamDetails> handleRequest(String inputString, String regex) {

		List<String[]> stringList = new ArrayList<>();
		List<TeamDetails> teamList = new ArrayList<>();

		if (inputString != null) {
			new BufferedReader(new StringReader(inputString)).lines()
					.forEach((line) -> stringList.add(line.split(regex)));
			for (String[] s1 : stringList) {

				TeamDetails teamDetails = new TeamDetails();

				teamDetails.setCustomerId(Arrays.asList(s1).get(0));
				teamDetails.setContractId(Arrays.asList(s1).get(1));
				teamDetails.setGeoZone(Arrays.asList(s1).get(2));
				teamDetails.setTeamCode(Arrays.asList(s1).get(3));
				teamDetails.setProjectCode(Arrays.asList(s1).get(4));
				teamDetails.setBuildDuration(Arrays.asList(s1).get(5));
				teamList.add(teamDetails);
			}
		} else {
			System.out.println("Request Data is Missing");
		}
		return teamList;
	}

}
