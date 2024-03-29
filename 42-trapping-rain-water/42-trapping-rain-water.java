class Solution {
    public int trap(int[] height) {
    int len = height.length;
    if(len == 0)    return 0;
    int[] maxleft = new int[len];
    int[] maxright = new int[len];
    int max = Integer.MIN_VALUE;
    for(int i=0;i<len;i++){
        if(height[i] > max){
            max = height[i];
        }
        maxleft[i] = max;
    }
    max = Integer.MIN_VALUE;
    for(int i=len-1;i>=0;i--){
        if(height[i] > max){
            max = height[i];
        }
        maxright[i] = max;
    }
    int ret = 0;
    for(int i=0;i<len;i++){
        int diff = Math.min(maxleft[i],maxright[i]) - height[i];
        if(diff > 0)    ret += diff;
    }
    return ret;
}
}