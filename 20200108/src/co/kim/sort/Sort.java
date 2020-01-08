package co.kim.sort;

public class Sort {
	private int[] arr;

	public int[] selectionSort(int[] num, int n) { // 내림차순 sort
		int min, temp;
		arr = num;
		for (int i = 0; i < arr.length - 1; i++) {
			min = i; // i 의 요소값이 가장 작다고 전제한다.
			for (int j = i + 1; j < arr.length; j++) {
				if (n == 0) {
					if (arr[min] > arr[j]) //n = 0 이면 오름차순
						min = j;

				} else {
					if (arr[min] < arr[j]) //아니면 내림차순
						min = j;
				}

			}
			if (min != i) {
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;

			}
		}
		return arr;
	}

	public int[] bubbleSort(int[] num) { // 버블소트
		arr = num;
		int temp;
		for (int i = 0; i < arr.length; i++) {
			
		}
		

		return arr;
	}

	public int[] quickSort(int[] num) { // 퀵 소트

		return arr;
	}
}
