package com.regnant;

public class Strings {
	
	public static void main(String[] args) {
		
  //To print a given string in upper case
	
	String upper ="hii welcome to string";
	
    String  d= upper.toUpperCase();
	

    System.out.println(d);

   // To print a given string in lower case

    String lower ="HI WELCOME TO STRINGS";
    
 String h = lower.toLowerCase();

    System.out.println(h);


   // Reverse a string
    
    String reverse ="Hi welcome to java";
    
    StringBuffer hii =new StringBuffer(reverse);
    
  StringBuffer k=  hii.reverse();
    
    System.out.println(k);
    
    //Write a program for swapping of two string
    
    
    String swa = "uma";
    
    String wap="maheswar";
    
    String gl=swa;
    
     swa=wap;
     
     wap=gl;
     
     System.out.println("the value of swa after swapping is "+swa   );
     
     System.out.println("the value of swa after swapping is "+wap   );
    


     //program to remove all white spaces from a string
     
     String uma ="                       hi  welcome     to     java                ";
     
     
  String l= uma.replaceAll(" ","");
  
  
     
  System.out.println(l);
     
     
     
     //convert string to integer and integer to string in java
     
     
     String data ="345";
     
     int y =Integer.valueOf(data);
     
     System.out.println(y);
     
     int is = 438;
     
     String t=String.valueOf(is);
     
     System.out.println(t);
     
     
    // find duplicate characters in a string
     
     String str = "129 177";
     
     char[] inp = str.toCharArray();
     
     for (int i = 0; i < str.length(); i++) {
    	 
      for (int j = i + 1; j < str.length(); j++) {
    	  
       if (inp[i] == inp[j]) {
    	   
    	   System.out.println("Duplicate Characters are:");
    	   
        System.out.println(inp[j]);
       
       
      }
     }
     }
     System.out.println();
     
     //count number of vowels and consonants in a String
  
     String ovel=" umamaheswar";
     int c =0;
     int e =0;
     
     
     char [] in = ovel.toCharArray();
     
     for (int b=0;b<ovel.length();b++)  
     {
    	 
    if(in[b]=='a'||in[b]=='e'||in[b]=='i'||in[b]=='o'||in[b]=='u')
    {
    	
    	c++;
    	
    }
    
	 else if(in[b]>='b' && in[b]<='z') {
				  
				 e++; 
			 		  
			  }
     }
			 
    System.out.println(c);
			 
    System.out.println(e);
       
   // check if String is Palindrome
    
     String palen ="121";
     
     StringBuffer drome = new StringBuffer(palen);
     
     StringBuffer ravi = drome.reverse();
     String q =ravi.toString();
     
     
     if(ravi.equals(drome)) 
     {
    	 
    	System.out.println("given String is palendrome"); 
    	 
     }
     else 
     {
      	 System.out.println("given string is not a palendrome");
    	
     }	 
      	 
      	 
      	 
      	 

 		String s = "hi  mji";
 		
 		char []vv=s.toCharArray();
  
 		int count = 1;
 		
  
 		for (int i = 0; i < s.length() ; i++)
 		{
 			if ((vv[i] == ' ') && (vv[i +1] != ' '))
 			{
 				count++;
 				
  
 			}
 		}
  		System.out.println("Number of words in a string = " + count);
      	 
      	 
      	 
      	 
      	 
      	 
      	 
     
     
	}  
}
