/* Problem:
Getting a Different Number
Given an array arr of unique nonnegative integers, implement a function getDifferentNumber that finds the smallest nonnegative integer that is NOT in the array.

Even if your programming language of choice doesn’t have that restriction (like Python), assume that the maximum value an integer can have is MAX_INT = 2^31-1. So, for instance, the operation MAX_INT + 1 would be undefined in our case.

Your algorithm should be efficient, both from a time and a space complexity perspectives.

Solve first for the case when you’re NOT allowed to modify the input arr. If successful and still have time, see if you can come up with an algorithm with an improved space complexity when modifying arr is allowed. Do so without trading off the time complexity.

Analyze the time and space complexities of your algorithm.

Example:

input:  arr = [0, 1, 2, 3]

output: 4

 */

import java.io.*;
import java.util.*;

//input:  arr = [0, 1, 4, 3]
// arr = [0, 1, 2, 3]
//output: 2

/*
  1) find min element
  2) if min != 0 return 0
  3) Recursive approach -> if min == 0 find next min2 element -> get min element in the range between 0 and min2

  if size = n
  worst case = output = Integer.MAX_VALUE;

*/

//Solution
class Solution {

  static int getDifferentNumber(int[] arr) {
    Set<Integer> set = new HashSet<Integer>();

    for(int a : arr)
      set.add(a);

    int i = 0;
    while(true)
      if(!isInSet(i, set)) return i;
      else i++;
   }



  static boolean isInSet(int val, Set<Integer> set) {

      // if found => return false
      if(set.contains(val))
        return true;
    return false;
  }


  public static void main(String[] args) {

  }

}
