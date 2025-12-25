package Quat;

public class Fan {
    private int SLOW = 1;
    private int MEDIUM = 2;
    private int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double banKinhQuat = 5;
    private String color = "blue";

    public Fan(){
    }

    /*public Fan(double banKinhQuat, int SLOW, int MEDIUM, int FAST, boolean on, String color) {
        this.banKinhQuat = banKinhQuat;
        this.SLOW = SLOW;
        this.MEDIUM = MEDIUM;
        this.FAST = FAST;
        this.on = on;
        this.color = color;
    }*/

    // speed
    public int getSpeed () {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    // on
    public boolean isOn () {
        return on;
    }
    public void setOn (boolean on) {
        this.on = on;
    }
    // banKinhQuat
    public double getBanKinhQuat () {
        return banKinhQuat;
    }
    public void setBanKinhQuat (double banKinhQuat) {
        this.banKinhQuat = banKinhQuat;
    }
    // color
    public String getColor () {
        return color;
    }
    public void setColor (String color) {
        this.color = color;
    }
    // toString
    public String toString() {
        if (on){
            return  "Quạt đang bật:" +
                    "\n- tốc độ quạt: " + speed +
                    "\n- màu sắc đèn led: " + color +
                    "\n- bán kính quạt: " + banKinhQuat;

        }
        else
            return  "Quạt đang tắt:" +
                    "\n- tốc độ quạt: " + speed +
                    "\n- màu sắc đèn led: " + color +
                    "\n- bán kính quạt: " + banKinhQuat;
    }
}
