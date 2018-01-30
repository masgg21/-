package ��������;

/**
 * @author Administrator
 *
 */
public class Quick_sort {
	public Quick_sort() {
    }
    /**
     * ÿ�λ�ȡ�м�ֵ
     * @param list
     * @param low
     * @param high
     * @return
     */
	public int getMiddle(Integer[] list, int low, int high) {
		int tmp = list[low]; // ����ĵ�һ����Ϊ����
		while (low < high) {
			while (low < high && list[high] > tmp) {
				high--;
			}
			list[low] = list[high]; // ������С�ļ�¼�Ƶ��Ͷ�
			while (low < high && list[low] < tmp) {
				low++;
			}
			list[high] = list[low]; // �������ļ�¼�Ƶ��߶�
		}
		list[low] = tmp; // �����¼��β
		return low; // ���������λ��
	}
    /**
     * �ݹ��ظ������������
     * @param list
     * @param low
     * @param high
     */
	public void _quickSort(Integer[] list, int low, int high) {
		if (low < high) {
			int middle = getMiddle(list, low, high); // ��list�������һ��Ϊ��
			_quickSort(list, low, middle - 1); // �Ե��ֱ���еݹ�����
			_quickSort(list, middle + 1, high); // �Ը��ֱ���еݹ�����
		}
	}

	public void quick(Integer[] str) {
		if (str.length > 0) { // �鿴�����Ƿ�Ϊ��
			_quickSort(str, 0, str.length - 1);
		}
	}
}
