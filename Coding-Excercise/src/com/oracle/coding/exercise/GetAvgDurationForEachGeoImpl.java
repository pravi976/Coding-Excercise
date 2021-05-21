package com.oracle.coding.exercise;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetAvgDurationForEachGeoImpl implements GetAvgDurationForEachGeo {

	@Override
	public Map<String, Integer> getAvgBuildDuration(String inputString, List<TeamDetails> teamList) {

		List<String[]> dataList = new ArrayList<>();
		String regex = ",";
		new BufferedReader(new StringReader(inputString)).lines().forEach((line) -> dataList.add(line.split(regex)));
		Map<String, Integer> responseMap = new HashMap<>();

		int i;
		int j = 0;
		for (String[] stringLines : dataList) {

			String getString = "";

			getString = Arrays.asList(stringLines).get(5).substring(0,
					Arrays.asList(stringLines).get(5).trim().length());
			getString = getString.substring(0, getString.length()-1).trim();
			i = Integer.parseInt(getString);
			if (responseMap.containsKey(Arrays.asList(stringLines).get(2))) {
				j++;
				i += i / j;
			}
			responseMap.put(Arrays.asList(stringLines).get(2), i);
		}
		responseMap.forEach((k, v) -> System.out.println("geoZone >>==>" + k + ", avgDuration >>===>{" + v + "}"));

		return responseMap;
	}
}
