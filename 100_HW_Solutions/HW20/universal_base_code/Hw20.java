import java.util.*;

class starter {
	
	public static void median(ArrayList <Integer> array){
		
		if(array.size() % 2 == 0){
			System.out.println(array.size() / 2);
		}
				// get two middle numbers and divide by double for decimal
		else{
			System.out.println((array.size() / 2) + (array.size() / 2 - 1) / 2.0);
		}
		
	}
	
	public static void bubbleSort(ArrayList <Integer> array){
		
		for(int outer = 0; outer < array.size() - 1; outer++){
				for(int inner = 0; inner < array.size() - 1; inner++){
					if(array.get(inner) > array.get(inner + 1)){
						int temp = array.get(inner);
						array.set(inner, array.get(inner + 1));
						array.set(inner + 1, temp);
				}
			}
		}
		
		median(array);
		System.out.println(array);
		
	}
	
	public static void selectionSort(ArrayList <Integer> array){
		
		int outer, inner, minIndex, temp;
		
		for(outer = 0; outer < array.size(); outer++){
			minIndex = outer;
			for(inner = outer + 1; inner < array.size(); inner++){
				if(array.get(inner) < array.get(minIndex)){
					minIndex = inner;
				}
			}
			
			temp = array.get(outer);
			array.set(outer, array.get(minIndex));
			array.set(minIndex, temp);
			
		}
		
		median(array);
		System.out.println(array);
		
	}
			
	public static void insertionSort(ArrayList <Integer> array){
		
		int i, key, j;
		
		for(i = 1; i < array.size(); i++){
			key = array.get(i);
			j = i - 1;
			
			while(j >= 0 && array.get(i) > key){
				array.set(j + 1, array.get(j));
					j = j - 1;
			}
			
			array.set(j + 1, key);
			
		}
		
		median(array);
		System.out.println(array);
		
	}
	
	public static void main(String args[]) {
		
		ArrayList <Integer> array = new ArrayList <Integer>(100);
		
		for(int i = 0; i < array.size(); i++){
			array.set(i, (int)(Math.random() * 101));
				array.add(i);
		}
		
		bubbleSort(array);
		
		selectionSort(array);
		
		insertionSort(array);
		
	}
}
