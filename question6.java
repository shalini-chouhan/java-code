public class question6 {
    public static void main(String args[])
    {
        int arr[] = {2, 1, 43, 5, 67, 44, 88, 77, 11, 3};
        int even = 0;
        int odd = 0;
        for (int i = 0; i < 0; i++)
        {
            if (arr[i] % 2 == 0)
            {
                even++;

            } else
                odd++;

        }
    }
System.out.print("Contents of the array:");
    for(int i = 0;i<10;i++)

    {
        System.out.print(arr[i] + " ");
    }
    System.out.println("\n Total even number is:"+even);
    System.out.print("Total Odd number is :"+odd);
}
}
