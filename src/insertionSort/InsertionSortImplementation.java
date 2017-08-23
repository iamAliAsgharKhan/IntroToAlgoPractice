package insertionSort;

public class InsertionSortImplementation {

	public static void main(String[] args) {
		
		int[] dummyArray = {2,3,1,2,33,4,1,14};
		
		insertionSort(dummyArray);
		
		for(int i=0; i<dummyArray.length; i++)
			System.out.println(dummyArray[i]);

	}
	
	
	public static void insertionSort(int inputArray[]){
		
		for(int j=1; j<inputArray.length; j++){
			int i=j-1;
			int key = inputArray[j];
			
			while (i>-1 && inputArray[i]>key){
				inputArray[i+1] = inputArray[i];
				i--;
			}
			inputArray[i+1]=key;
			
		}
		
		
	}

}
