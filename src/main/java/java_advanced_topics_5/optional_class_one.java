package java_advanced_topics_5;

import java.awt.Frame;

public class optional_class_one {
	
	static Frame frame;
	 optional_class_one() {
		// TODO Auto-generated constructor stub
		 frame=new Frame();
	}
	
	
	
public static void main(String[] args) {
	optional_class_one t=new optional_class_one();
	if(frame!=null) {
		frame.setVisible(true);
	}
	
	else {
		System.out.println("it contains null value");
	}
	
//	to handle the null values we use optional calss
}
}
