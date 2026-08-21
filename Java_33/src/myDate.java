public class myDate {
    private int day;
    private int month;
    private int year;
    public myDate (int day, int month, int year){
        if (day > 0 && day <= 31){
            this.day = day;
        }else{
            this.day = 1;
        }

        if (month > 0 && month <= 12){
            this.month = month;
        }else{
            this.month = 1;
        }

        if (year > 0) {
            this.year = year;
        }else{
            this.year = 1;
        }
    }

    public int getDay(){
        return this.day;
    }
    public void setDay(int day){
        if (day > 0 && day <= 31){
            this.day = day;
        }else{
            this.day = 1;
        }
    }

    public int getMonth(){
        return this.month;
    }
    public void setMonth(int month){
        if (month > 0 && month <= 12){
            this.month = month;
        }else{
            this.month = 1;
        }
    }

    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        if (year > 0) {
            this.year = year;
        }else{
            this.year = 1;
        }
    }

    @Override
    public String toString(){
        return this.day + "/" + this.month + "/" + this.year;
    }
}
