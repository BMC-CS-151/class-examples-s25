class UniqueChar {
    

    public int firstUniqChar(String s) {
        //O(n^2) runtime O(1) memeory solution: 
        //For each character, loop over the rest of the string to see if it
        //exists 
        for (int i=0; i<s.length(); i++) {
            boolean found = false;
            char cur = s.charAt(i);

            for (int j=i+1; j<s.length(); j++) {
                if (cur == s.charAt(j)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return i;
            }
        }

        return -1;
    }
}
