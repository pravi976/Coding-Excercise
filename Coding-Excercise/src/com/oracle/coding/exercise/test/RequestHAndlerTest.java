package com.oracle.coding.exercise.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.oracle.coding.exercise.RequestHandler;
import com.oracle.coding.exercise.TeamDetails;

class RequestHAndlerTest {

	@Test
	void test() {

		RequestHandler requestHandler = new RequestHandler();

		String inputString = "2343225,2345,us_east,RedTeam,ProjectApple,3445s \n";

		String regex = ",";

		TeamDetails teamDetails = new TeamDetails();
		teamDetails.setBuildDuration("3445s");
		teamDetails.setContractId("2345");
		teamDetails.setCustomerId("2343225");
		teamDetails.setGeoZone("us_east");
		teamDetails.setProjectCode("ProjectApple");
		teamDetails.setTeamCode("RedTeam");

		List<TeamDetails> expectedList = new ArrayList<>();
		expectedList.add(teamDetails);

		List<TeamDetails> actualList = requestHandler.handleRequest(inputString, regex);

		assertEquals(expectedList.get(0).getCustomerId(), actualList.get(0).getCustomerId());
	}

}
