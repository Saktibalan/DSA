class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int i = 0;
        while (i < chars.length) {
            char a = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == a) {
                i++;
                count++;
            }
            chars[index++] = a;
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }
        return index;
    }
}