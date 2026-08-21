public class NgaySinh {
    private int ngay;
    private int thang;
    private int nam;

    //Constructor
    public NgaySinh(int n, int m, int y){
        //Ktra ngay
        if (n > 0 && n <= 31){
            this.ngay = n;
        }else{
            this.ngay = 1;
        }
        //Kiem tra thang
        if (m > 0 && m <= 12){
            this.thang = m;
        }else{
            this.thang = 1;
        }

        //Ktra nam
        if (y > 0){
            this.nam = y;
        }else{
            this.nam = 1;
        }
    }

    //Get, Set
    public int getNgay(){
        return this.ngay;
    }
    public void setNgay(int n){
        if (n > 0 && n <= 31){
            this.ngay = n;
        }else{
            this.ngay = 1;
        }
    }

    public int getThang(){
        return this.thang;
    }
    public void setThang(int m){
        if (m > 0 && m <= 12){
            this.thang = m;
        }else{
            this.thang = 1;
        }
    }

    public int getNam(){
        return this.nam;
    }
    public void setNam(int y){
        if (y > 0){
            this.nam = y;
        }else{
            this.nam = 1;
        }
    }
}
