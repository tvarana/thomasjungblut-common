package de.jungblut.datastructure;

import java.lang.reflect.Array;
import java.util.Arrays;

import com.google.common.base.Preconditions;

/**
 * Array utils for stuff that isn't included in {@link Arrays}.
 * 
 * @author thomas.jungblut
 * 
 */
public final class ArrayUtils {

  /**
   * Finds the occurence of the given key in the given array. Linear search,
   * worst case running time is O(n).
   * 
   * @param array the array to search.
   * @param key the key to search.
   * @return -1 if the key wasn't found nowhere, or the index where the key was
   *         found.
   */
  public static <T> int find(T[] array, T key) {
    Preconditions.checkNotNull(key);
    int position = -1;
    for (int i = 0; i < array.length; i++) {
      if (array[i].equals(key)) {
        position = i;
        break;
      }
    }
    return position;
  }

  /**
   * Finds the occurence of the given key in the given array. Linear search,
   * worst case running time is O(n).
   * 
   * @param array the array to search.
   * @param key the key to search.
   * @return -1 if the key wasn't found nowhere, or the index where the key was
   *         found.
   */
  public static int find(int[] array, int key) {
    Preconditions.checkNotNull(key);
    int position = -1;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == key) {
        position = i;
        break;
      }
    }
    return position;
  }

  /**
   * Finds the occurence of the given key in the given array. Linear search,
   * worst case running time is O(n).
   * 
   * @param array the array to search.
   * @param key the key to search.
   * @return -1 if the key wasn't found nowhere, or the index where the key was
   *         found.
   */
  public static int find(long[] array, long key) {
    Preconditions.checkNotNull(key);
    int position = -1;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == key) {
        position = i;
        break;
      }
    }
    return position;
  }

  /**
   * Finds the occurence of the given key in the given array. Linear search,
   * worst case running time is O(n).
   * 
   * @param array the array to search.
   * @param key the key to search.
   * @return -1 if the key wasn't found nowhere, or the index where the key was
   *         found.
   */
  public static int find(double[] array, double key) {
    Preconditions.checkNotNull(key);
    int position = -1;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == key) {
        position = i;
        break;
      }
    }
    return position;
  }

  /**
   * Concats the given arrays.
   * 
   * @param arrays the arrays to pass.
   * @return a single array where the given arrays content is concatenated.
   */
  public static int[] concat(int[]... arrays) {
    int length = 0;
    for (int i = 0; i < arrays.length; i++)
      length += arrays[i].length;
    int[] merged = new int[length];
    int index = 0;
    for (int i = 0; i < arrays.length; i++) {
      System.arraycopy(arrays[i], 0, merged, index, arrays[i].length);
      index += arrays[i].length;
    }

    return merged;
  }

  /**
   * Concats the given arrays.
   * 
   * @param clazz the class type of the array elements.
   * @param arrays the arrays to pass.
   * @return a single array where the given arrays content is concatenated.
   */
  @SuppressWarnings("unchecked")
  public static <T> T[] concat(Class<T> clazz, T[]... arrays) {
    int length = 0;
    for (int i = 0; i < arrays.length; i++)
      length += arrays[i].length;
    T[] merged = (T[]) Array.newInstance(clazz, length);
    int index = 0;
    for (int i = 0; i < arrays.length; i++) {
      System.arraycopy(arrays[i], 0, merged, index, arrays[i].length);
      index += arrays[i].length;
    }

    return merged;
  }

  /**
   * Copies the given array into a new one.
   */
  public static int[] copy(int[] array) {
    int[] newInt = new int[array.length];
    System.arraycopy(array, 0, newInt, 0, array.length);
    return newInt;
  }

  /**
   * Copies the given array into a new one.
   */
  public static <T> T[] copy(T[] array) {
    return Arrays.copyOf(array, array.length);
  }

  /**
   * Swaps the given indices x with y in the array.
   */
  public static void swap(int[] array, int x, int y) {
    int tmpIndex = array[x];
    array[x] = array[y];
    array[y] = tmpIndex;
  }

  /**
   * Swaps the given indices x with y in the array.
   */
  public static void swap(long[] array, int x, int y) {
    long tmpIndex = array[x];
    array[x] = array[y];
    array[y] = tmpIndex;
  }

  /**
   * Swaps the given indices x with y in the array.
   */
  public static void swap(double[] array, int x, int y) {
    double tmpIndex = array[x];
    array[x] = array[y];
    array[y] = tmpIndex;
  }

  /**
   * Swaps the given indices x with y in the array.
   */
  public static void swap(boolean[] array, int x, int y) {
    boolean tmpIndex = array[x];
    array[x] = array[y];
    array[y] = tmpIndex;
  }

  /**
   * Swaps the given indices x with y in the array.
   */
  public static <T> void swap(T[] array, int x, int y) {
    T tmpIndex = array[x];
    array[x] = array[y];
    array[y] = tmpIndex;
  }

  /**
   * Converts the given array of object type to its primitive counterpart.
   */
  public static int[] toPrimitiveArray(Integer[] array) {
    int[] arr = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      Preconditions.checkNotNull(array[i]);
      arr[i] = array[i].intValue();
    }
    return arr;
  }

  /**
   * Converts the given array of object type to its primitive counterpart.
   */
  public static long[] toPrimitiveArray(Long[] array) {
    long[] arr = new long[array.length];
    for (int i = 0; i < array.length; i++) {
      Preconditions.checkNotNull(array[i]);
      arr[i] = array[i].longValue();
    }
    return arr;
  }

  /**
   * Converts the given array of object type to its primitive counterpart.
   */
  public static double[] toPrimitiveArray(Double[] array) {
    double[] arr = new double[array.length];
    for (int i = 0; i < array.length; i++) {
      Preconditions.checkNotNull(array[i]);
      arr[i] = array[i].doubleValue();
    }
    return arr;
  }

  /**
   * Partitions the given array in-place and uses the last element as pivot,
   * everything less than the pivot will be placed left and everything greater
   * will be placed right of the pivot. It returns the index of the pivot
   * element after partitioning.
   */
  public static <T extends Comparable<T>> int partition(T[] array) {
    return partition(array, 0, array.length);
  }

  /**
   * Partitions the given array in-place and uses the end element as pivot,
   * everything less than the pivot will be placed left and everything greater
   * will be placed right of the pivot. It returns the index of the pivot
   * element after partitioning.
   */
  public static <T extends Comparable<T>> int partition(T[] array, int start,
      int end) {
    final int ending = end - 1;
    final T x = array[ending];
    int i = start - 1;
    for (int j = start; j < ending; j++) {
      if (array[j].compareTo(x) < 0) {
        i++;
        swap(array, i, j);
      }
    }
    i++;
    swap(array, i, ending);
    return i;
  }

  /**
   * Partitions the given array in-place and uses the last element as pivot,
   * everything less than the pivot will be placed left and everything greater
   * will be placed right of the pivot. It returns the index of the pivot
   * element after partitioning.
   */
  public static int partition(int[] array) {
    return partition(array, 0, array.length);
  }

  /**
   * Partitions the given array in-place and uses the end element as pivot,
   * everything less than the pivot will be placed left and everything greater
   * will be placed right of the pivot. It returns the index of the pivot
   * element after partitioning.
   */
  public static int partition(int[] array, int start, int end) {
    final int ending = end - 1;
    final int x = array[ending];
    int i = start - 1;
    for (int j = start; j < ending; j++) {
      if (array[j] <= x) {
        i++;
        swap(array, i, j);
      }
    }
    i++;
    swap(array, i, ending);
    return i;
  }

  /**
   * Partitions the given array in-place and uses the last element as pivot,
   * everything less than the pivot will be placed left and everything greater
   * will be placed right of the pivot. It returns the index of the pivot
   * element after partitioning.
   */
  public static int partition(long[] array) {
    return partition(array, 0, array.length);
  }

  /**
   * Partitions the given array in-place and uses the end element as pivot,
   * everything less than the pivot will be placed left and everything greater
   * will be placed right of the pivot. It returns the index of the pivot
   * element after partitioning.
   */
  public static int partition(long[] array, int start, int end) {
    final int ending = end - 1;
    final long x = array[ending];
    int i = start - 1;
    for (int j = start; j < ending; j++) {
      if (array[j] <= x) {
        i++;
        swap(array, i, j);
      }
    }
    i++;
    swap(array, i, ending);
    return i;
  }

  /**
   * Partitions the given array in-place and uses the last element as pivot,
   * everything less than the pivot will be placed left and everything greater
   * will be placed right of the pivot. It returns the index of the pivot
   * element after partitioning.
   */
  public static int partition(double[] array) {
    return partition(array, 0, array.length);
  }

  /**
   * Partitions the given array in-place and uses the end element as pivot,
   * everything less than the pivot will be placed left and everything greater
   * will be placed right of the pivot. It returns the index of the pivot
   * element after partitioning.
   */
  public static int partition(double[] array, int start, int end) {
    final int ending = end - 1;
    final double x = array[ending];
    int i = start - 1;
    for (int j = start; j < ending; j++) {
      if (array[j] <= x) {
        i++;
        swap(array, i, j);
      }
    }
    i++;
    swap(array, i, ending);
    return i;
  }

  /**
   * Selects the kth smallest element in the array in linear time, if the array
   * is smaller than or equal to 10 a radix sort will be used and the kth
   * element will be returned. So k = 1, will return the absolutely smallest
   * element.
   * 
   * @return the kth smallest index of the element.
   */
  public static int quickSelect(int[] array, int k) {
    Preconditions.checkArgument(k > 0 && k <= array.length);
    final int n = array.length;
    if (n <= 10) {
      radixSort(array);
      return k - 1;
    }
    return quickSelect(array, 0, n, k);
  }

  /**
   * Selects the kth smallest element in the array.
   * 
   * @param start the index where to start.
   * @param end the index where to end.
   * @return the kth smallest index of the element.
   */
  public static int quickSelect(int[] array, int start, int end, int k) {
    if (start == end) {
      return start;
    }

    final int pivot = partition(array, start, end);
    final int length = pivot - start + 1;

    if (length == k) {
      return pivot;
    } else if (k < length) {
      return quickSelect(array, start, pivot - 1, k);
    } else {
      return quickSelect(array, pivot + 1, end, k - length);
    }
  }

  /**
   * Selects the kth smallest element in the array in linear time. k = 1, will
   * return the absolutely smallest element.
   * 
   * @return the kth smallest index of the element.
   */
  public static int quickSelect(double[] array, int k) {
    Preconditions.checkArgument(k > 0 && k <= array.length);
    return quickSelect(array, 0, array.length, k);
  }

  /**
   * Selects the kth smallest element in the array.
   * 
   * @param start the index where to start.
   * @param end the index where to end.
   * @return the kth smallest index of the element.
   */
  public static int quickSelect(double[] array, int start, int end, int k) {
    if (start == end) {
      return start;
    }

    final int pivot = partition(array, start, end);
    final int length = pivot - start + 1;

    if (length == k) {
      return pivot;
    } else if (k < length) {
      return quickSelect(array, start, pivot - 1, k);
    } else {
      return quickSelect(array, pivot + 1, end, k - length);
    }
  }

  /**
   * Selects the kth smallest element in the array in linear time. k = 1, will
   * return the absolutely smallest element.
   * 
   * @return the kth smallest index of the element.
   */
  public static int quickSelect(long[] array, int k) {
    Preconditions.checkArgument(k > 0 && k <= array.length);
    return quickSelect(array, 0, array.length, k);
  }

  /**
   * Selects the kth smallest element in the array.
   * 
   * @param start the index where to start.
   * @param end the index where to end.
   * @return the kth smallest index of the element.
   */
  public static int quickSelect(long[] array, int start, int end, int k) {
    if (start == end) {
      return start;
    }

    final int pivot = partition(array, start, end);
    final int length = pivot - start + 1;

    if (length == k) {
      return pivot;
    } else if (k < length) {
      return quickSelect(array, start, pivot - 1, k);
    } else {
      return quickSelect(array, pivot + 1, end, k - length);
    }
  }

  /**
   * Selects the kth smallest element in the array in linear time. k = 1, will
   * return the absolutely smallest element.
   * 
   * @return the kth smallest index of the element.
   */
  public static <T extends Comparable<T>> int quickSelect(T[] array, int k) {
    Preconditions.checkArgument(k > 0 && k <= array.length);
    return quickSelect(array, 0, array.length, k);
  }

  /**
   * Selects the kth smallest element in the array.
   * 
   * @param start the index where to start.
   * @param end the index where to end.
   * @return the kth smallest index of the element.
   */
  public static <T extends Comparable<T>> int quickSelect(T[] array, int start,
      int end, int k) {
    if (start == end) {
      return start;
    }

    final int pivot = partition(array, start, end);
    final int length = pivot - start + 1;

    if (length == k) {
      return pivot;
    } else if (k < length) {
      return quickSelect(array, start, pivot - 1, k);
    } else {
      return quickSelect(array, pivot + 1, end, k - length);
    }
  }

  /**
   * Finds the median of medians in the given array.
   * 
   * @return the index of the median of medians.
   */
  public static int medianOfMedians(int[] array) {
    final int splitSize = array.length / 5;

    int[] pivots = new int[splitSize];
    for (int i = 0; i < splitSize; i++) {
      final int start = i * 5;
      final int end = i * 5 + 5;
      pivots[i] = partition(array, start, end);
    }

    return pivots[splitSize / 2];
  }

  /**
   * Creates an integer array from the given start up to a end number with a
   * stepsize.
   * 
   * @param from the integer to start with.
   * @param to the integer to end with.
   * @param stepsize the stepsize to take
   * @return an integer array from start to end incremented by stepsize.
   */
  public static int[] fromUpTo(int from, int to, int stepsize) {
    int[] v = new int[(to - from) / stepsize];

    for (int i = 0; i < v.length; i++) {
      v[i] = from + i * stepsize;
    }
    return v;
  }

  /**
   * Creates a long array from the given start up to a end number with a
   * stepsize.
   * 
   * @param from the long to start with.
   * @param to the long to end with.
   * @param stepsize the stepsize to take
   * @return a long array from start to end incremented by stepsize.
   */
  public static long[] fromUpTo(long from, long to, long stepsize) {
    long[] v = new long[(int) ((to - from) / stepsize)];

    for (int i = 0; i < v.length; i++) {
      v[i] = from + i * stepsize;
    }
    return v;
  }

  /**
   * Creates a double array from the given start up to a end number with a
   * stepsize.
   * 
   * @param from the double to start with.
   * @param to the double to end with.
   * @param stepsize the stepsize to take
   * @return a double array from start to end incremented by stepsize.
   */
  public static double[] fromUpTo(double from, double to, double stepsize) {
    double[] v = new double[(int) (Math.round(((to - from) / stepsize) + 0.5))];

    for (int i = 0; i < v.length; i++) {
      v[i] = from + i * stepsize;
    }
    return v;
  }

  /**
   * Radix sorts an integer array in O(m*n), where m is the length of the key
   * (here 32 bit) and n the number of elements. It only works for positive
   * numbers, so please don't come up with negative numbers, it will result in
   * array out of bound exceptions, since they don't have an array index.
   */
  public static void radixSort(int[] a) {
    int[] nPart = new int[2];
    int[][] part = new int[2][a.length];
    for (int i = 0; i < 32; i++) {
      nPart[0] = 0;
      nPart[1] = 0;
      for (int j = 0; j < a.length; j++) {
        int n = (a[j] >> i) & 1;
        part[n][nPart[n]++] = a[j];
      }
      System.arraycopy(part[0], 0, a, 0, nPart[0]);
      System.arraycopy(part[1], 0, a, nPart[0], nPart[1]);
    }
  }

  /**
   * Counting sort that sorts the integer array in O(n+k) where n is the number
   * of elements and k is the length of the integer intervals given (high -
   * low). So you can imagine that it uses domain knowledge of the contained
   * integers, like the lowest value and the highest. It only works for positive
   * numbers, so please don't come up with negative numbers, it will result in
   * array out of bound exceptions, since they don't have an array index.
   */
  public static void countingSort(int[] a, int low, int high) {
    final int[] counts = new int[high - low + 1];
    for (int x : a) {
      counts[x - low]++;
    }

    int current = 0;
    for (int i = 0; i < counts.length; i++) {
      Arrays.fill(a, current, current + counts[i], i + low);
      current += counts[i];
    }
  }

  /**
   * Quicksorts this array.
   */
  public static void quickSort(int[] a) {
    quickSort(a, 0, a.length);
  }

  /**
   * Quicksorts this array. With offset and length, this will be recursively
   * called by itself.
   */
  public static void quickSort(int[] a, int offset, int length) {
    if (offset < length) {
      int pivot = partition(a, offset, length);
      quickSort(a, offset, pivot);
      quickSort(a, pivot + 1, length);
    }
  }

  /**
   * Quicksorts this array.
   */
  public static void quickSort(long[] a) {
    quickSort(a, 0, a.length);
  }

  /**
   * Quicksorts this array. With offset and length, this will be recursively
   * called by itself.
   */
  public static void quickSort(long[] a, int offset, int length) {
    if (offset < length) {
      int pivot = partition(a, offset, length);
      quickSort(a, offset, pivot);
      quickSort(a, pivot + 1, length);
    }
  }

  /**
   * Quicksorts this array.
   */
  public static void quickSort(double[] a) {
    quickSort(a, 0, a.length);
  }

  /**
   * Quicksorts this array. With offset and length, this will be recursively
   * called by itself.
   */
  public static void quickSort(double[] a, int offset, int length) {
    if (offset < length) {
      int pivot = partition(a, offset, length);
      quickSort(a, offset, pivot);
      quickSort(a, pivot + 1, length);
    }
  }

  /**
   * Quicksorts this array.
   */
  public static <T extends Comparable<T>> void quickSort(T[] a) {
    quickSort(a, 0, a.length);
  }

  /**
   * Quicksorts this array. With offset and length, this will be recursively
   * called by itself.
   */
  public static <T extends Comparable<T>> void quickSort(T[] a, int offset,
      int length) {
    if (offset < length) {
      int pivot = partition(a, offset, length);
      quickSort(a, offset, pivot);
      quickSort(a, pivot + 1, length);
    }
  }

  /**
   * Multi-sorts the given arrays with the quicksort algorithm. It assumes that
   * all arrays have the same sizes and it sorts on the first dimension of these
   * arrays. If the given arrays are null or empty, it will do nothing, if just
   * a single array was passed it will sort it via {@link Arrays} sort;
   */
  public static void multiQuickSort(int[]... arrays) {
    multiQuickSort(0, arrays);
  }

  /**
   * Multi-sorts the given arrays with the quicksort algorithm. It assumes that
   * all arrays have the same sizes and it sorts on the given dimension index
   * (starts with 0) of these arrays. If the given arrays are null or empty, it
   * will do nothing, if just a single array was passed it will sort it via
   * {@link Arrays} sort;
   */
  public static void multiQuickSort(int sortDimension, int[]... arrays) {
    // check if the lengths are equal, break if everything is empty
    if (arrays == null || arrays.length == 0) {
      return;
    }
    // if the array only has a single dimension, sort it and return
    if (arrays.length == 1) {
      Arrays.sort(arrays[0]);
      return;
    }
    // also return if the sort dimension is not in our array range
    if (sortDimension < 0 || sortDimension >= arrays.length) {
      return;
    }
    // check sizes
    int firstArrayLength = arrays[0].length;
    for (int i = 1; i < arrays.length; i++) {
      if (arrays[i] == null || firstArrayLength != arrays[i].length)
        return;
    }

    multiQuickSort(arrays, 0, firstArrayLength, sortDimension);
  }

  /**
   * Internal multi quicksort, doing the real algorithm.
   */
  private static void multiQuickSort(int[][] a, int offset, int length,
      int indexToSort) {
    if (offset < length) {
      int pivot = multiPartition(a, offset, length, indexToSort);
      multiQuickSort(a, offset, pivot, indexToSort);
      multiQuickSort(a, pivot + 1, length, indexToSort);
    }
  }

  /**
   * Partitions the given array in-place and uses the end element as pivot,
   * everything less than the pivot will be placed left and everything greater
   * will be placed right of the pivot. It returns the index of the pivot
   * element after partitioning. This is a multi way partitioning algorithm, you
   * have to provide a partition array index to know which is the array that
   * needs to be partitioned. The swap operations are applied on the other
   * elements as well.
   */
  private static int multiPartition(int[][] array, int start, int end,
      int partitionArrayIndex) {
    final int ending = end - 1;
    final int x = array[partitionArrayIndex][ending];
    int i = start - 1;
    for (int j = start; j < ending; j++) {
      if (array[partitionArrayIndex][j] <= x) {
        i++;
        for (int arrayIndex = 0; arrayIndex < array.length; arrayIndex++) {
          swap(array[arrayIndex], i, j);
        }
      }
    }
    i++;
    for (int arrayIndex = 0; arrayIndex < array.length; arrayIndex++) {
      swap(array[arrayIndex], i, ending);
    }

    return i;
  }

  /**
   * Multi-sorts the given arrays with the quicksort algorithm. It assumes that
   * all arrays have the same sizes and it sorts on the first dimension of these
   * arrays. If the given arrays are null or empty, it will do nothing, if just
   * a single array was passed it will sort it via {@link Arrays} sort;
   */
  @SafeVarargs
  public static <T extends Comparable<T>> void multiQuickSort(T[]... arrays) {
    multiQuickSort(0, arrays);
  }

  /**
   * Multi-sorts the given arrays with the quicksort algorithm. It assumes that
   * all arrays have the same sizes and it sorts on the given dimension index
   * (starts with 0) of these arrays. If the given arrays are null or empty, it
   * will do nothing, if just a single array was passed it will sort it via
   * {@link Arrays} sort;
   */
  @SafeVarargs
  public static <T extends Comparable<T>> void multiQuickSort(
      int sortDimension, T[]... arrays) {
    // check if the lengths are equal, break if everything is empty
    if (arrays == null || arrays.length == 0) {
      return;
    }
    // if the array only has a single dimension, sort it and return
    if (arrays.length == 1) {
      Arrays.sort(arrays[0]);
      return;
    }
    // also return if the sort dimension is not in our array range
    if (sortDimension < 0 || sortDimension >= arrays.length) {
      return;
    }
    // check sizes
    int firstArrayLength = arrays[0].length;
    for (int i = 1; i < arrays.length; i++) {
      if (arrays[i] == null || firstArrayLength != arrays[i].length)
        return;
    }

    multiQuickSort(arrays, 0, firstArrayLength, sortDimension);
  }

  /**
   * Internal multi quicksort, doing the real algorithm.
   */
  private static <T extends Comparable<T>> void multiQuickSort(T[][] a,
      int offset, int length, int indexToSort) {
    if (offset < length) {
      int pivot = multiPartition(a, offset, length, indexToSort);
      multiQuickSort(a, offset, pivot, indexToSort);
      multiQuickSort(a, pivot + 1, length, indexToSort);
    }
  }

  /**
   * Partitions the given array in-place and uses the end element as pivot,
   * everything less than the pivot will be placed left and everything greater
   * will be placed right of the pivot. It returns the index of the pivot
   * element after partitioning. This is a multi way partitioning algorithm, you
   * have to provide a partition array index to know which is the array that
   * needs to be partitioned. The swap operations are applied on the other
   * elements as well.
   */
  private static <T extends Comparable<T>> int multiPartition(T[][] array,
      int start, int end, int partitionArrayIndex) {
    final int ending = end - 1;
    final T x = array[partitionArrayIndex][ending];
    int i = start - 1;
    for (int j = start; j < ending; j++) {
      if (array[partitionArrayIndex][j].compareTo(x) < 0) {
        i++;
        for (int arrayIndex = 0; arrayIndex < array.length; arrayIndex++) {
          swap(array[arrayIndex], i, j);
        }
      }
    }
    i++;
    for (int arrayIndex = 0; arrayIndex < array.length; arrayIndex++) {
      swap(array[arrayIndex], i, ending);
    }

    return i;
  }

}