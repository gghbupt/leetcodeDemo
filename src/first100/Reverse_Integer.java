package first100;

public class Reverse_Integer {
    public int reverse(int x) {
        boolean isMinus = x < 0;
        x = Math.abs(x);
        String sNum = new String(x + "");
        StringBuffer sb = new StringBuffer();
        for (int i = sNum.length() - 1; i >= 0; i--) {
            sb.append(sNum.charAt(i));
        }
        int res = Integer.parseInt(sb.toString());
        if (isMinus) {
            res = -res;
        }
        return res;
    }
}
