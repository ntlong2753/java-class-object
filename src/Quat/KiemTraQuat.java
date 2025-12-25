package Quat;

public class KiemTraQuat {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(1);
        fan1.setBanKinhQuat(10);
        fan1.setColor("vàng");
        fan1.setOn(true);
        System.out.println(fan1);

        Fan fan2 = new Fan();
        fan1.setSpeed(2);
        fan1.setBanKinhQuat(5);
        fan1.setColor("xanh");
        fan1.setOn(false);
        System.out.println(fan2);
    }
}
