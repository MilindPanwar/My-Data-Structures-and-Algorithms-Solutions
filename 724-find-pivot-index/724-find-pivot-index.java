class Solution {

    public int pivotIndex(int[] nums) {
        if (nums.length< 1) {
            return 1;
        }

        int totalsum = 0; //array ke sare elements ko add karna hai isme
        for (int i : nums) {
            totalsum += i; //totalsum mei array sum store kardo
        }

        int leftsum = 0; //left sum ke liye
        for (int i = 0; i < nums.length; i++) { //loop 0 se end tak
            //ye right sum ki tarah kaam karega
            totalsum = totalsum - nums[i];

            //jahan left aur right equal hogaye...
            if (leftsum==totalsum) {
                //...wo index return kardo
                return i;
            }

            //ye left sum mei values add karne ke liye hai
            //leftsum ki value badaate chalo
            leftsum = leftsum + nums[i];
        }

        //jab left aur right dono equal aaye hi nahi
        //matlabv pivot index hai hi nahi
        //to -1 return karvado
        return -1;
    }
}
