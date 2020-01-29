public class BubbleSort {
    public static void main(String[] args) {
        ArrayDemo ob1 = new ArrayDemo();
        int swap = -1;
        int steps = 0;
        int len = ob1.tempArray.length;
        while (swap != 0)
        {
            swap = 0;
            for (int i = 1; i < len ; i++)
            {
                if (ob1.tempArray[i -1] > ob1.tempArray[i])
                {
                    swap += 1;
                    int temp = ob1.tempArray[i - 1];
                    ob1.tempArray[i -1] = ob1.tempArray[i];
                    ob1.tempArray[i] = temp;
                }
                steps++;
            }
            len --;
        }
        for (int i:ob1.tempArray)
        {
            System.out.print(i);
        }
        System.out.println("");
        System.out.println(steps);
    }
}