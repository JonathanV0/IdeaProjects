package CSA;

import java.util.Arrays;

public class SelectionSortWithRuntime
{
    public static int selectionSort(int[] elements)
    {
        int count = 0;
        for (int j = 0; j < elements.length - 1; j++)
        {
            int minIndex = j;

            for (int k = j + 1; k < elements.length; k++)
            {
                if (elements[k] < elements[minIndex])
                {
                    minIndex = k;
                }
                count++;
            }
            int temp = elements[j];
            elements[j] = elements[minIndex];
            elements[minIndex] = temp;
        }
        return count;
    }

    public static void main(String[] args)
    {
        int[] arr1 = {1,2,3,5,4};

        System.out.println("Before: " + Arrays.toString(arr1));
        System.out.println("Number of times looped "+ selectionSort(arr1));
        System.out.println("After: " + Arrays.toString(arr1));
    }
}