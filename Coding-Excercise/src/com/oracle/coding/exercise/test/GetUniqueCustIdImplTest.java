package com.oracle.coding.exercise.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.oracle.coding.exercise.GetUniqueCustIdImpl;

class GetUniqueCustIdImplTest {

	GetUniqueCustIdImpl GetUniqueCustIdImpl = new GetUniqueCustIdImpl();

	@Test
	void testGetCustomerId() {

		Map<String, String> dataMap = new HashMap<>();
		dataMap.put("3244132", "2346");
		dataMap.put("2343225", "2345");
		dataMap.put("3244332", "2346");
		dataMap.put("3244132", "2346");
		dataMap.put("1233456", "2345");
		dataMap.put("1223456", "2345");

		Map<String, String> expectedMap = new HashMap<>();

		expectedMap.put("2346", "3244132 , 3244332");
		expectedMap.put("2345", "2343225 , 1233456 , 1223456");

		Map<String, String> actualMap = GetUniqueCustIdImpl.getCustomerId(dataMap);

		assertTrue(actualMap.get("2346").equals(expectedMap.get("2346")));

	}

}
