package opps_concepts_2;


//like MS Word Ctrl+Z undo!
class Document implements Cloneable {
 String content;

 Document(String content) {
     this.content = content;
 }
	protected Object clone() throws CloneNotSupportedException {
	     return super.clone();
	 }
 
}

 // Hello World ✅

public class class_clone_in_java {
public static void main(String[] args) throws CloneNotSupportedException {
	Document doc     = new Document("Hello World");
	Document backup  = (Document)doc.clone();  // save state!

	//user makes changes
	doc.content = "Hello Java";
System.out.println(doc.content);
	//user presses Ctrl+Z undo!
	doc = (Document) backup.clone();  // restore!
	System.out.println(doc.content); 
}
}
