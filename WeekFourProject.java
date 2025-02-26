import java.lang.reflect.Array;

public class WeekFourProject {

	public static String main(String[] args) {
		// TODO Auto-generated method stub

		
		//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.

		//a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  

		//b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  

		//i. Make sure that there are 9 elements of type int in this new array.  

		//ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 

		//iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; //this is the ages array.
		
		int difference = ages[ages.length - 1] - ages[0]; //this is subtracting the value of the first element from the value of the last element in the array.
		System.out.println("Difference (ages): " + difference);
		
		int[]ages2 = {4, 8, 21, 65, 1, 7, 36, 96};//the is the new array.
		
		int difference2 = ages2[ages2.length - 1] - ages2[0];
		System.out.println("Difference " + difference2);
		
	double sum = 0;
		for (int age : ages2) { //this will calculate the average of the elements
			sum += age;
		}
		double average = sum / ages2.length;
		System.out.println("Average age: " + average);
		
		
		
		
		
		
		
		
		//2. "Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.

		//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.

		//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		String[] names3 = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; //this is the array
		
		int totalLetters = 0;
		for (String name : names3) { //this is going to calculate the average of the letters in the names
			totalLetters += name.length();
		}
		double averageLetters = (double) totalLetters / names3.length;
		System.out.println("Average number of letters per name: " averageLetters);
	
		
		String allNames = "";
		 for ( String name : names3) { //this is concatenating the names while adding spaces.
			 allNames += name + "";
			
		 }
		 allNames = allNames.trim(); //getting rid of trailing space
		 System.out.println("Concatenated names: " + allNames);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 //3.
		// array[array.length- 1]; This would be how to get the last element
		 
		 
		 
		 //4.
		 //array[0]; this is how you would get the first element
		 
		 
		 int[] numbers = {15, 25, 35, 45, 55};
		  int firstElement = numbers[0];
		 int lastElement = numbers[numbers.length - 1];
		 
		 System.out.println("firstElement: " + firstElement);
		 System.out.println("lasttElement: " + lastElement);
		//example of both
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 //5. "Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array."
		 String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

	        // this is the new array
	        int[] nameLengths = new int[names.length];

	        // this is filling the new array with the lengths of each name 
	        for (int i = 0; i < names.length; i++) {
	            nameLengths[i] = names[i].length();
	        }
	        System.out.print("nameLengths array: ");
	        for (int length : nameLengths) { //this is to print the array
	            System.out.print(length + " ");
	      

	        
	        
	        
	        
	        
	        
	        
	        
	        
	        //6. "Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console."
	            int sum2 = 0;//initializes
		        for (int length : nameLengths) { //enhanced for loop assigning each element to a variable length
		            sum2 += length; //this will calculate the sum of all the elements in the new array 
		        }
		        System.out.println("Sum of nameLengths array: " + sum2);
		        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	     //7. " Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times"
	        StringBuilder result = new StringBuilder(); //object result is created
	        for (int i = 0; i < n; i++) { //looping to append the words
	            result.append(word); // this will add the word to the result as many times as n is 
	        }
	        return result.toString();
	}
	System.out.println( repeatWord("Hello", 3));
	        
	
	
	
	
	
	
	
	
	//8. "Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space)."
	
	public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName; // using a space to concat
     
        System.out.println(getFullName("Emma", "Gross"));       
	        
	      
	        
	        
	        
	        
	        
	        
	        
	        
        //9.Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
        int sum = 0; 
        
        // this will loop and add the elements to the sum
        for (int num : numbers) {
            sum += num;
        }

        // this will check if the sum is greater than 100
        return sum > 100;
    }

   
	 
	        
	            
	        
	        

        
       //10.  Write a method that takes an array of double and returns the average of all the elements in the array
        if (numbers.length == 0) {
            return 0; 
        }
        
        double sum = 0; // initializing sum
        
        // looping through and adding the elements to the sum
        for (double num : numbers) {
            sum += num;
        }

        // this is what will calculate/return average
        return sum / numbers.length;
    }

    public static void main(String[] args) {
        // for example
        double[] array1 = {10.5, 20.0, 30.5}; //these will take the average
        double[] array2 = {5.0, 15.0, 10.0, 70.0, 5.0}; //same here^
        
        System.out.println(calculateAverage(array1)); 
        System.out.println(calculateAverage(array2));
        
        
        
        
        
        
        
        
        
        
        
        
        
        //11.Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
        //first calculate the averages of the arrays
        double avg1 = calculateAverage(array1);
        double avg2 = calculateAverage(array2);

        // this will compare the averages
        return avg1 > avg2;
    }

    // using a helper method helps to calculate the average of an array
    public static double calculateAverage(double[] numbers) {
        if (numbers.length == 0) {
            return 0; //avoid an error for division by zero
        }
        
        double sum = 0; //initialize sum
        for (double num : numbers) { //enhanced loop to iterate through numbers
            sum += num; //each element gets added to the sum
        }

        return sum / numbers.length;
    }

    public static void main(String[] args) {
        // Example test cases
        double[] arr1 = {10.0, 20.0, 30.0}; 
        double[] arr2 = {5.0, 15.0, 10.0, 5.0}; //to get average
        
        System.out.println(isFirstAverageGreater(arr1, arr2)); // Output: true

        double[] arr3 = {5.0, 10.0, 5.0}; //to get average
        double[] arr4 = {10.0, 15.0, 20.0}; 
        
        System.out.println(isFirstAverageGreater(arr3, arr4)); 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //12.Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50
        public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50; //will return true IF <
    

   
    
   
    
    
    
    
    //13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.

//this will be to find the maximum value in this array
    int max = numbers[0]; //first element
    for (int num : numbers) { //the enhanced loop will iterate through the numbers in the array
        if (num > max) { //now this is to compare each number to be able to find the maximum
            max = num;
        }
    
    return max;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
		



