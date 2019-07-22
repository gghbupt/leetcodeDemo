package first100;

public class Container_With_Most_Water {

    public int maxArea(int[] height) {
        int lo = 0, hi = height.length;
        int max = 0;
        while (lo < hi) {
            max = Math.max(max, Math.min(height[lo], height[hi]) * (hi - lo));
            if (height[lo] < height[hi]) {
                lo++;
            }else {
                hi--;
            }
        }
        return max;
    }
}
