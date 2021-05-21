package com.oracle.coding.exercise;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		RequestHandler requestHandler = new RequestHandler();
		ResponseHandler responseHandler = new ResponseHandler();
		GetAvgDurationForEachGeoImpl avgDuration = new GetAvgDurationForEachGeoImpl();
		String delemeter = ",";

		String inputString = "2343225,2345,us_east,RedTeam,ProjectApple,3445s \n"
				+ "1223456,2345,us_west,BlueTeam,ProjectBanana,2211s \n"
				+ "3244332,2346,eu_west,YellowTeam3,ProjectCarrot,4322s \n"
				+ "1233456,2345,us_west,BlueTeam,ProjectDate,2221s \n"
				+ "3244132,2346,eu_west,YellowTeam3,ProjectEgg,4122s";

		List<TeamDetails> teamList = new ArrayList<>();
		teamList = requestHandler.handleRequest(inputString, delemeter);
		if (teamList != null) {
			responseHandler.getUniqueCustIdOnContractID(teamList, delemeter);
			responseHandler.getUniqueCustIdForGoeZone(teamList, delemeter);
			responseHandler.getUniqueCustListForGeoZone(teamList, delemeter);
			avgDuration.getAvgBuildDuration(inputString, teamList);
		}

	}

}
