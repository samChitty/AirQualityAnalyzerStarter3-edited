//Air Quality Analyzer 3               A+CR
//Name: Sam Chitty and Tripp Davies
import java.util.ArrayList;
import java.util.Arrays;


class Main {

  public static void main(String[] args) {

    //create an array for the city names
    String[] names = new String[]{"Columbo, Sri Lanka","Manali, Chennai","Secretariat, Amaravati","Solapur, Solapur","Katraj, Pune","MIDC Khutula, Chandraur"};
   

    //create 1D arrays for each of the rows of PM2.5 levels from the table - they must all be of the same data type 
    double[] row1 = new double[]{46, 34, 42, 34, 34 ,42, 25, 25, 70, 68, 61, 55, 50, 46, 50, 61, 102, 59, 68, 61, 53, 46, 42, 34};
    
    double[] row2 = new double[]{123,100,64,56,76,156,146,68,21,63,90,116,103,94,101,77,63,99,80,76,115,118,107,126};
    
    double[] row3 = new double[]{54,44,62,29,23,31,61,52,34,62,52,21,0,17,61,59,68,57,55,42,53,65,63,57};

    double[] row4 = new double[]{14, 27, 39, 13, 31 ,19, 10, 19, 37, 55, 58, 51, 26, 0, 46, 61, 70, 56, 53, 66,84, 52, 31, 28};

    double[] row5 = new double[]{33,33,32,32,32,32,33,33,34,34,34,34,34,27,27,26,26,26,26,26,26,23,23,24};
    
    double[] row6 = new double[]{64,64,63,51,51,47,47,34,35,51,51,36,36,27,26,17,17,28,31,89,88,58,57,34};

    //create a 2D array that is an array of arrays, each row is represents a city's PM2.5 levels for 24 hours
    double[][] arr2 = {row1, row2, row3, row4, row5, row6};

 
    //call the printData method, passing the correct arguments, and printing 
    //out the cities with their 24 values for PM2.5 levels 
     printData(names,arr2);
    
    



  //create an ArrayList and add the average PM2.5 level for a day for each city by calling the average method and passing a 1D array that represents each row in the 2D array
   System.out.println();
  ArrayList<Double> avs = new ArrayList<Double>();
  for(int i=0;i<arr2.length;i++){
      avs.add(average(arr2[i]));
  }

  
  

 
    //print a summary of the cities and their average PM2.5 levels rounded to the nearest one hundredth place

    //loops for every String in the array, names, at every String found it will print the string it found as well as the corresponding PM2.5 level by calling my arraylist of averages
    System.out.println();
    int count =0;
    for(String city: names){
      System.out.println(city+": Average PM2.5 Level = "+avs.get(count));
      count++;
    }
    
    
  }//end of main method

	// The method below should print all of the data as a table. 
	// The method uses paramaters c which is the array of cities and d which is the 2D array of 24-hour PM2.5 levels.
	public static void printData(String[] c, double[][] d) {

    //for every city   
    
      //print all the corresponding values for that city
      
      
    //starts by printing the name at the beginning of every row of the 2d array, and then loops through that row printing all of its values. It will then move onto the next row
    for(int i=0;i<d.length;i++){
      System.out.println(c[i]+ " "); 
      for(int j=0;j<d[i].length;j++){
        System.out.print(d[i][j] + " ");
      }
      System.out.println();
    }

  }	

  //the method uses a parameter which is a 1D array (one row from the 2D array)
  //the method should calculate and return the average of the values in the 1D array (or row)
 
 public static double average(double[] values) {
  double av=0;
  //finds every double in the array values and adds them together to the variable av
  for(double num: values){
    av+= num;
  } 
  //takes the number found in the loop above and divides it by 24 to get the average
  av = av/values.length;
  //rounds av to 2 decimal places
  av =  Math.round(av*100.0)/100.0;
   
   return av;

}
 }
  //end of class