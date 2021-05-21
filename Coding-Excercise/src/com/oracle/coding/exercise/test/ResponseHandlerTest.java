package com.oracle.coding.exercise.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.oracle.coding.exercise.ResponseHandler;
import com.oracle.coding.exercise.TeamDetails;

class ResponseHandlerTest {

	@Test
	void testGetUniqueCustIdOnContractID() {

		ResponseHandler responseHandler = new ResponseHandler();

		Map<String, String> expectedData = new HashMap<>();

		String regex = ",";

		TeamDetails teamDetails = new TeamDetails();
		teamDetails.setBuildDuration("3445s");
		teamDetails.setContractId("2345");
		teamDetails.setCustomerId("2343225");
		teamDetails.setGeoZone("us_east");
		teamDetails.setProjectCode("ProjectApple");
		teamDetails.setTeamCode("RedTeam");

		List<TeamDetails> inputList = new ArrayList<>();
		inputList.add(teamDetails);

		expectedData = responseHandler.getUniqueCustIdOnContractID(inputList, regex);

		assertTrue(expectedData != null);
	}

	@Test
	void testGetUniqueCustIdForGoeZone() {
		ResponseHandler responseHandler = new ResponseHandler();

		Map<String, String> expectedData = new HashMap<>();

		String regex = ",";

		TeamDetails teamDetails = new TeamDetails();
		teamDetails.setBuildDuration("3445s");
		teamDetails.setContractId("2345");
		teamDetails.setCustomerId("2343225");
		teamDetails.setGeoZone("us_east");
		teamDetails.setProjectCode("ProjectApple");
		teamDetails.setTeamCode("RedTeam");

		List<TeamDetails> inputList = new ArrayList<>();
		inputList.add(teamDetails);

		expectedData = responseHandler.getUniqueCustIdForGoeZone(inputList, regex);

		assertTrue(expectedData != null);
	}

	@Test
	void testGetUniqueCustListForGeoZone() {
		ResponseHandler responseHandler = new ResponseHandler();

		Map<String, String> expectedData = new HashMap<>();

		String regex = ",";

		TeamDetails teamDetails = new TeamDetails();
		teamDetails.setBuildDuration("3445s");
		teamDetails.setContractId("2345");
		teamDetails.setCustomerId("2343225");
		teamDetails.setGeoZone("us_east");
		teamDetails.setProjectCode("ProjectApple");
		teamDetails.setTeamCode("RedTeam");

		List<TeamDetails> inputList = new ArrayList<>();
		inputList.add(teamDetails);

		expectedData = responseHandler.getUniqueCustListForGeoZone(inputList, regex);

		assertTrue(expectedData != null);
	}

}
