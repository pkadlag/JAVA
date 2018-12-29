//*********************************************************************************************************************
class InsertionSort 
{ 
    /*Function to sort array using insertion sort*/
    void sort(int array[]) 
    { 
        int number = array.length; 
        for (int i=1; i<number; ++i) 
        { 
            int key = array[i]; 
            int j = i-1; 
 
            while (j>=0 && array[j] > key) 
            { 
                array[j+1] = array[j]; 
                j = j-1; 
            } 
            array[j+1] = key; 
        } 
    } 
  
    /* A utility function to print array of size n*/
    static void printArray(int array[]) 
    { 
        int number = array.length; 
        for (int i=0; i<number; ++i) 
            System.out.print(array[i] + " "); 
  
        System.out.println(); 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    {         
        int array[] = {12, 11, 13, 5, 6}; 
  
        InsertionSort ob = new InsertionSort();         
        ob.sort(array); 
          
        printArray(array); 
    } 
}
//*********************************************************************************************************************