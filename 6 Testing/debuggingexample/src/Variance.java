
public class Variance {

    public static double variance(double[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        double sum = 0;
        double aver = average(nums);
        for (int i = 0; i < nums.length; i++) {
            sum += Math.pow((nums[i] - aver), 2);
        }
        return sum / nums.length;
    }

    public static double average(double[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum / nums.length;
    }
}
