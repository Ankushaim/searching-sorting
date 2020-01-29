public class MergeSortDemo {
    static void  merge_sort(int[] arr, int start, int end)
    {
        if (end == start +1) // if sub-array has one element base case..
        {
            return;
        }
        else
        {
            int middle = (start + end) / 2;
            merge_sort(arr, start, middle);
            merge_sort(arr, middle, end);
            merge(arr, start, middle, end);
        }
    }

    static void merge(int[] arr, int start1, int middle1, int end1)
    {

        int i, j; // running index for our sub arrays

        int[] temp = new int[end1 - start1]; // to create temp array in given range and to avoid array creation of big value

        int index;
        // to solve the problem for starting index in sub array where starting index is different ...
        if ( start1 > 0)
        {
            index = 0;
        }
        else
        {
            index = start1;
        }

        for (i = start1, j = middle1; ((i < middle1) || (j < end1));)
        {
            if ((i < middle1) && (j < end1))
            {
                if (arr[i] < arr[j])
                {
                    temp[index] = arr[i];
                    i++;
                }
                else
                {
                    temp[index] = arr[j];
                    j++;
                }
            }
            else
            {
                if (i < middle1)
                {
                    temp[index] = arr[i];
                    i++;
                }
                else
                {
                    temp[index] = arr[j];
                    j++;
                }
            }
            index++;
        }
        int k = 0; // different index for temp array because arr and temp size and working index needs to be different
        for (int l = start1; l < end1; l++)
        {
            arr[l] = temp[k];
            k++;
        }
    }

    public static void main(String[] args) {
        ArrayDemo ob1 = new ArrayDemo();
        for (int i = 0; i < 100000; i++)
        {
            ob1.tempArray[i] = i;
        }

        int len = ob1.tempArray.length;
        long start = System.currentTimeMillis();

        merge_sort(ob1.tempArray, 0, len);

        long end = System.currentTimeMillis();

        System.out.println("MergeSort takes " + (end - start) + "ms");


//        for (int i = 0; i < ob1.tempArray.length; i++)
//        {
//            System.out.println(ob1.tempArray[i]+ ",");
//        }
    }

}
