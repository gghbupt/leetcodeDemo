package two;

public class le134 {

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int[] singleLeft = new int[gas.length];
        for (int i = 1; i < gas.length; i++) {
            singleLeft[i] = gas[i -1] - cost[i];
        }
        singleLeft[0] = gas[gas.length - 1] - cost[0];
        int begin = gas.length - 1;
        int end = 0;
        int sum = singleLeft[begin];
        while (begin > end) {
            if (sum >= 0) {
                sum += singleLeft[end];
                end++;
            } else {
                begin--;
                sum += singleLeft[begin];
            }
        }
        return sum >= 0 ? begin:-1;
    }

//    public static int canCompleteCircuit(int[] gas, int[] cost) {
//        int[] singleLeft = new int[gas.length];
//        for (int i = 0; i < gas.length; i++) {
//            singleLeft[i] = gas[i] - cost[i];
//        }
//        int begin = gas.length - 1;
//        int end = 0;
//        int sum = singleLeft[begin];
//        while (begin > end) {
//            if (sum >= 0) {
//                sum += singleLeft[begin];
//                end++;
//            } else {
//                begin--;
//                sum += singleLeft[begin];
//            }
//        }
//        return sum > 0 ? begin:-1;
//    }


    public static void main (String[] args) {
        int[] gas = {5,1,2,3,4};
        int[] cost = {4,4,1,5,1};
        int res = canCompleteCircuit(gas, cost);
        System.out.println(res);
    }
}
