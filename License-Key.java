class Solution {
     public String licenseKeyFormatting(String s, int k) {
        s = s.replaceAll("-", "");
        StringBuilder sb = new StringBuilder();
        if(s.length()==1){
            sb.append(s.toUpperCase());
        }
        for(int i=s.length()-1; i>0;){
            while(i>=k){
                sb.insert(0, s.substring(i - k + 1, i + 1).toUpperCase());
                sb.insert(0, "-");
                i=i-k;
            }
            sb.insert(0, s.substring(0, i + 1).toUpperCase());
            i=0;
        }
        return sb.toString();
    }
}
