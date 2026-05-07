package imp;

public class trappingRainwater {
    public static int TrapedWater(int[] height) {
        // calculate left max boundary - array
        int[] leftMax = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // calculate rigth max boundary - array
        int[] rightMax = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        // loop
        // waterlevel - min(leftMax bound , rigthMaxBound)
        // trapedWater = waterLevel - height[i]

        int trapedWater = 0;
        for (int i = 0; i < height.length; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trapedWater += waterLevel - height[i];

        }

        return trapedWater;

    }

    public static void main(String[] args) {
        int[] height = { 4, 2, 0, 6, 3, 2, 5 };
        int trapedWater = TrapedWater(height);
        System.out.print("traped water : " + trapedWater);
    }
}
