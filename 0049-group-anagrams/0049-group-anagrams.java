class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         HashMap<String, List<String>> hashMap = new HashMap<>();

        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if (!hashMap.containsKey(key)) {
                // ArrayList<String> list=new ArrayList<>();

                hashMap.put(key, new ArrayList<>());
            }
            hashMap.get(key).add(str);
        }
        // ArrayList<String> value=new ArrayList<>(hashMap.value());
        return new ArrayList<>(hashMap.values());
    }
}