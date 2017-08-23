package mergeSort;
///notes:
// all the indexes must be shifted toward zero in order to work properly

public class MergeSortImplementation {

	public static void main(String[] args) {
		
	int[] dummyArray = {2,3,4,1,0,-2,8};	
		
	
	mergeSort(dummyArray,0,dummyArray.length-1);
	
	}
	
	
	public static void mergeSort(int array[],int p, int r){
		
		if (p<r){
			int q= Math.floorDiv((p+r), 2);
			mergeSort(array,p,q-1);
			mergeSort(array,q,r-1);
			merge(array,p,q,r);
		}
		
	}
	
	
	private static void merge(int array[], int p, int q, int r){
		
		int n1=q-p+1;   //calculating the next sub-array sizes
		int n2 = r-q;
		
		int[] L = new int[n1]; //first sub-array
		int[] R = new int[n2]; //second sub-array
		
		for(int i=0; i<n1; i++)
			L[i] = array[p+i];   //transferring the values into first sub-array
		
		for(int j=0; j<n2; j++)
			R[j] = array[q+j];  //transferring the values into second sub-array
		
		for(int k=p,i=0,j=0; k<r; k++){
			
			if(L[i]<=R[j]){
				array[k]=L[i];
				i++;
				//System.out.println(i);
			}
			else{
				array[k]=R[j];
				j++;
				//System.out.println(j);
			}
		
		}
		
		
		
	}
	
	

}
