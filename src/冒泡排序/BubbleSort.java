package ð������;

public class BubbleSort {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();//��ȡ��ǰʱ��
		int a[] = { 1, 22, 3, 8, 5, 6, 2 };
		sort(a);
		long endTime = System.currentTimeMillis();
		System.out.println("��������ʱ�䣺"+(endTime-startTime)+"ms");

	}

	public static void sort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < a.length - i; j++) {
				if (a[j] < a[j + 1]) {
					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
