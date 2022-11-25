import ordenacao.BubbleSort;
import ordenacao.InsertionSort;
import ordenacao.MergeSort;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
    	
    	int tamanhoConjunto = 10000;
    			
    	long[] temposCenario1InsertionSort = new long[5];
    	long[] temposCenario1MergeSort = new long[5];
    	long[] temposCenario1BubbleSort = new long[5];
    	
    	long[] temposCenario2InsertionSort = new long[5];
    	long[] temposCenario2MergeSort = new long[5];
    	long[] temposCenario2BubbleSort = new long[5];
    	
    	long[] temposCenario3InsertionSort = new long[5];
    	long[] temposCenario3MergeSort = new long[5];
    	long[] temposCenario3BubbleSort = new long[5];
    	
    	System.out.println("######### CENÁRIO 1: Dados de entrada aleatorizados     #########");
    	System.out.println(" ");
    	for(int i = 0; i < 5; i++) {
    		System.out.println("######### EXECUÇÃO " + (i+1) + "     #########");
    		System.out.println(" ");
            int[] A = new int[tamanhoConjunto];
            Random r = new Random();
            int low = 10;
            int high = 10000000;
            InsertionSort is;
            MergeSort ms;
            BubbleSort bs;
            for (int i1 = 1; i1 < A.length; i1++) {
                A[i1] = r.nextInt(high - low) + low;
            }

            is = new InsertionSort(A.clone());
            ms = new MergeSort(A.clone());
            bs = new BubbleSort(A.clone());
            long startTime = System.currentTimeMillis();
            is.sort();
            long totalTime = System.currentTimeMillis() - startTime;
            temposCenario1InsertionSort[i] = totalTime;
            System.out.println("Insertion sort time: " + totalTime);

            System.out.println();
            startTime = System.currentTimeMillis();
            ms.sort(0, (A.length - 1));
            totalTime = System.currentTimeMillis() - startTime;
            temposCenario1MergeSort[i] = totalTime;
            System.out.println("Mergesort time: " + totalTime);

            System.out.println();
            startTime = System.currentTimeMillis();
            bs.sort();
            totalTime = System.currentTimeMillis() - startTime;
            temposCenario1BubbleSort[i] = totalTime;
            System.out.println("BubbleSort time: " + totalTime );
    		System.out.println(" ");
    		System.out.println("######### FIM EXECUÇÃO " + (i+1) + " #########");
    		System.out.println(" ");
    	}
    	System.out.println(" ");
    	System.out.println("######### FIM CENÁRIO 1: Dados de entrada aleatorizados #########");
    	System.out.println(" ");
    	
    	System.out.println("######### CENÁRIO 2: Dados de entrada já ordenados     #########");
    	System.out.println(" ");
    	for(int i = 0; i < 5; i++) {
    		System.out.println("######### EXECUÇÃO " + (i+1) + "     #########");
    		System.out.println(" ");
            int[] A = new int[tamanhoConjunto];
            int[] A_ORDERED = new int[tamanhoConjunto];
            Random r = new Random();
            int low = 10;
            int high = 10000000;
            InsertionSort is;
            MergeSort ms;
            BubbleSort bs;
            for (int i1 = 1; i1 < A.length; i1++) {
                A[i1] = r.nextInt(high - low) + low;
            }
            
            ms = new MergeSort(A.clone());
            ms.sort(0, A.length - 1);
            
            A_ORDERED = ms.getVet();

            is = new InsertionSort(A_ORDERED.clone());
            ms = new MergeSort(A_ORDERED.clone());
            bs = new BubbleSort(A_ORDERED.clone());
            long startTime = System.currentTimeMillis();
            is.sort();
            long totalTime = System.currentTimeMillis() - startTime;
            temposCenario2InsertionSort[i] = totalTime;
            System.out.println("Insertion sort time: " + totalTime);

            System.out.println();
            startTime = System.currentTimeMillis();
            ms.sort(0, (A_ORDERED.length - 1));
            totalTime = System.currentTimeMillis() - startTime;
            temposCenario2MergeSort[i] = totalTime;
            System.out.println("Mergesort time: " + totalTime);

            System.out.println();
            startTime = System.currentTimeMillis();
            bs.sort();
            totalTime = System.currentTimeMillis() - startTime;
            temposCenario2BubbleSort[i] = totalTime;
            System.out.println("BubbleSort time: " + totalTime );
    		System.out.println(" ");
    		System.out.println("######### FIM EXECUÇÃO " + (i+1) + " #########");
    		System.out.println(" ");
    	}
    	System.out.println(" ");
    	System.out.println("######### FIM CENÁRIO 2: Dados de entrada já ordenados #########");
    	System.out.println(" ");
    	
    	System.out.println("######### CENÁRIO 3: Dados de entrada já ordenados     #########");
    	System.out.println(" ");
    	for(int i = 0; i < 5; i++) {
    		System.out.println("######### EXECUÇÃO " + (i+1) + "     #########");
    		System.out.println(" ");
            int[] A = new int[tamanhoConjunto];
            int[] A_ORDERED_descending = new int[tamanhoConjunto];
            Random r = new Random();
            int low = 10;
            int high = 10000000;
            InsertionSort is;
            MergeSort ms;
            BubbleSort bs;
            for (int i1 = 1; i1 < A.length; i1++) {
                A[i1] = r.nextInt(high - low) + low;
            }
            
            ms = new MergeSort(A.clone());
            ms.sort(0, A.length - 1);
            
            A_ORDERED_descending = ms.getVet();
            
            A_ORDERED_descending = reverse(A_ORDERED_descending);
            
            is = new InsertionSort(A_ORDERED_descending.clone());
            ms = new MergeSort(A_ORDERED_descending.clone());
            bs = new BubbleSort(A_ORDERED_descending.clone());
            long startTime = System.currentTimeMillis();
            is.sort();
            long totalTime = System.currentTimeMillis() - startTime;
            temposCenario3InsertionSort[i] = totalTime;
            System.out.println("Insertion sort time: " + totalTime);

            System.out.println();
            startTime = System.currentTimeMillis();
            ms.sort(0, (A_ORDERED_descending.length - 1));
            totalTime = System.currentTimeMillis() - startTime;
            temposCenario3MergeSort[i] = totalTime;
            System.out.println("Mergesort time: " + totalTime);

            System.out.println();
            startTime = System.currentTimeMillis();
            bs.sort();
            totalTime = System.currentTimeMillis() - startTime;
            temposCenario3BubbleSort[i] = totalTime;
            System.out.println("BubbleSort time: " + totalTime );
    		System.out.println(" ");
    		System.out.println("######### FIM EXECUÇÃO " + (i+1) + " #########");
    		System.out.println(" ");
    	}
    	System.out.println(" ");
    	System.out.println("######### FIM CENÁRIO 3: Dados de entrada já ordenados #########");
    	System.out.println(" ");
    	
    	
    	System.out.println("CENÁRIO 1");
    	System.out.println("Average Insertion sort time: " + exibeMedia(temposCenario1InsertionSort));
    	System.out.println("Average Mergesort time: " +  exibeMedia(temposCenario1MergeSort));
    	System.out.println("Average BubbleSort time: " +  exibeMedia(temposCenario1BubbleSort) );
    	System.out.println(" ");
    	
    	System.out.println("CENÁRIO 2");
    	System.out.println("Average Insertion sort time: " + exibeMedia(temposCenario2InsertionSort));
    	System.out.println("Average Mergesort time: " +  exibeMedia(temposCenario2MergeSort));
    	System.out.println("Average BubbleSort time: " +  exibeMedia(temposCenario2BubbleSort) );
    	System.out.println(" ");
    	
    	System.out.println("CENÁRIO 3");
    	System.out.println("Average Insertion sort time: " + exibeMedia(temposCenario3InsertionSort));
    	System.out.println("Average Mergesort time: " +  exibeMedia(temposCenario3MergeSort));
    	System.out.println("Average BubbleSort time: " +  exibeMedia(temposCenario3BubbleSort) );
    	System.out.println(" ");
    	
    }
    
    public static float exibeMedia(long[] arr) {
        int length = arr.length;
        
        long sum = 0;
 
        for (int i = 0; i < length; i++) {
            sum += arr[i];
        }
 
        float average = Math.floorDiv(sum, length);
        
        return average;
    }
    
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
  
        System.out.println();
    }
    
    public static int[] reverse(int[] array)
    {
  
        int n = array.length;
  

        for (int i = 0; i < n / 2; i++) {
  

            int temp = array[i];
  

            array[i] = array[n - i - 1];
  

            array[n - i - 1] = temp;
        }
        
        return array;
    }
}