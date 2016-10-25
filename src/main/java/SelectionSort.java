/**
 * Created by daehyun on 2016. 10. 20..
 */
public class SelectionSort implements SortInterface {
    public void sort(int[] array) {
        int size = array.length;
        for(int i = 0 ; i < size ; i++){
            for(int j = i; j < size ; j++){
                if(array[i] > array[j]){
                    //swap [i] and [j] element
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
