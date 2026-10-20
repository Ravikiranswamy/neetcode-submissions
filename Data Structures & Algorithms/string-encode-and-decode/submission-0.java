class Solution {

    public String encode(List<String> strs) {
  StringBuilder sb = new StringBuilder();

        for (String str : strs) {
            sb.append(str.length());
            sb.append('#');
            sb.append(str);
        }

        return sb.toString();
    }
    

    public List<String> decode(String str) {
   List<String> result = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            int hash = str.indexOf('#', i);

            int len = Integer.parseInt(str.substring(i, hash));

            String word = str.substring(hash + 1, hash + 1 + len);

            result.add(word);

            i = hash + 1 + len;
        }

        return result;
    }
}
    

