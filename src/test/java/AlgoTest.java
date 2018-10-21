package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;

public class AlgoTest {
	
	 public Item[] numbers,sortedNumbers;
	    //The elements are in descending order. It will cover all the test sequences
		//Node Coverage Edge Coverage Condition Coverage for the Bubble Sort method
		@Test 
		public void verifyDescSort() {
			numbers = new Item[6];
			sortedNumbers =  new Item[6];
			numbers[0]= new Item(100);
			numbers[1]= new Item(90);
			numbers[2]= new Item(80);
			numbers[3]= new Item(70);
			numbers[4]= new Item(60);
			numbers[5]= new Item(50);
			sortedNumbers[0]= new Item(50);
			sortedNumbers[1]= new Item(60);
			sortedNumbers[2]= new Item(70);
			sortedNumbers[3]= new Item(80);
			sortedNumbers[4]= new Item(90);
			sortedNumbers[5]= new Item(100);
			SortAlgos.bubbleSort(numbers);
			assertEquals(numbers[0].key,sortedNumbers[0].key);
			assertEquals(numbers[1].key,sortedNumbers[1].key);
			assertEquals(numbers[2].key,sortedNumbers[2].key);
			assertEquals(numbers[3].key,sortedNumbers[3].key);
			assertEquals(numbers[4].key,sortedNumbers[4].key);
			assertEquals(numbers[5].key,sortedNumbers[5].key);
			SortAlgos.quickSort(numbers);
			SortAlgos.insertionSort(numbers);
			SortAlgos.mergeSort(numbers);
			SortAlgos.heapSort(numbers);
			
		}
		
		// Already sorted elements. Bubble sort will still make one pass on all the elements
		// This will cove Node Coverage and Edge Coverage
		@Test
		public void verifyBubbleSort() {
			numbers = new Item[6];
			sortedNumbers =  new Item[6];
			numbers[0]= new Item(1);
			numbers[1]= new Item(2);
			numbers[2]= new Item(3);
			numbers[3]= new Item(4);
			numbers[4]= new Item(5);
			numbers[5]= new Item(6);
			sortedNumbers[0]= new Item(1);
			sortedNumbers[1]= new Item(2);
			sortedNumbers[2]= new Item(3);
			sortedNumbers[3]= new Item(4);
			sortedNumbers[4]= new Item(5);
			sortedNumbers[5]= new Item(6);
			SortAlgos.bubbleSort(numbers);
			assertEquals(numbers[0].key,sortedNumbers[0].key);
			assertEquals(numbers[1].key,sortedNumbers[1].key);
			assertEquals(numbers[2].key,sortedNumbers[2].key);
			assertEquals(numbers[3].key,sortedNumbers[3].key);
			assertEquals(numbers[4].key,sortedNumbers[4].key);
			assertEquals(numbers[5].key,sortedNumbers[5].key);
			
		}
		//Method to verify Merge Sort
		@Test
		public void verifyMergeSort() {
			numbers = new Item[8];
			sortedNumbers = new Item[8];
			numbers[0]= new Item(100);
			numbers[1]= new Item(45);
			numbers[2]= new Item(55);
			numbers[3]= new Item(63);
			numbers[4]= new Item(85);
			numbers[5]= new Item(48);
			numbers[6]= new Item(76);
			numbers[7]= new Item(23);
			SortAlgos.mergeSort(numbers);
			sortedNumbers[0]= new Item(23);
			sortedNumbers[1]= new Item(45);
			sortedNumbers[2]= new Item(48);
			sortedNumbers[3]= new Item(55);
			sortedNumbers[4]= new Item(63);
			sortedNumbers[5]= new Item(76);
			sortedNumbers[6]= new Item(85);
			sortedNumbers[7]= new Item(100);
			assertEquals(numbers[0].key,sortedNumbers[0].key);
			assertEquals(numbers[1].key,sortedNumbers[1].key);
			assertEquals(numbers[2].key,sortedNumbers[2].key);
			assertEquals(numbers[3].key,sortedNumbers[3].key);
			assertEquals(numbers[4].key,sortedNumbers[4].key);
			assertEquals(numbers[5].key,sortedNumbers[5].key);
			assertEquals(numbers[6].key,sortedNumbers[6].key);
			assertEquals(numbers[7].key,sortedNumbers[7].key);
			
		}
		
