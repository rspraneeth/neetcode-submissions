class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] pf = new int[len];
        // int[] sf = new int[len];
        // int[] op = new int[len];
        pf[0] = 1;
        for(int i = 1; i < len; i++){
            pf[i] = pf[i-1]*nums[i-1];
        }
        // sf[len-1] = 1;
        // for(int i = len - 2; i >= 0; i--){
        //     sf[i] = sf[i+1]*nums[i+1];
        // }
        // for(int i =0; i < len; i++){
        //     op[i] = pf[i]*sf[i];
        // }
        // return op;

        int runSf = 1;
        for(int i = len - 1; i >= 0; i--){
            pf[i] = runSf * pf[i];
            runSf = runSf * nums[i];
        }

        return pf;

    }
}  
