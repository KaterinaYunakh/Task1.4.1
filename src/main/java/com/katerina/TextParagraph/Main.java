import com.katerina.TextParagraph.*;

public class Main {
    public static void main(String[] args){
	
		Text text = new Text("Title of the text");
		text.addParagraph(new Paragraph ("Paragraph 1 text."));	
		text.addParagraph(new Paragraph ("Paragraph 2 text."));
		
		Text text2 = new Text("Title of the text2");
		text2.addParagraph(new Paragraph ("Paragraph 1 text."));		
		text2.addParagraph(new Paragraph ("Paragraph 2 text."));
		
		System.out.println(text2.getTitle());
		
		if (text.equals(text2)){
			System.out.println("texts are equal");
		} else {
			System.out.println("texts are not equal");
		}
		
		text.printText();
	
	}

}