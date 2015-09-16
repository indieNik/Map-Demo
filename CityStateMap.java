package com.psl.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CityStateMap {
	Map<String, String> map = new HashMap<String, String>();

	public CityStateMap() {
		// TODO Auto-generated constructor stub
	}

	public void dislayMap() {
		System.out.println(map);
	}

	public void getAllCities() {
		Iterator<String> itr = map.keySet().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public void printAllStates() {
		Iterator<String> itr = map.keySet().iterator();
		while (itr.hasNext()) {
			System.out.println(map.get(itr.next()));
		}
	}

	public void delete(String state) {
		Iterator<String> it = map.keySet().iterator();
		List<String> citySet = new ArrayList<String>();
		while (it.hasNext()) {
			String key = it.next();
			if (map.get(key).equals(state))
				citySet.add(key);
		}
		System.out.println("List of Cities to be Deleted" + citySet);
		this.map.keySet().removeAll(citySet);
	}

	public String getState(String city) {
		return this.map.get(city);
	}
}
