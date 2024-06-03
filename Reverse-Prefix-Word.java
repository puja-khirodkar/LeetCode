class Solution {
    public String reversePrefix(String word, char ch) {
        if(word.indexOf(ch)==-1){
            return word;
        }
        int chIndex = word.indexOf(ch);
        String result = "";
        for(int i=chIndex; i>=0; i--){
            result+=word.charAt(i);
        }
        result+=word.substring(chIndex+1, word.length());
        return result;
    }
}

