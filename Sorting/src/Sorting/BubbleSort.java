package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		//TODO: S1 implements bubble sort
		if (unsortedArray == null) {
			return null;
		}
		int[] toSort = new int[unsortedArray.length];
		for (int i = 0; i < unsortedArray.length; i++) {
			toSort[i] = unsortedArray[i];
		}
		unsortedArray = toSort;
		boolean swapped = true;
		while (swapped) {
			swapped = false;
			for (int i = 1; i < unsortedArray.length; i++) {
				if (unsortedArray[i] < unsortedArray[i-1]) {
					int temp = unsortedArray[i];
					unsortedArray[i] = unsortedArray[i-1];
					unsortedArray[i-1] = temp;
					swapped = true;
				}
			}		
		}
		return unsortedArray;
	}
}
