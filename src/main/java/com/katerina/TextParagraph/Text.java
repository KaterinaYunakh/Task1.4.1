package com.katerina.TextParagraph;

import java.util.ArrayList;

public class Text{
	String title;
	ArrayList<Paragraph> arrParag = new ArrayList<Paragraph>();
	
	public Text(String title){
		this.title = title;
	}
	
	public void addParagraph(Paragraph parag){
		if (parag != null){
			arrParag.add(parag);
		}
	}
	
	public String getParagraphsString(){
		String fullText = "";
		for (Paragraph parag:this.arrParag) {
			fullText += parag.toString() + "\n";  
		}	
		return fullText;
	}
	
	public String toString(){
		String fullText = "";
		if (this.title != null){
			fullText += this.title + "\n\n";  
		}	
		return fullText + this.getParagraphsString();
	}
	
	public int hashCode(){
		return this.toString().hashCode();
	}
	
	public boolean equals(Text obj){
		return this.hashCode() == obj.hashCode();
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public void printText(){
		System.out.println(this);
	}
}