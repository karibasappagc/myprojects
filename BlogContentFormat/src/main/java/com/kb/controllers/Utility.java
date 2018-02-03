package com.kb.controllers;

public class Utility {


	public static String getFormattedString(String input) {
		 input = input.replaceAll("pc1", "<pre class>");
		 input = input.replaceAll("pc2", "</pre>");
		 input=input.replaceAll("st1", "<strong>");
		 input=input.replaceAll("st2", "</strong>");
		 
		 input=input.replaceAll("stp1", "<strong class=\"pink-class\">");
		 
		 input=input.replaceAll("stb1", "<strong class=\"blue-class\">");
		 
		 input=input.replaceAll("stg1", "<strong class=\"light-green-class\">");
		 
		 input=input.replaceAll("lss1", "[label style=\"success\"]");
		 
		 input=input.replaceAll("lss2", "[/label]");
		 
		 input=input.replaceAll("em1", "<em>");
		 input=input.replaceAll("em2", "</em>");
		 
		 input=input.replaceAll("h41", "<h4>");
		 input=input.replaceAll("h42", "</h4>");
		 
		 input=input.replaceAll("h51", "<h5>");
		 input=input.replaceAll("h52", "</h5>");
		 
		 input=input.replaceAll("h61", "<h6>");
		 input=input.replaceAll("h62", "</h6>");
		 
		return input;
	}

}
