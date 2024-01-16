package string;

public class Str_Methods {

	public static void main(String[] args) {
		
		String name = "Prashant";
		System.out.println(name);
		

		 System.out.println(name.charAt(5));
		////1. String Length		
		int value = name.length();
		System.out.println(value);
		
//2. String toLowerCase		
		String lstring= name.toLowerCase();
		System.out.println(lstring);
		
//3. String toUpperCase		
		String ustring= name.toUpperCase();
		System.out.println(ustring);
		
//4. String trim		
		String nontrim = "  ganesh gaming";
		System.out.println(nontrim);
		String newtrim = nontrim.trim();
		System.out.println(newtrim);	
	
//5. String substring(int start)		
		 System.out.println(name.substring(7));
		 System.out.println(nontrim.substring(7));
		 
//6. String substring (int start , int end)
		 System.out.println(name.substring(5,7));
		 
//7. String  replace
		 System.out.println(name.replace('a', 'z'));
		 
//8. String startsWith
		 System.out.println(name.startsWith("Pr"));
		 System.out.println(name.startsWith("nt"));
		 
//9. String endswith 
		 System.out.println(name.endsWith("nt"));
		 System.out.println(name.endsWith("pr"));
	
// 10. String charat
		 System.out.println(name.charAt(5));
		 
//11. String Indexof (char)
		System.out.println(name.indexOf('a'));
		System.out.println(name.indexOf('n'));
//12. String indexof (char, index)
		System.out.println(name.indexOf('a', 4));
		 
//13. String .equals
		System.out.println(name.equals("Prashant"));
		System.out.println(name.equals("Pra"));
		
//14. String equalsIgnoreCase
		System.out.println(name.equalsIgnoreCase("prashant"));

//15. is empty
		String a1 = "";
		System.out.println(a1.isEmpty());
	
//16. is blank
		String a2 = " ";
		System.out.println(a2.isBlank());

//17. concat		
		String a3 = " abc";
		System.out.println(name.concat(" Ronge"));
	    System.out.println(name.concat(a3));
	    
//18. 
	    String str_Sample = "This is a String contains Example";
        //Check if String contains a sequence
        System.out.println("Contains sequence 'ing': " + str_Sample.contains("ing"));
        System.out.println("Contains sequence 'Example': " + str_Sample.contains("Example"));
        //String contains method is case sensitive  
        System.out.println("Contains sequence 'example': " + str_Sample.contains("example"));
        System.out.println("Contains sequence 'is String': " + str_Sample.contains("is String"));
    
//19. replace
        String a5 = "proxy is crickter . proxy is hacker";
	    System.out.println(a5.replace("proxy", "rocky"));
	    
	  
	}

}
