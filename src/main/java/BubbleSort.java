/**
 * Created by daehyun on 2016. 10. 20..
 */
public class BubbleSort implements SortInterface {
    public void sort(int[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1 - i ; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
