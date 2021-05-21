package com.oracle.coding.exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GetUniqueCustIdImpl implements GetUniqueCustId {

	@Override
	public Map<String, String> getCustomerId(Map<String, String> dataMap) {

		Map<String, String> resultMap = new HashMap<>();

		Set<Map.Entry<String, String>> entrySet = dataMap.entrySet();
		Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next();
			String key = entry.getKey();
			String value = entry.getValue();

			if (resultMap.containsKey(value)) {
				resultMap.put(value, resultMap.get(value) + " , " + key);
			} else {
				resultMap.put(value, key);
			}
		}
		return resultMap;
	}
}
