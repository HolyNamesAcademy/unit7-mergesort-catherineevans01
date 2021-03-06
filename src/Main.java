import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Use main to run and test the below functions
    }

    /**
     * Puts the elements in the arrayList in sorted order from smallest to greatest.
     * This function uses selection sort to sort the arrayList.
     * @param arrayList the ArrayList to be sorted. arrayList cannot contain duplicates
     */
    public static void selectionSort(ArrayList<Integer> arrayList) {
        throw new UnsupportedOperationException("SelectionSort() has not been implemented yet");
    }

    /**
     * Returns the index that value is located in the arrayList. This function searches linearly in
     * the arrayList to find the value.
     * @param arrayList the ArrayList containing the list of values to search. arrayList cannot contain duplicates
     * @param value the value we are looking for in the array list
     */
    public static int linearSearch(ArrayList<Integer> arrayList, int value) {
        throw new UnsupportedOperationException("LinearSearch() has not been implemented yet");
    }

    /**
     * Returns the index that value is located in the arrayList. This function uses binary search in
     * the arrayList to find the value.
     * @param arrayList the ArrayList containing the list of values to search. THIS ARRAYLIST MUST BE
     *                  IN SORTED ORDER. arrayList cannot contain duplicates
     * @param value the value we are looking for in the array list
     */
    public static int binarySearch(ArrayList<Integer> arrayList, int value) {
        throw new UnsupportedOperationException("LinearSearch() has not been implemented yet");
    }

    /**
     * Puts the elements in the arrayList in sorted order from smallest to greatest.
     * This function uses MergeSort to sort the arrayList.
     * @param arrayList the ArrayList to be sorted. arrayList cannot contain duplicates
     */
    public static void mergeSort(ArrayList<Integer> arrayList) {
        int min = arrayList[0];
        int max = arrayList[0];
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < arrayList.size(); i++)
        {
            if(arrayList[i] < min)
            {
                min = arrayList[i];
                minIndex = i;
            }
        }
        for (int i = 0; i < arrayList.size(); i++)
        {
            if (arrayList[i] > max)
            {
                max = arrayList[i];
                maxIndex = i;
            }
        }
        int middleIndex = (minIndex + maxIndex)/2;

    }

    /**
     * This function is a helper function used to help you implement mergeSort.
     * The function sorts the portion of arrayList specified by the range [lo, hi). The range
     * includes lo but excludes hi (arrayList[lo] is the first element in the range, but
     * arrayList[hi] is the first element after the last element in the range).
     * @param arrayList the ArrayList to be sorted.
     * @param lo the index of the first element in the range
     * @param hi the index of the last element in the range + 1.
     */
    public static void sort(ArrayList<Integer> arrayList, int lo, int hi) {
        if (hi - lo <= 1) {
            return;
        }
        int mid = (hi + lo) /2;
        sort(arrayList, lo, mid);
        sort(arrayList, mid, hi);
        merge(arrayList, lo, mid, hi);
    }

    /**
     * This function is a helper function used to help you implement mergeSort.
     * The function merges two consecutive, sorted ranges in the arrayList into one sorted range. The ranges
     * are specified as [lo, mid) and [mid, hi). Each range includes the first element, but excludes
     * the last element (the same way as in sort()).
     * @param arrayList the ArrayList to be sorted.
     * @param lo the index of the first element in the first range
     * @param mid the boundary point of the two ranges. arrayList[mid] is in the second range.
     * @param hi the index of the last element in the second range + 1.
     */
    public static void merge(ArrayList<Integer> arrayList, int lo, int mid, int hi) {
        //what we did in class
        //ArrayList<Integer> tempArray = new ArrayList<Integer>();
        // int i = lo;
        //int j = mid;
        //while (i < mid || j < hi)
        //if (j == hi){
        //tempArray.add(arrayList.get(i);
        //}
        //else if (i == mid){
        //tempArray.add(arrayList.get(i);
        //i++;
        //}
        //{
        // else if (arrayList.get(j) < arrayList.get(i))
        //{
        //tempArray.add(arrayList.get(j));
        //j++;
        //else{
        //tempArray.add(arrayList.get(i));
        //}
        //}
        //}
        int sizeleft = mid - lo +1;
        int sizeright = hi - mid;

        int left[] = new int[sizeleft];
        int right[] = new int[sizeright];

        for (int i = 0; i < sizeleft; i++)
        {
            left[i] = arrayList[lo + 1];
        }
        for (int i = 0; i < sizeright; i++)
        {
            right[i] = arrayList[i + 1 + mid];
        }
        int firstIndLeft = 0;
        int firstIndRight = 0;
        int firstIndMerged = lo;

        while (firstIndLeft < sizeleft || firstIndRight < sizeright)
        {
            if (left[firstIndLeft] <= right[firstIndRight])
            {
                arrayList[firstIndMerged]  = left[firstIndLeft];
                firstIndLeft++;
            }
            else
            {
               arrayList[firstIndMerged] = right[firstIndRight];
               firstIndRight++;
            }
            firstIndMerged++;
        }
        while (firstIndLeft < sizeleft)
        {
            arrayList[firstIndMerged] = left[firstIndLeft];
            firstIndRight++;
            firstIndMerged++;
        }
        while (firstIndRight < sizeright)
        {
            arrayList[firstIndLeft] = right[firstIndRight];
            firstIndRight++;
        }
    }
}
