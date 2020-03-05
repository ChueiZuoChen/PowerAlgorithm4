public class PowerAlgorithm4 {

    public static void main(String args[]) {
        SmartPower smartPower = new SmartPower();
        //2 power 10 is 1024
        System.out.println(smartPower.caculateSmartPower(2,10));
    }
}

class SmartPower {

    private int p;
    private int q;
    private int m;

    public SmartPower() {
    }

    public SmartPower(int p, int q, int m) {
        this.p = p;
        this.q = q;
        this.m = m;
    }

    public int caculateSmartPower(int b, int n) {
        if (n < 0) {
            return 0;
        }
        this.p = 1;
        this.q = b;
        this.m = n;

        while (m > 0) {
            if (m % 2 != 0) {
                p = p * q;
            }
            m = m / 2;
            q = q * q;

        }
        return p;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }
}
