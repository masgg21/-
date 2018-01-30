package —°‘Ò≈≈–Ú;

import org.junit.Test;

/**
 * @author Administrator
 *
 */
public class Test_Selection {
	@Test
    public void SelectionSort() {
		int arr[]= {3,6,2,7,4,6,9};
    	Selection_sort s=new Selection_sort();
    	int[] b=s.SelectionSort(arr);
    	for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
    }
}
