import java.io.*;
import java.util.*;

class Solution {

  /*input:  arr = [4, 6, 10, 15, 16],  lim = 21
  lim = 22 [11, ] -> complement = 11

    output: [3, 1]

    Solution 1: // Complements O(n^2)
    1) Scan an array one by one
    2) keep on adding with remaining elements of the array
    3) check if the sum of 2 elements with indices (i, j) = lim
    4) return   i,j

    Solution 2:
    1) Store elements in a map with (value , index)
    2) Find complememt = lim - arr[i]
    3) Check if the complement is present in map && check if index != current_index
    4) reorder indices i>j
    4) return indices


*/
  // Time Complexity = O(n)   Space Complexity =  O(n)
  static int[] getIndicesOfItemWeights(int[] arr, int limit) {
    // your code goes here

    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    int index, index2;
    int size = arr.length;
    int[] indices = new int[2];
    int[] empty = {};
    if(size < 2)
      return empty;

    for(int i = 0; i < size; i++){
       map.put(arr[i], i);
    }

    for(int i = 0; i< size; i++){
      int complement = limit - arr[i];

      if(map.containsKey(complement)){

        index = map.get(complement);

        if(index != i){
          if(i > index){
            indices[0] = i;
            indices[1] = index;

            return indices;
          }

          indices[0] = index;
          indices[1] = i;
        }
      }
    }
    return indices;

  }

  public static void main(String[] args) {

  }

}
