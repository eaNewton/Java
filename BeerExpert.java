package edu.acc.j2ee.beerv3;

import java.util.*;

public class BeerExpert {
	public List<String> getBrands(String color) {
		List<String> brands = new ArrayList<>();
		if (color.equalsIgnoreCase("amber")) {
			brands.add("Thirsty Goat Amber Ale");
			brands.add("Live Oak Big Bark Amber Lager");
			brands.add("ABW Fire Eagle American IPA");
		}
		else if (color.equalsIgnoreCase("light")) {
			brands.add("Live Oak Hefeweizen");
			brands.add("ABW Pearl Snap");
			brands.add("Circle Blur");
			
		}
		else if (color.equalsIgnoreCase("brown")) {
			brands.add("Newcastle Brown Ale");
			brands.add("Real Ale Brewhouse Brown Ale");
			brands.add("Lagunitas Wilco Tango Foxtrot");
		}
		else if (color.equalsIgnoreCase("dark")) {
			brands.add("Adelbert's Brewery Vintage Monks");
			brands.add("ABW Black Thunder");
			brands.add("Jester King Black Metal Farmhouse Imperial Stout");
		} 
		else brands.add("An original choice gets no advice!");
		return brands;
	}
}