package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7.chapter_8.Array_java;

public class trappingW {
    public static void trapping_water(int height[]) {
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        // left maximum
        for (int i = 1; i < height.length; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }
        // right maximum
        int rightmax[] = new int[height.length];
        rightmax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }
        // calculating water level
        int trappedwater = 0;
        for (int i = 0; i < height.length - 1; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trappedwater += waterlevel - height[i];
         }
        System.out.println("Total water trapping " + trappedwater);
    }

    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        trapping_water(height);

    }

}
