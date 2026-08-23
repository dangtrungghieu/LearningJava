public class ProductionDate {
    private int day, month, year;
    //Constructor
    public ProductionDate(int day, int month, int year) {
        if(day >= 1 && day <= 31){
            this.day = day;
        }else  {
            this.day = 1;
        }
        if(month >= 1 && month <= 12){
            this.month = month;
        }else   {
            this.month = 1;
        }
        if(year >= 1900 && year <= 2026){
            this.year = year;
        }else {
            this.year = 1900;
        }
    }

    //Get, Set
    public int getDay() {
        return this.day;
    }
    public void setDay(int day) {
        if(day >= 1 && day <= 31){
            this.day = day;
        }else  {
            this.day = 1;
        }
    }

    public int getMonth(){
        return this.month;
    }
    public void setMonth(int month) {
        if(month >= 1 && month <= 12){
            this.month = month;
        }else   {
            this.month = 1;
        }
    }

    public int getYear(){
        return this.year;
    }
    public void setYear(int year) {
        if(year >= 1900 && year <= 2026){
            this.year = year;
        }else  {
            this.year = 1900;
        }
    }
}
