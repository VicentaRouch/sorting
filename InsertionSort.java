package sorting;

public class InsertionSort {

	public int[] sort(int[] arr){
		if(arr == null){
			return null;
		}else{
			
			for(int i = 1; i< arr.length; i++){
				for(int j = i; j> 0; j--){
					if(arr[j]<arr[j-1]){
						int tmp = arr[j];
						arr[j] = arr[j-1];
						arr[j-1] = tmp;
					}
				}
			}
			return arr;
		}
	}
}
