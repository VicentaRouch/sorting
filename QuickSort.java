package sorting;

public class QuickSort {

	public void sort(int[] arr, int low, int high){
		
		if(low < high){
			
			int piv = partition(arr, low, high);
			
			if(low < piv-1){
				sort(arr, low, piv -1);
			}
			if(piv < high){
				sort(arr, piv, high);
			}
			
		}
	}
	
	public int partition(int[] arr, int low, int high){
		int i = low;
		int j = high;
		int mid = (high + low)/2;
		int pivot = arr[mid];
		
		while(i<=j){
			while(arr[i]<pivot)
				i++;
			while(pivot < arr[j])
				j--;
			if(i<=j){
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
		}
		return i;
	}
}
