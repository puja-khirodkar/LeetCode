class Solution {
    public boolean backspaceCompare(String S, String T) {
        StringBuilder sbSource = new StringBuilder();
        StringBuilder sbTarget = new StringBuilder();

        for(int i=0; i<S.length(); i++){
            if(S.charAt(i) != '#'){
                sbSource.append(S.charAt(i));
            }else{
                if(!sbSource.toString().isEmpty()){
                    sbSource.deleteCharAt(sbSource.length()-1);
                }
            }
        }

        for(int i=0; i<T.length(); i++){
            if(T.charAt(i) != '#'){
                sbTarget.append(T.charAt(i));
            }else{
                if(!sbTarget.toString().isEmpty()){
                    sbTarget.deleteCharAt(sbTarget.length()-1);
                }
            }
        }

        return sbSource.toString().equals(sbTarget.toString())? true : false;
    }
}