		//Method to verify Insertion Sort
		@Test
		public void verifyInsertionSort() {
			numbers = new Item[7];
			sortedNumbers = new Item[7];
			numbers[0]= new Item(38);
			numbers[1]= new Item(27);
			numbers[2]= new Item(43);
			numbers[3]= new Item(3);
			numbers[4]= new Item(9);
			numbers[5]= new Item(82);
			numbers[6]= new Item(10);		
			SortAlgos.insertionSort(numbers);
			sortedNumbers[0]= new Item(3);
			sortedNumbers[1]= new Item(9);
			sortedNumbers[2]= new Item(10);
			sortedNumbers[3]= new Item(27);
			sortedNumbers[4]= new Item(38);
			sortedNumbers[5]= new Item(43);
			sortedNumbers[6]= new Item(82);
			assertEquals(numbers[0].key,sortedNumbers[0].key);
			assertEquals(numbers[1].key,sortedNumbers[1].key);
			assertEquals(numbers[2].key,sortedNumbers[2].key);
			assertEquals(numbers[3].key,sortedNumbers[3].key);
			assertEquals(numbers[4].key,sortedNumbers[4].key);
			assertEquals(numbers[6].key,sortedNumbers[6].key);
				
		}
		
		
		//Method to verify Selection Sort
		@Test
		public void verifySelectionSort() {
			numbers = new Item[7];
			sortedNumbers = new Item[7];
			numbers[0]= new Item(38);
			numbers[1]= new Item(27);
			numbers[2]= new Item(43);
			numbers[3]= new Item(3);
			numbers[4]= new Item(9);
			numbers[5]= new Item(82);
			numbers[6]= new Item(10);	
			SortAlgos.selectionSort(numbers);
			sortedNumbers[0]= new Item(3);
			sortedNumbers[1]= new Item(9);
			sortedNumbers[2]= new Item(10);
			sortedNumbers[3]= new Item(27);
			sortedNumbers[4]= new Item(38);
			sortedNumbers[5]= new Item(43);
			sortedNumbers[6]= new Item(82);
			assertEquals(numbers[0].key,sortedNumbers[0].key);
			assertEquals(numbers[1].key,sortedNumbers[1].key);
			assertEquals(numbers[2].key,sortedNumbers[2].key);
			assertEquals(numbers[3].key,sortedNumbers[3].key);
			assertEquals(numbers[4].key,sortedNumbers[4].key);
			assertEquals(numbers[6].key,sortedNumbers[6].key);
			
		}
		
		
		//Method to verify Quick Sort
		@Test
		public void verifyQuickSort() {
			numbers = new Item[7];
			sortedNumbers = new Item[7];
			numbers[0]= new Item(10);
			numbers[1]= new Item(4);
			numbers[2]= new Item(12);
			numbers[3]= new Item(2);
			numbers[4]= new Item(18);
			numbers[5]= new Item(20);
			numbers[6]= new Item(1);
			SortAlgos.quickSort(numbers);
			sortedNumbers[0]= new Item(1);
			sortedNumbers[1]= new Item(2);
			sortedNumbers[2]= new Item(4);
			sortedNumbers[3]= new Item(10);
			sortedNumbers[4]= new Item(12);
			sortedNumbers[5]= new Item(18);
			sortedNumbers[6]= new Item(20);
			assertEquals(numbers[0].key,sortedNumbers[0].key);
			assertEquals(numbers[1].key,sortedNumbers[1].key);
			assertEquals(numbers[2].key,sortedNumbers[2].key);
			assertEquals(numbers[3].key,sortedNumbers[3].key);
			assertEquals(numbers[4].key,sortedNumbers[4].key);
			assertEquals(numbers[6].key,sortedNumbers[6].key);
		}
		
		// Method to verify Heap Sort
		@Test
		public void verifyHeapSort() {
			numbers = new Item[7];
			sortedNumbers = new Item[7];
			numbers[0]= new Item(10);
			numbers[1]= new Item(4);
			numbers[2]= new Item(12);
			numbers[3]= new Item(2);
			numbers[4]= new Item(18);
			numbers[5]= new Item(20);
			numbers[6]= new Item(1);
			SortAlgos.heapSort(numbers);
			sortedNumbers[0]= new Item(1);
			sortedNumbers[1]= new Item(2);
			sortedNumbers[2]= new Item(4);
			sortedNumbers[3]= new Item(10);
			sortedNumbers[4]= new Item(12);
			sortedNumbers[5]= new Item(18);
			sortedNumbers[6]= new Item(20);
			assertEquals(numbers[0].key,sortedNumbers[0].key);
			assertEquals(numbers[1].key,sortedNumbers[1].key);
			assertEquals(numbers[2].key,sortedNumbers[2].key);
			assertEquals(numbers[3].key,sortedNumbers[3].key);
			assertEquals(numbers[4].key,sortedNumbers[4].key);
			assertEquals(numbers[6].key,sortedNumbers[6].key);
		}
		
}
