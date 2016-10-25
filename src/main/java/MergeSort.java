import java.util.Arrays;

/**
 * Created by daehyun on 2016. 10. 20..
 */
public class MergeSort implements SortInterface {
    public void sort(int[] array) {
        int[] sorted =this.mergeSort(array);
        System.arraycopy(sorted,0,array,0,array.length);
    }
    private int[] mergeSort(int[] array) {
        if(array.length <= 1)
            return array;

        int [] sortedLeft = this.mergeSort(Arrays.copyOfRange(array, 0, array.length/2));
        int [] sortedRight = this.mergeSort(Arrays.copyOfRange(array, array.length/2, array.length));
        int [] sorted = new int[array.length];
        int leftIdx = 0, rightIdx = 0;
        for(int i = 0 ; i < array.length ; i++) {
            int left = leftIdx < sortedLeft.length ? sortedLeft[leftIdx] : Integer.MAX_VALUE;
            int right = rightIdx < sortedRight.length ? sortedRight[rightIdx] : Integer.MAX_VALUE;
            if(right < left) {
                sorted[i] = right;
                rightIdx++;
            }
            else {
                sorted[i] = left;
                leftIdx++;
            }
        }
        return sorted;
    }
}
