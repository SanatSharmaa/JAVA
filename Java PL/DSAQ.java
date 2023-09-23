// // BUY AND SELL STOCKS
//  public class Arrays {
//     public static void main(String args[]){
//         int nums [] = {7,6,4,3,2,1};

//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;

//         for (int i = 0 ; i<nums.length;i++){
//             if(buyPrice < nums[i]){
//                 int profit =nums[i]- buyPrice;
//                 maxProfit = Math.max(maxProfit,profit); 
//             }else{
//                 buyPrice = nums[i];
//             }
//         }
//         System.out.println("Profit : " + maxProfit);
//     }
// }


//TRAPPED RAINWATER 
public class DSAQ {
    public static int calculate(int height[]){
        int n = height.length;
        // find left max 
        int leftmax[] = new int[n];
        leftmax [0] = height[0];
        for (int i = 1 ; i<n;i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1] );
        }
        // find right max
        int rightmax [] = new int[n];
        rightmax[n-1] = height[n-1];
        for (int i = n-2 ; i>=0 ; i --){
            rightmax [i]= Math.max(height[i],rightmax[i+1]);
        }
        int trappedwater = 0;
        // find water level
        for (int i =0  ; i<n ; i++){
            int waterlev = Math.min(leftmax[i],rightmax[i]);
            trappedwater += waterlev - height[i];
        }
        return trappedwater;
    }  
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println("Trapped rainwater : " + calculate(height));
    }
}
