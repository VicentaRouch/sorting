package sorting;

public class MergeSort {

	public int[] sort(int[] arr){
		
		if(arr.length <= 1)
			return arr;
		
		int[] first = new int[arr.length/2];
		int[] second = new int[arr.length - first.length];
		
		System.arraycopy(arr, 0, first, 0, first.length);
		System.arraycopy(arr, arr.length/2, second, 0, second.length);
		
		sort(first);
		sort(second);
		
		merge(first, second, arr);
		
		return arr;
	}
	
	public void merge(int[] first, int[] second, int[] result){
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i<first.length && j < second.length){
			if(first[i]< second[j]){
				result[k] = first[i];
				k++;
				i++;
			}else{
				result[k] = second[j];
				k++;
				j++;
			}
		}
		
		System.arraycopy(first, i, result, k, first.length - i);
		System.arraycopy(second, j, result, k, second.length - j);
	}
}
