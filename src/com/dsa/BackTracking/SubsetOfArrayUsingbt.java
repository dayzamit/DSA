package com.dsa.BackTracking;

import java.util.ArrayList;
import java.util.List;



public class SubsetOfArrayUsingbt {

    public static void main(String[] args)
    {

        permute(new int[]{1,2,3});

    }


    public static void recurPer(int startIdx,int[] nums,List<List<Integer>> ans)
    {
        int funcallCount=0;
         if(startIdx==nums.length)
         {
             funcallCount++;
             List<Integer> ds= new ArrayList<>();

             for (int i=0;i<nums.length;i++)
             {
                 ds.add(nums[i]);

             }

             ans.add(new ArrayList<>(ds));

            return;
         }

        for (int i=startIdx;i<nums.length;i++)
        {

            swap(i,startIdx,nums);
            recurPer(startIdx+1,nums,ans);
            swap(i,startIdx,nums);
        }


    }

    public static void swap(int i,int j,int[] nums)
    {
        int temp =nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static List<List<Integer>> permute(int[] nums)
    {
        List<List<Integer>> ans= new ArrayList<>();

        recurPer(0,nums,ans);

        return ans;
    }
}
