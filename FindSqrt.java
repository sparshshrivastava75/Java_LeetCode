class Solution {
    public int mySqrt(int x) {
        int l = 1;         
        int r = x;
        while(l<=r){
            int mid=(l+r)/2;
            int temp = x/mid;
            if(temp == mid){
                return mid;
            }
            else
                if(mid>temp){
                    r = mid-1;
                }
                else{
                    l = mid+1;
                }

            }

        return r;
        
    }
}