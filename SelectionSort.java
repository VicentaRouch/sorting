package sorting;

public class SelectionSort {

	public int[] sort(int[] arr){
		if(arr == null){
			return null;
		}else{
			
			for(int i=0; i<arr.length-1; i++){
				for(int j = i; j< arr.length-1; j++){
					if(arr[j] > arr[j+1]){
						int tmp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = tmp;
					}
				}
			}
			return arr;
		}
	}
}
