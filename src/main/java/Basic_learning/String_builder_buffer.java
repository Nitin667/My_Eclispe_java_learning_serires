package Basic_learning;

public class String_builder_buffer {
//Every time using string creates a new object
//	Step 1: "Hello"              ← new object created
//	Step 2: "Hello World"        ← NEW object created! old discarded
//	Step 3: "Hello World Java"   ← NEW object created! old discarded
//	Step 4: "Hello World Java Programming" ← NEW object!
//
//	Every + creates NEW String object!
//	1000 concatenations = 1000 objects! ❌ wasteful!
	
	
	public static void main(String[] args) {
		String aString="hello";
		aString=aString.concat("world");
		
		System.out.println(aString);// 
		
		
//		String builder
//		No new objects created!
//		same object modified!
//		much faster! ✅
		
		StringBuilder stringBuilder=new StringBuilder("Nitin skjfhskjfh kjh hfkhkjfhasld fhf jkdhsfkjadshfj h hjdh fkjhfsk hkfjhsf");
		stringBuilder.append("Good");
		stringBuilder.append("boy");
		stringBuilder.delete(0, 2);  // start end (end not included)
		System.out.println(stringBuilder);
		
		
//		String builderString  full spead ,not a thread safe, only single thread 
//		→ many changes,
//		  single thread
//        loops, building long strings
//        MOST COMMON in practice!
		
		
//		String buffer
//		ALL methods are SAME as StringBuilder!
//		Only difference is thread safety! many changes, multiple threads
//        rare in modern Java
		StringBuffer b1Buffer=new StringBuffer();
		b1Buffer.append("hello_buffer");
		b1Buffer.insert(1, " new boy");
		System.out.println(b1Buffer.getClass().getName());
		
		/*
		 Method              What it does
──────────────────────────────────────────
append(x)           add at end
insert(i, x)        add at position i
delete(s, e)        remove from s to e
deleteCharAt(i)     remove at position i
replace(s, e, x)    replace s to e with x
reverse()           reverse string
charAt(i)           get char at i
indexOf(x)          find position of x
length()            get length
toString()          convert to String
setCharAt(i, c)     change char at i
capacity()          get buffer size
		*/
		
		
		long start = System.currentTimeMillis();
		String s = "";
		for(int i = 0; i < 10000; i++) {
		    s += i;        // creates 10000 new objects!
		}
		System.out.println(s);
		System.out.println("String time: " +
		    (System.currentTimeMillis() - start) + "ms");
		
		
		
	}
}
