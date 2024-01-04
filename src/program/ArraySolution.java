package program;

public class ArraySolution {
	
	private Integer counter = 0;
	private Integer itemToFind;
	private Integer found;
	private int arrLen;
	private int[] arr;
	
	public ArraySolution() {};
	
	public ArraySolution(int arrLen, Integer itemToFind) {
		this.itemToFind = itemToFind;
		this.arrLen = arrLen;
		fillArray(arrLen);
	};
	
	public void binarySearch() {
		int bottom = 0;
		int top = arr.length - 1;
		
		while (bottom <= top) {
			int middle = (top + bottom) / 2;
			int pointer = arr[middle];
			
			if (pointer == itemToFind) {
				counter++;
				this.found = pointer;
				System.out.println("Found item: " + this.found + " --- Counter: " + this.counter);
				return;
			}
			
			if (pointer > itemToFind) {
				counter++;
				top = middle - 1;
			} else {
				counter++;
				bottom = middle + 1;
			}
		}
		
		System.out.println("The number: " + itemToFind + " is out of bounderies on array: ");
		arrayToString();
	}
	
	public void fillArray(int len) {
		this.arr = new int[len];
		for (Integer i = 1; i <= arrLen; i++) {
			arr[i-1] = i;
		}
	};

	public void arrayToString() {
		System.out.print("[ ");
		for ( int i : arr) {
			if (i == 1) {
				System.out.print(i);
			} else {
				System.out.print(", " + i);
			}
		}
		System.out.println(" ]");
	}
}
