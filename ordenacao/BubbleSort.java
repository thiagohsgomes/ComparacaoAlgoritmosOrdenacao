package ordenacao;

public class BubbleSort {

    private int[] vet;

    public BubbleSort(int[] vet) {
        this.vet = vet;
    }

    public int[] getVet() {
        return vet;
    }

    public void sort() {
        for (int i = 0; i < vet.length; i++) {
            for (int j = vet.length - 1; j > i + 1; j--) {
                if (vet[j] < vet[j - 1]) {
                    int temp = vet[j];
                    vet[j] = vet[j - 1];
                    vet[j - 1] = temp;
                }
            }
        }
    }
}