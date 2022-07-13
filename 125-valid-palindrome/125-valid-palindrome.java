class Solution {
    public boolean isPalindrome(String sa) {
String s=   sa.toLowerCase();
        int lo=0;
        int hi=s.length()-1;
        
        while(lo<hi){
            while(lo<hi && !Character.isLetterOrDigit(s.charAt(lo))){
                lo++;
            }
            while(lo<hi && !Character.isLetterOrDigit(s.charAt(hi))){
                hi--;
            }
            if(s.charAt(lo)!=s.charAt(hi)){
                return false;
            }
            lo++;
            hi--;
            
        }
        return true;
        
    }
}