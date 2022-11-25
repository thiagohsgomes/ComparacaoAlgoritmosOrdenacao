package ordenacao;

public class InsertionSort {
    private int[] vet;

    public InsertionSort(int[] vet) {
        this.vet = vet;
    }

    public int[] getVet() {
        return vet;
    }

    public void sort(){
        int key;
        for (int j = 1; j < vet.length; j++) {
            key = vet[j];
            int i = j-1;
            while ( (i > 0) && (vet[i]>key)){
                vet[i+1] = vet[i];
                i--;
            }
            vet[i+1] = key;
        }
    }
}