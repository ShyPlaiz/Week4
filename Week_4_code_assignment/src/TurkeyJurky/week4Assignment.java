package TurkeyJurky;


public class week4Assignment {
public static void main(String[] args) {
	
	double[] arrayd = { 22.2, 11.1, 12.2, 23.3};
	System.out.println(quesTen(arrayd));
// 1).
	// a).         
	          int[] ages = { 3, 9, 23, 64, 2, 8, 45, 28, 93}; 
              	int a = ages[ages.length-1] - ages[0];
             	System.out.println(a); 
    
	          
    // b). New age "45"	 
	          	 System.out.println(a);
	
    // c).
	       for(int i = 0; i < 9; i++) {
	    	   
	       System.out.println(ages[i]);
	       }
	          
	 
// 2).	 
	          String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; 
     //a). 
		      int sum = 0;
	          for(String name : names) {
		  
		      sum += name.length();
		      
	          }
     // b).	 
		
             System.out.println(sum);
	          
	    
	// c).	 
	
             for(int i = 0; i < 6; i++) {
			 
	       String space = " ";
	
                 System.out.print(names[i] += space);

	 }
	          
	         

	
	System.out.println(quesEight("Kevin", "McKenzie"));
	 
// 3). There's two ways to access the last element in an array. with the length of the array - 1 using .length(), or 
// calling the array specifically using the arrays index if known. ex - ( if there's 9 elements array[8] would be the last.)
      int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99}; {
    	System.out.println(array[8]);
      

//  4).The first element of an array will always start at 0. for this example its 0 is [11].
    	  System.out.println(array[0]);

	
	//  5). 
	  
	        for(int i = 0; i < names.length; i++) {
	   
		          sum = names.length;
		          
		     System.out.println(sum);
		   
		     int[] namesLength;
	        }
             //  return sum;
      }

		
	 //   6).
	            int namesLength[] = {3, 5, 3, 5, 4, 3}; 

			 int sumofNames = 0;
			 
			 for(int number : namesLength) {
			  
			 sumofNames += number;  
		  
		  System.out.println(sumofNames / namesLength.length);
	            }
	        




	  
}// end of main method 


         //7). 
              
                public String prblmsSix(String word, int n) {
                	   
                  String result = "";
                	for(int i = 0; i < n; i++) {
                	
                		System.out.println(prblmsSix("word", 9));
                	
                	result += word;  		
}
					return result;
			
					
					
					
					
}
                	
      //   8).         
        
                public static String quesEight(String firstName, String lastName) {
	 
	   String fullName;
	   
	fullName = firstName + " " + lastName;
	
	   
	   
	   return fullName;
	
	 
}



     // 9).
             public static boolean quesNine(int[] array) {
            	  int sum = 0;
            	  for(int integer : array) {
            		
            		  sum += integer;
            		  
           	  } if(sum > 100) {
    			  return true;
             }
			return false;
             }
             
      //  10).

              public static double quesTen(double[] array) {
            	  
            	  double qtSum = 0;
            	 for(double num : array) {
            		 qtSum += num;
            		 
           }qtSum = qtSum / array.length;
				return qtSum;
              }
              

            	 
            		 
              
              
              
              
              
         // 11). 
//                  public static boolean quesEleven(double[] array1, double[] array2) {
//                	  
//                	  double sum1 = 0;
//                	  double sum2 = 0;
//                	  
//                	  for(double num : array1) {
//                		  sum1 += num;
//                		  
//                		  for(double num2 : array2) {
//                			  sum2 += num2;
//                			  
//                			  if(sum1 > sum2) {
//                			 return true;
//                			 
//                			  } else {
//                				  return false;
//                			  }
//                		  }
//                	  }
                	  
                  
                  
                  
        
    // 12). 
                		// Write a method called willBuyDrink that takes a boolean isHotOutside, 
                    	  // and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.

                  
//              public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
//            	 
//            	  if(isHotOutside && moneyInPocket > 10.50) {
//            		  return true;
//            	  }
//            	  return false;
//            		  
//            	  }
//            	  
            			         
            	  
            	  
            	  
              
                			  
                				
	  
            	   
            	  
          
           // 13).
              
// Write a method that takes an int array subtracts 1 
             //   	  from each of the 10 elements. (random # in each element)
            	  
              
            	  
              
              
            
//              public static int quesThirt(int[] array) {
//				
//            	  int sum = 0;
//            	  
//            	  for(int i = 0; i < array.length; i++) {
//            		   
//            		  sum = array[i] - 1;
//            	  }
//            	  
//            	  return sum;
//				
//				
//            }
//            	  
           }



                





                
