package ð������;

import java.net.StandardSocketOptions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/**
 * @author loveqi
 * @time   2018-1-27
 * ð�������㷨
 */
public class Bubble_sort {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();//��ȡ��ǰʱ��
		int a[]= {1,3,9,5,8,22,20,17,30};
        boolean flag =true;
        while(flag) {
        	//System.out.println(123);
           	Map<Integer,int[]> map = Bubblesort(a);
        	 flag = pp(map);
        	 //System.out.println(flag);
        	 if(flag==false) {
        		 Iterator<Entry<Integer,int[]>> iter=map.entrySet().iterator();
        		 int[] b = null;
        		 while (iter.hasNext()) {
        			 Entry<Integer, int[]> entry=iter.next();
        			 b=entry.getValue();			
        		 }
        		 for(int i=0;i<b.length;i++) {
        			 System.out.println(b[i]);
        		 }
      		}
		}
        long endTime = System.currentTimeMillis();
        System.out.println("��������ʱ�䣺"+(endTime-startTime)+"ms");
	}
	/**
	 * �ж��Ƿ���Ҫ������������
	 * @param map
	 * @return
	 */
	public static boolean pp(Map map) {
		Iterator<Entry<Integer,int[]>> iter=map.entrySet().iterator();
		Integer b=0;
		while (iter.hasNext()) {
			Entry<Integer, int[]> entry=iter.next();
			b=entry.getKey();			
		}
		boolean flag;
		if(b==0) {
		     flag=false;
		}
		else {
			flag=true;
		}
		return flag;
	}
	/**
	 * ���������һ������
	 * @param a
	 * @return
	 */
	public static Map<Integer,int[]> Bubblesort(int[] a) {
		Map<Integer,int[]> map=new HashMap<>();
		Integer b=0;
		for (int i = 0; i < a.length; i++) {
			if (i+1<a.length ) {
				if (a[i] < a[i+1]) {
					int temp = a[i+1];
					a[i+1] =a[i];
					a[i] = temp;
					b++;
				}
			}
		}
		map.put(b, a);
		return map;
	}
}
