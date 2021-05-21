package com.oracle.coding.exercise.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.oracle.coding.exercise.GetAvgDurationForEachGeoImpl;
import com.oracle.coding.exercise.TeamDetails;

class GetAvgDurationForEachGeoImplTest {

	GetAvgDurationForEachGeoImpl GetAvgDurationForEachGeoImplTest = new GetAvgDurationForEachGeoImpl();

	@Test
	void testGetAvgBuildDuration() {

		String inputString = "2343225,2345,us_east,RedTeam,ProjectApple,3445s \n";

		TeamDetails teamDetails = new TeamDetails();
		teamDetails.setBuildDuration("3445s");
		teamDetails.setContractId("2345");
		teamDetails.setCustomerId("2343225");
		teamDetails.setGeoZone("us_east");
		teamDetails.setProjectCode("ProjectApple");
		teamDetails.setTeamCode("RedTeam");

		TeamDetails teamDetails1 = new TeamDetails();
		teamDetails1.setBuildDuration(" ");
		teamDetails1.setContractId("2345");
		teamDetails1.setCustomerId("2343225");
		teamDetails1.setGeoZone("us_east");
		teamDetails1.setProjectCode("ProjectApple");
		teamDetails1.setTeamCode("RedTeam");

		List<TeamDetails> teamList = new ArrayList<>();
		teamList.add(teamDetails);
		teamList.add(teamDetails1);

		Map<String, Integer> expectedResult = new HashMap<>();
		expectedResult.put("us_east", 3445);

		Map<String, Integer> actualResult = GetAvgDurationForEachGeoImplTest.getAvgBuildDuration(inputString, teamList);

		assertTrue(actualResult != null);
		assertTrue(expectedResult.get("us_east").equals(actualResult.get("us_east")));
	}

}
