package HCN;

public class HinhChuNhat {

    // khai báo
    private double chieuRong;
    private double chieuDai;

    // tạo constructor không tham số
    public HinhChuNhat() {}

    // constructor có tham số
    public HinhChuNhat(double _chieuDai, double _chieuRong) {
        this.chieuRong = _chieuRong;
        this.chieuDai = _chieuDai;
    }

    // hàm tính diện tích
    public double getDienTich() {
        return this.chieuRong * this.chieuDai;
    }

    // hàm tính chu vi
    public double getChuVi(){
        return (this.chieuRong + this.chieuDai) / 2;
    }

    // hàm hiển thị kết quả
    public void hienThi(){

        // hiển thị chiều dài, chiều rộng
        System.out.println ( "Hình chữ nhật có chiều dài = "
                            + this.chieuDai +
                            "; chiều rộng = " + this.chieuRong);

        // hiện thị diện tích
        System.out.println ( "Diện tích hình chữ nhật = "
                            + this.getDienTich());

        // hiển thị chu vi
        System.out.println ( "Chu vi hình chữ nhật là = "
                            + this.getChuVi());
    }
}
