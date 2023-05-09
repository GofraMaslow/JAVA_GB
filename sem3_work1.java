

import java.util.Arrays;

public class sem3_work1 {
    public static void main(String[] args) {
        int[] array1 = { 81, 0, -13, 5, 16, 9, 8, -4, 2, -99, 43 };
        int[] result = mergesort(array1);
        System.out.println(Arrays.toString(result));
    }
 
    public static int[] mergesort(int[] array1) {
        int[] buffer1 = Arrays.copyOf(array1, array1.length);
        // int[] buffer2 = new int[array1.length];
        int[] result = mergesortInner(buffer1, 0, array1.length);
        return result;
    }
 
    public static int[] mergesortInner(int[] buffer1, 
            int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }
        
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergesortInner(buffer1, startIndex, middle);
        int[] sorted2 = mergesortInner(buffer1, middle, endIndex);
        
        
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = new int[sorted1.length];
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}