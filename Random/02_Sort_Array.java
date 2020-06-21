class SortArr {
    public static void sortAsc(int[] arr) {                       //code to sort the array
        int t = 0;
        for (int i = 0; i < arr.length-1; i++) 
        {
            for (int j = i + 1; j < arr.length; j++) 
            { //to get them compared with the current element 
                if (arr[i] > arr[j]) 
                { //the current element
                    t = arr[i]; 
                    arr[i] = arr[j]; 
                    arr[j] = t; 
                }
            }
        }
    }
    
    //code to print the array before and after sorting
    
    public static void main( String args[] ) {
        int array[] = {3, 2, 5, 7, 1};
        System.out.println( "Array values before sorting : " );
        for (int i =0 ; i < array.length; i++){
            System.out.print(array[i]+ "  ");
        }
        System.out.println();
        sortAsc(array);
        System.out.println( "Array values after sorting : " );
        for (int i =0 ; i < array.length; i++){
            System.out.print(array[i]+ "  ");
        }
    }
}     
