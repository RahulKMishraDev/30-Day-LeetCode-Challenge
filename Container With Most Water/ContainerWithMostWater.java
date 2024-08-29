class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max=0;
        int i=0;
        int j=height.length-1;
        while(i<j){
            int diffv=j-i;
            int x =height[i];
            int y=height[j];
            int diffh=Math.min(x,y);
            int area=diffh*diffv;
            if(max<area){
                max=area;
            }
            if(x<y){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }
}