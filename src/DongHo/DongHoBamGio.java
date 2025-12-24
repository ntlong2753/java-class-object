package DongHo;

public class DongHoBamGio {
    private long thoiGianBatDau;
    private long thoiGianKetThuc;

    public DongHoBamGio(){
    }

    public DongHoBamGio(long thoiGianBatDau, long thoiGianKetThuc) {
        this.thoiGianBatDau = thoiGianBatDau;
        this.thoiGianKetThuc = thoiGianKetThuc;
    }
    public void BatDau(){
        this.thoiGianBatDau = System.currentTimeMillis();
    }
    public void KetThuc(){
        this.thoiGianKetThuc = System.currentTimeMillis();
    }
    public long getThoiGianBatDau() {
        return thoiGianBatDau;
    }
    public long getThoiGianKetThuc() {
        return thoiGianKetThuc;
    }
    public long getThoiGianTroiQua(){
        return thoiGianKetThuc - thoiGianBatDau;
    }
}
