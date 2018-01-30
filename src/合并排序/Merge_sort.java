package 合并排序;

import java.util.Iterator;

/**
 * @author loveqi 2018-1-18 合并排序
 */
public class Merge_sort {
	private static final int SIZE = 15;
	/**
	 * 完成一遍合并的函数
	 * 
	 * @param a
	 * @param b
	 * @param n
	 * @param len
	 */
	public static void mergeOne(int a[], int b[], int n, int len) {
		int i, j, k, s, e;
		s = 0;
		while (s + len < n) {
			e = s + 2 * len - 1;
			if (e >= n) {// 最后一段可能少于len个节点
				e = n - 1;
			}
			// 相邻有序段合并
			k = s;
			i = s;
			j = s + len;
			while (i < s + len && j <= e) {// 当两个有序表都未结束时，循环比较
				if (a[i] <= a[j]) {// 将较小的元素复制到数组b中
					b[k++] = a[i++];
				} else {
					b[k++] = a[j++];
				}
			}
			// 未合并的部分复制到数组b中
			while (i < s + len) {
				b[k++] = a[i++];
			}
			while (j <= e) {
				b[k++] = a[j++];
			}
			s = e + 1;
		}
		if (s < n) {// 将剩余的一个有序段从数组a复制到数组b
			for (; s < n; s++) {
				b[s] = a[s];
			}
		}
	}
	/**
	 * 合并排序
	 * @param a
	 * @param n
	 */
	public static void MergeSort(int a[],int n) {
		int h,count,len,f;
		count=0;      //排序步驟
		len=1;        //有序序列的長度
		f=0;          //变量f做标志
		
		int p[]=new int[n];
		while (len<n) {
			if(f==1) {//交替在A和p之间合并
				mergeOne(p, a, n, len);//增加有序序列的长度
			}
			else {
				mergeOne(a, p, n, len);//使f值在0和1之间切换
			}
			len=len*2;
			f=1-f;
			count++;
			System.out.println("第"+count+"次排序结果为:");
			for (h = 0; h < SIZE; h++) {
				System.out.println(" "+a[h]);
			}
			System.out.println("\n");
		}
		if(f==1) {//如果进行了排序
			for (h = 0; h < n; h++) {//将内存p中的数据复制回数组a
				a[h]=p[h];
			}
		}
	}
}
