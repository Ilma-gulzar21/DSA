 //Given n non negative integers representing an elevation map where the width of each bar is 1, Compute of how much water it cn trap after raining
 class TrappedWater {

static int TrappeRaindWater(int height[]) {
  int n=height.length;
  //calculate left maximum boundary;
  int leftMax[] = new int[n];
  leftMax[0]=height[0];
  for(int i=1;i<n;i++) {
    leftMax[i]=Math.max(leftMax[i-1],height[i]);
  }
  
   //calculate right maximum boundary;
   int rightMax[]= new int[n];
   rightMax[n-1] = height[n-1];
   for(int i=n-2;i>=0;i--) {
     rightMax[i] = Math.max(height[i],rightMax[i+1]);
   }

   int width=1;
   int TrappedWater=0;
   for(int i=0;i<n;i++) {
   int waterLevel = Math.min(leftMax[i],rightMax[i]); 
   TrappedWater = TrappedWater +  waterLevel -height[i] * width;
} 
   return TrappedWater;
}
  public static void main(String args[]) {
 int height[] ={4,2,0,6,3,2,5};
 System.out.print( TrappeRaindWater(height));
  }
   }
 