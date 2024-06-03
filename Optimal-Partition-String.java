class Solution {
    public int partitionString(String s) {
        String result = "";
        int part=1;
        for(int i=0; i<s.length(); i++){
            CharSequence c = Character.toString(s.charAt(i));
            if(!result.contains(c)){
                result += c;
            }else{
                part++;
                result = "";
                result += c;
            }
        }
        return part;
    }
}
