public class myDate {
    private int day;
    private int month;
    private int year;
    public myDate(int day, int month, int year){
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

    // So sanh Equals
    @Override
    public boolean equals(Object obj){
        //So sanh dia chi
        if (this == obj){
            return true;
        }
        //Kiem tra null
        if (obj == null){
            return false;
        }
        //So sanh Class
        if (this.getClass() != obj.getClass()){
            return false;
        }
        //So sanh tung thong so
        myDate other = (myDate) obj;
        if (this.day != other.day){
            return false;
        }
        if (this.month != other.month){
            return false;
        }
        if (this.year != other.year){
            return false;
        }
        return true;
    }
}
