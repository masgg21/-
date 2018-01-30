package 选择排序;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Mis.Ma 选择排序
 */
public class Selection_sort {
	/**
	 * 数组排列
	 * @param arr
	 * @return
	 */
	public int[] getMinarry(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] < arr[i + 1]) {
				int temp = arr[i + 1];
				arr[i + 1] = arr[i];
				arr[i] = temp;
			}
		 }
		return arr;
     }
	/**
	 * 数组与list的互相转换
	 * @param list1
	 * @return
	 */
	public List getList(List<Integer> list1) {
		List<Integer> list = new ArrayList<>();
		int arr[] = new int[list1.size()];
		for (int i = 0; i < list1.size(); i++) {
			arr[i] = list1.get(i);
		}
		int[] minarry = getMinarry(arr);
		for (int i = 0; i < minarry.length; i++) {
			list.add(minarry[i]);
		}
		return list;
	}

	/**
	 * 获取选择排序的新数组
	 * @return
	 */
	public int[] SelectionSort(int[] arr) {
		List<Integer> list1 = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			list1.add(arr[i]);
		}
		//System.out.println(list1);
		List<Integer> list=new ArrayList<>();
		list = getList(list1);
		int a=list.size();
		int[] b = new int[a];
		for (int i = 0; i < a; i++) {
			b[i] =  list.get(list.size() - 1);
			list.remove(list.size() - 1);
			list=getList(list);
		}
		return b;
	}
}
