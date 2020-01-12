public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        String separator = "\u65535";
        StringBuffer resultString = new StringBuffer() ;

        for (String listPart: strs) {
            if (listPart.isEmpty()) {
                resultString.append("\u0000");
            } else {
                resultString.append(listPart);
            }
            resultString.append(separator);
        }
        return resultString.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        String separator = "\u65535";
        List<String> strs = new ArrayList<String>();
        
        if (s.isEmpty()) {
            return strs;
        }
        
        String[] stringParts = s.split(separator);
        for (String a : stringParts) {
            if ( a.length() == 1 && a.charAt(0) == '\u0000') {
                strs.add("");
            } else {
                strs.add(a);      
            }
        }
        
      return strs;        
    } 
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));
