package capgemini.day4;

public class Sortingelementsofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int [] arr1 = new int [] {9, 1, 308, 767, 101};     
        int temp = 0;    
            
        System.out.println("Before Sorting: ");    
        for (int i = 0; i < arr1.length; i++) {     
            System.out.print(arr1[i] + " ");    
        }    
            
        for (int i = 0; i < arr1.length; i++) {     
            for (int j = i+1; j < arr1.length; j++) {     
               if(arr1[i] > arr1[j]) {    
                   temp = arr1[i];    
                   arr1[i] = arr1[j];    
                   arr1[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
        System.out.println("After Sorting: ");    
        for (int i = 0; i < arr1.length; i++) {     
            System.out.print(arr1[i] + " ");    
        }    
    }    


}

