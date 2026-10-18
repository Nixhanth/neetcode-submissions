class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[256];
        for(char ch : s.toCharArray()){
            arr[ch]++;
        }
        for(char ch : t.toCharArray()){
            arr[ch]--;
        }
        for(int i=0; i<256; i++){
            if(arr[i] !=0) return false;
        }
        return true;
    }
}
