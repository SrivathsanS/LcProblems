package main;

public class ContiguousSubarray {

    public static void main(String[] args){


        int a[] = {3,-4,5,7,-8,3};
        //output :  3,-1,5,7 = 14
        int max_sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
               int tempSum=0;
                for(int k=i;k<j;k++){
                    tempSum=tempSum+a[k];
                    if(max_sum < tempSum)
                        max_sum=tempSum;
                }

            }
        }

        System.out.println("maximum contiguous subarray sum is : "+ max_sum);

    }
}
