package ¿ìËÙÅÅĞò;

/**
 * @author Administrator
 *
 */
public class Test_quick {
	 public static void main(String[] args) {
	        Integer[] list = {34, 3, 53, 2, 23, 7, 14, 10};
	        Quick_sort qs = new Quick_sort();
	        qs.quick(list);
	        for (int i = 0; i < list.length; i++) {
	            System.out.print(list[i] + " ");
	        }
	        System.out.println();
	    }
}
