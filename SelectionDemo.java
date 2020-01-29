public class SelectionDemo {
    public static void main(String[] args) {
        ArrayDemo ob1 = new ArrayDemo();
        int len = ob1.tempArray.length;
        int steps = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < len -1; i++)
        {
            int minIndex=i;
            int minValue = ob1.tempArray[i];
            for ( int j = i + 1 ; j < len; j++)
            {
                if (minValue > ob1.tempArray[j])
                {
                    minIndex = j;
                    minValue = ob1.tempArray[j];
                }
                steps++;
            }
            int temp = ob1.tempArray[i];
            ob1.tempArray[i] = ob1.tempArray[minIndex];
            ob1.tempArray[minIndex] = temp;

        }
        long end = System.currentTimeMillis();
        System.out.println("Time: "+((end - start)) + "ms");



        for (int i:ob1.tempArray)
        {
            System.out.print(i);
        }
        System.out.println("");
       System.out.println(steps);
    }
}
