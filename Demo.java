package com.psl.map;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

	public static void main(String[] args) {

		CityStateMap ob = new CityStateMap();
		try {
			FileInputStream fis = new FileInputStream("cityState.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			
			String string;
			while ((string = br.readLine()) != null) {
				String[] s = string.split(" ");
				ob.map.put(s[0], s[1]);
			}
			
//			if (file.available()) {
//				System.out.println("File Exists.");
//			} else {
//				System.out.println("No File!");
//			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		CityStateMap obj = new CityStateMap();
//
//		obj.map.put("Panaji", "Goa");
//		obj.map.put("Margao", "Goa");
//		obj.map.put("Ponda", "Goa");
//		obj.map.put("Belgaum", "Karnataka");
//		obj.dislayMap();

		ob.getAllCities();
		ob.printAllStates();
		System.out.println(ob.getState("Panaji"));
		ob.map.put("Panaji", "GoaNew");
		System.out.println("Before Deletion: ");
		ob.dislayMap();
		ob.delete("Goa");
		System.out.println("After Deletion of Goa: ");
		ob.dislayMap();

	}
}
