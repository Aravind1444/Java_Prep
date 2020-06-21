class Main {

  //code to sort the array

  public static void sortArray(int[] arr) {                    
    int t = 0;
    for (int i = 0; i < arr.length-1; i++) {
      for (int j = i + 1; j < arr.length; j++) { 
        if (arr[i] > arr[j]) { 
          t = arr[i]; 
          arr[i] = arr[j]; 
          arr[j] = t; 
        }
      }
    }
  }
    
  //main method having input and printing output
  //sort method is called in this  

  public static void main( String args[] ) {
    int array[] = {3, 2, 5, 7, 1};
    System.out.print( "The input array is  : " );
    for (int i =0 ; i < array.length; i++){
      System.out.print(array[i]+ "  ");
    }
    System.out.println();
    System.out.println();
    sortArray(array);     //calling the sortArray function 
    System.out.print( "The Array after sorting in the ascending order is : " );
    for (int i =0 ; i < array.length; i++){
      System.out.print(array[i]+ "  ");
    }
  }  
}     


//try the code at : https://repl.it/repls/LankyAdequateDemoware#Main.java
