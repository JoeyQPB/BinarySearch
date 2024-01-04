package program;

import java.util.ArrayList;

public class ArrayListSoluition {

	private Integer counter = 0;
	private Integer itemToFind;
	private Integer found;
	private int arrLen;
	private ArrayList<Integer> arr = new ArrayList<>();
	
	public ArrayListSoluition () {};
	
	public ArrayListSoluition (int arrLen, Integer itemToFind) {
		this.itemToFind = itemToFind;
		this.arrLen = arrLen;
		fillArray();
	};
	
	public void binarySearch() {
		int bottom = 0;
		int top = arr.size() - 1;
		
		while (bottom <= top) {
			int middle = (top + bottom) / 2;
			int pointer = arr.get(middle);
			
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
		
		System.out.println("The number: " + itemToFind + " is out of bounderies on array: " + this.arr);
	}
	
	public void fillArray() {
		for (Integer i = 1; i <= arrLen; i++) {
			arr.add(i);
		}
	};
	
}
