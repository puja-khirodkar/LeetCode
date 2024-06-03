class Solution {
    public int numUniqueEmails(String[] emails) {
        String localName;
        String[] emailParts;
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            boolean valid = validateEmail(email);
            if (valid) {
                emailParts = email.split("@");
                localName = emailParts[0];
                localName = localName.contains(".") ? localName.replaceAll("\\.", "") : localName;
                localName = localName.contains("+") ? localName.split("\\+")[0] : localName;
                email = localName + "@" + emailParts[1];
                set.add(email);
            }
        }
        return set.size();
    }

    public boolean validateEmail(String email) {
        // check if email starts with alphabet, has atleast single @ and .
        if (!Character.isAlphabetic(email.charAt(0)) || !email.contains("@")
                || email.indexOf("@") != email.lastIndexOf("@") || !email.contains(".")) {
            return false;
        }
        return true;
    }
}
