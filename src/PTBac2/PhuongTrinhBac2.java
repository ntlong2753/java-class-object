package PTBac2;

public class PhuongTrinhBac2 {

    // khai báo a b c
    private int a, b, c;

    // constructor không tham số
    public PhuongTrinhBac2() {}

    // constructor có tham số
    public PhuongTrinhBac2(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // tính phương trình bậc 2
    public double delta(){
        return ( Math.pow (b,2) - (4 * a * c) );
    }
    public String nghiemKep(){
        return "x1 = x2 = " + ( -b / (2 * a) );
    }
    public String nghiem1(){
        return "x1 = " + ( (-b + Math.sqrt (delta()) ) / (2 * a) );
    }
    public String nghiem2(){
        return "x2 = " + ( (-b - Math.sqrt (delta()) ) / (2 * a) );
    }
    // kiểm tra điều kiện
    public String kiemTra(){
        if (a == 0){
            if (b == 0){
                return "x = " + (-c / b);
            }
            else{
                if(c == 0){
                    return "Phương trình vô số nghiệm";
                }
                else{
                    return "Phương trình vô nghiệm";
                }
            }
        }
        else {
            if (delta() == 0){
                return "Phương trình có nghiệm kép" + nghiemKep();
            }
            else if (delta() > 0){
                return "Phương trình có 2 nghiệm phân biệt: "
                                    + nghiem1() + nghiem2();
            }
            else
                return "Phương trình vô nghiệm";
        }
    }
}
