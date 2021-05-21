package com.oracle.coding.exercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResponseHandler {

	Map<String, String> stringMap;
	GetUniqueCustIdImpl getUniqueCustIdImpl = new GetUniqueCustIdImpl();
	GetAvgDurationForEachGeoImpl getAvgDurationImpl = new GetAvgDurationForEachGeoImpl();
	Map<String, String> responseMap;

	public Map<String, String> getUniqueCustIdOnContractID(List<TeamDetails> teamList, String regex) {

		responseMap = new HashMap<>();
		stringMap = new HashMap<String, String>();

		if (teamList != null && teamList.size() > 0) {
			for (int k = 0; k < teamList.size(); k++) {
				stringMap.put(teamList.get(k).getCustomerId().trim(), teamList.get(k).getContractId().trim());
			}
			responseMap = getUniqueCustIdImpl.getCustomerId(stringMap);

			responseMap.forEach((k, v) -> System.out.println(
					"CustomerID >>===>" + k + ", number Of ContractID's >>===> " + v.split(regex).length + ""));
		} else {
			System.out.println("Please provide requestData");
		}

		return responseMap;
	}

	public Map<String, String> getUniqueCustIdForGoeZone(List<TeamDetails> teamList, String regex) {

		stringMap = new HashMap<>();
		responseMap = new HashMap<>();

		if (teamList != null && teamList.size() > 0) {
			for (int k = 0; k < teamList.size(); k++) {
				stringMap.put(teamList.get(k).getCustomerId().trim(), teamList.get(k).getGeoZone().trim());
			}

			responseMap = getUniqueCustIdImpl.getCustomerId(stringMap);

			responseMap.forEach((k, v) -> System.out
					.println("geoZone >>===>" + k + ", number Of ContractID's >>===> " + v.split(regex).length + ""));
		} else {
			System.out.println("Please provide requestData");
		}

		return responseMap;
	}

	public Map<String, String> getUniqueCustListForGeoZone(List<TeamDetails> teamList, String regex) {

		stringMap = new HashMap<>();
		responseMap = new HashMap<>();
		if (teamList != null && teamList.size() > 0) {
			for (int k = 0; k < teamList.size(); k++) {
				stringMap.put(teamList.get(k).getCustomerId().trim(), teamList.get(k).getGeoZone().trim());
			}

			responseMap = getUniqueCustIdImpl.getCustomerId(stringMap);

			responseMap.forEach(
					(k, v) -> System.out.println("geoZone >>===>" + k + ", List Of ContractID's >>===> " + v + ""));
		} else {
			System.out.println("Please provide requestData");
		}

		return responseMap;

	}

}
