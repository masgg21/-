package 插入排序;

/**
 * @author loveqi
 * 2018-1-29
 * 插入排序
 */
public class Insertion_sort {
   /**
    * 插入排序
    * @param arr
    * @return
    */
   public int[] getInsertionSort(int[] arr) {
	   int i,j,t,h;
	   for (i = 1; i < arr.length; i++) {
		 t=arr[i];
		 j=i-1;
		 while (j>=0&&t<arr[j]) {
			arr[j+1]=arr[j];
			j--;
		 }
		 arr[j+1]=t;
		 System.out.print("第"+i+"次排序结果:");
		 for (int k = 0; k < arr.length; k++) {
			System.out.print(" "+arr[k]);
		}
		System.out.println();
	   }
	   return arr;
   }
   
   
}
