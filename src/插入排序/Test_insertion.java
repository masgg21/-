/**
 * 
 */
package ��������;

/**
 * @author Administrator
 *
 */
public class Test_insertion {
  public static void main(String[] args) {
	Insertion_sort in=new Insertion_sort();
	int arr[]= {7,6,8,1,3,9};
	int[] insertionSort = in.getInsertionSort(arr);
	System.out.println("����������Ϊ:");
	for (int i = 0; i < insertionSort.length; i++) {
		System.out.print(insertionSort[i]+" ");
	}
}
}
