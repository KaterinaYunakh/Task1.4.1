package com.katerina.TextParagraph;


public class Paragraph{
	String text;
	
	public Paragraph(String text){
		this.text = text;
	}
	
	public String toString(){
		if (this.text != null){
			return this.text;
		}
		return "";
	}
	
	public int hashCode(){
		if (this.text != null){
			return this.text.hashCode();
		}
		return 0;
	}
	
	public boolean equals(Paragraph obj){
		return this.hashCode() == obj.hashCode();
	}
}