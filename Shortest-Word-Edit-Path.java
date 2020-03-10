import java.io.*;
import java.util.*;

class Solution {

	static int shortestWordEditPath(String source, String target, String[] words) {
		// your code goes here
    //store the words in hashSet
    if(source.length()!=target.length())
      return -1;

    if(words.length==1 && !words[0].equals(target) )
      return -1;

    Set<String> set = new HashSet<String>();
    for(String w: words)
      set.add(w);

    int[] visited = new int[words.length];
    Queue<String> queue = new LinkedList<String>();
    queue.add(source);

    int index = 0;
    char[] word2 = new char[source.length()];
    int count = 0;
     // Copy character by character into array
    for (int i = 0; i < source.length(); i++) {
        word2[i] = source.charAt(i);
    }

   // for()
    for(int i=0; i< source.length(); i++){
      // for each character replace with another character from a to z
         for(char c='a'; c<='z'; c++){
            word2[i] = c;
            if(word2.toString() != source) {
                 if(set.contains(word2) && visited[i]!=1){
                     if(word2.equals(target))
                       return count+1;
                     else{
                         queue.add(word2.toString());
                         visited[index] = 1;
                         index++;
                       }
                 }
           }
      }
     count++;

    }
   return  count;
	}

	public static void main(String[] args) {

	}
}
