package com.springboot.lin.test.stack;

public class MLTest {

	public static void main(String[] args) {
		//int[] a = {1, 3, 5, 7, 9};
		//int[] b = {0, 2, 4, 6, 8,10,12};
		//int[] c = merge(a, b);
		//System.out.println(JSON.toJSON(c));

		//List<String> list = new ArrayList<>();
		//list.add("a");
		//List<String> list2 = new LinkedList<>(list);
		//System.out.println(list2);
		System.out.println(1/3);

	}

	private static int[] merge(int[] a, int[] b) {
		int pa = 0, pb = 0, pc = 0;
		int m = a.length;
		int n = b.length;
		//创建新数组
		int[] c = new int[m + n];
		//当两个数组的元素还没有遍历完
		while (pa < m && pb < n) {
			if (a[pa] < b[pb]) {//a数组的元素小于b数组的元素
				c[pc++] = a[pa++];
			} else {
				c[pc++] = b[pb++];
			}
		}
		if (pa < m) {
			while (pa < m) {
				c[pc++] = a[pa++];
			}
		} else {
			while (pb < n) {
				c[pc++] = b[pb++];
			}
		}
		return c;
	}
}
