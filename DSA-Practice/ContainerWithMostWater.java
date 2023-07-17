public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,2,3,4};
        System.out.println(maxArea2(height));
    }
    public static int maxArea(int[] height) {
        int max = 0;
        for(int i = 0; i < height.length; i++){
            int count = 0;
            for(int j = i+1; j < height.length; j++){
                if(height[i] < height[j]){
                    count++;
                    int num = height[i] * count;
                    if(max < num){
                        max = num;
                    }
                }
                else if(height[i] > height[j]){
                    count++;
                    int num = height[j] * count;
                    if(max < num){
                        max = num;
                    }
                }
                else{
                    count++;
                    int num = height[i] * count;
                    if(max < num){
                        max = num;
                    }
                }
            }
       
        }
        return max;
    }
    // O(n)
    public static int maxArea2(int[] height) {
        int max = 0;
        int s = 0;
        int e = height.length-1;
        while(s<e){
            int area = (e-s)*(Math.min(height[e], height[s]));
            max = Math.max(max,area);
            if(height[s]<height[e]){
                s++;
            }
            else{
                e--;
            }
        }
        return max;
    }

}
