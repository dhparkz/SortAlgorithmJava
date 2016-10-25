/**
 * Created by daehyun on 2016. 10. 20..
 */
public class InsertionSort implements SortInterface {
    public void sort(int[] array) {
        int size = array.length;
        for(int i = 1;  i < size  ; i++) {
            int curNum = array[i], j;
            for(j = i-1 ; j >= 0 && array[j] > curNum ; j--)
                array[j+1] = array[j];
            array[j+1] = curNum;
        }
    }
}