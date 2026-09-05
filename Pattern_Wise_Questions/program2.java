//Unique elements in the Array

import java.io.*;

class program2
{
    public static void main(String A[])
    {
        int nums[] = {1,1,1,2,2,3,3};

       int i = 0;
       int j = 0;
       int iCount = 1;  //first element is always unique

       for(j = 1; j < nums.length; j++)
       {
            if(nums[j] != nums[j-1])
            {
                nums[i+1] = nums[j];
                i++;
                iCount++;
            }
            
       }
        System.out.println("Unique elements are: "+iCount);



    }
}