class Main {
  public static void main(String[] args) {
    int arr[] = {3, 2, 5, 7, 1};
        
    int m = arr[0];
      for (int i=1; i<arr.length; i++) {
        if (arr[i]>m) {
                m = arr[i];
        }
      }
    System.out.println( "The maximum value in the array is : " + m);
  }
}

//try the code at : https://repl.it/repls/ForthrightSunnyNumerator#Main.java
