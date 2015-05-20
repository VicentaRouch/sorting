package sorting;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] testArray1 = {1,5,8,2,6,3,7,4};
		int[] testArray2 = {1,5,8,2,6,3,7,4};
		int[] testArray3 = {1,5,8,2,6,3,7,4};
		int[] testArray4 = {1,5,8,2,6,3,7,4};
		int[] testArray5 = {1,5,8,2,6,3,7,4};
		
		BubbleSort bs = new BubbleSort();
		InsertionSort is = new InsertionSort();
		SelectionSort ss = new SelectionSort();
		QuickSort qs = new QuickSort();
		MergeSort ms = new MergeSort();
		
		bs.sort(testArray1);
		is.sort(testArray2);
		ss.sort(testArray3);
		qs.sort(testArray4, 0, testArray4.length-1);
		ms.sort(testArray5);
		
		System.out.println("Bubble sort result:");
		for(int ele: testArray1){
			System.out.print(ele + " ");
		}
		System.out.println();
		
		System.out.println("Insertion sort result:");
		for(int ele: testArray2){
			System.out.print(ele + " ");
		}
		System.out.println();
		
		System.out.println("Selection sort result:");
		for(int ele: testArray3){
			System.out.print(ele + " ");
		}
		System.out.println();
		
		System.out.println("Quick sort result:");
		for(int ele: testArray3){
			System.out.print(ele + " ");
		}
		System.out.println();
		
		System.out.println("Merge sort result:");
		for(int ele: testArray1){
			System.out.print(ele + " ");
		}
		System.out.println();
	}

}
