package sorting;

public class BubbleSort {


	/*
	 * sort array in increasing order
	 * optimize j's value from (1, array.length) to (1, array.length-i + 1) 
	 */
	public int[] sort(int[] array){
		
		if(array == null){
			return null;
		}else{
			
			for(int i=1; i<array.length; i++){
				for(int j=1; j<array.length -i+1; j++){
					
					if(array[j-1]>array[j]){
						
						int tmp = array[j-1];
						array[j-1] = array[j];
						array[j] = tmp;
					}
				}
			}
			return array;
		}
		
		
	}
	

}
