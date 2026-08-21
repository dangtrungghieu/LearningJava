public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        //Kiem tra ngoai le nhap truc tiep
        if (day < 1 || day > 31) {
            this.day = 1;
        }else {
            this.day = day;
        }
        if (month < 1 || month >12){
            this.month = 1;
        }else {
            this.month = month;
        }
        if (year < 0){
            this.year = 1;
        }else  {
            this.year = year;
        }
    }
    public int getDay(){
        return this.day;
    }
    public void setDay(int day){
        // kiem tra ngoai le khi thay doi
        if (day < 1 || day > 31) {
            this.day = 1;
        }else {
            this.day = day;
        }
    }

    public int getMonth(){
        return this.month;
    }
    public void setMonth(int month){
        if (month < 1 || month > 12){
            this.month = 1;
        }
        else{
            this.month = month;
        }
    }

    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        if (year < 1) {
            this.year = 1;
        }else {
            this.year = year;
        }
    }
}
