package �ϲ�����;

import java.util.Iterator;

/**
 * @author loveqi 2018-1-18 �ϲ�����
 */
public class Merge_sort {
	private static final int SIZE = 15;
	/**
	 * ���һ��ϲ��ĺ���
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
			if (e >= n) {// ���һ�ο�������len���ڵ�
				e = n - 1;
			}
			// ��������κϲ�
			k = s;
			i = s;
			j = s + len;
			while (i < s + len && j <= e) {// �����������δ����ʱ��ѭ���Ƚ�
				if (a[i] <= a[j]) {// ����С��Ԫ�ظ��Ƶ�����b��
					b[k++] = a[i++];
				} else {
					b[k++] = a[j++];
				}
			}
			// δ�ϲ��Ĳ��ָ��Ƶ�����b��
			while (i < s + len) {
				b[k++] = a[i++];
			}
			while (j <= e) {
				b[k++] = a[j++];
			}
			s = e + 1;
		}
		if (s < n) {// ��ʣ���һ������δ�����a���Ƶ�����b
			for (; s < n; s++) {
				b[s] = a[s];
			}
		}
	}
	/**
	 * �ϲ�����
	 * @param a
	 * @param n
	 */
	public static void MergeSort(int a[],int n) {
		int h,count,len,f;
		count=0;      //�����E
		len=1;        //�������е��L��
		f=0;          //����f����־
		
		int p[]=new int[n];
		while (len<n) {
			if(f==1) {//������A��p֮��ϲ�
				mergeOne(p, a, n, len);//�����������еĳ���
			}
			else {
				mergeOne(a, p, n, len);//ʹfֵ��0��1֮���л�
			}
			len=len*2;
			f=1-f;
			count++;
			System.out.println("��"+count+"��������Ϊ:");
			for (h = 0; h < SIZE; h++) {
				System.out.println(" "+a[h]);
			}
			System.out.println("\n");
		}
		if(f==1) {//�������������
			for (h = 0; h < n; h++) {//���ڴ�p�е����ݸ��ƻ�����a
				a[h]=p[h];
			}
		}
	}
}
