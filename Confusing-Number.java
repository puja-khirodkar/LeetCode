class Solution {
    public boolean confusingNumber(int N) {
        Map<Character, Character> map = new HashMap();
        map.put('0','0');
        map.put('1','1');
        map.put('6','9');
        map.put('8','8');
        map.put('9','6');

        int digit = 0;
        String s = Integer.toString(N);
        StringBuffer sb = new StringBuffer();

        for(int i=0; i<s.length(); i++){
            if(!map.containsKey(s.charAt(i)))
                return false;
            else
                sb.append(map.get(s.charAt(i)));
        }

        if(sb.reverse().toString().equals(s))
            return false;
        return true;
    }
}
