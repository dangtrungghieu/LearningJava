public class DateOfBirth {
    private int day, month, year;


    //Constructor
    public DateOfBirth(int day, int month, int year) {
        if (day >= 0 && day <= 31){
            this.day = day;
        }else {
            this.day = 1;
        }

        if (month >= 1 && month <= 12){
            this.month = month;
        }else  {
            this.month = 1;
        }

        if (year >= 1900 && year <= 2020){
            this.year = year;
        }else  {
            this.year = 1900;
        }
    }

    //Get, Set
    public int getDay() {
        return this.day;
    }
    public void setDay(int day) {
        if (day >= 0 && day <= 31){
            this.day = day;
        }else {
            this.day = 1;
        }
    }

    public int getMonth() {
        return this.month;
    }
    public void setMonth(int month) {
        if (month >= 1 && month <= 12){
            this.month = month;
        }else {
            this.month = 1;
        }
    }

    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        if (year >= 1900 && year <= 2020){
            this.year = year;
        }else  {
            this.year = 1900;
        }
    }

    @Override
    public boolean equals(Object obj) {
        //So sanh dia chi tro toi
        if (this == obj) {
            return true;
        }
        //So sanh null va khac lop
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        //So sanh tung thuoc tinh
        DateOfBirth other = (DateOfBirth) obj;
        if (this.day !=  other.day) {
            return false;
        }
        if (this.month != other.month) {
            return false;
        }
        if (this.year != other.year) {
            return false;
        }

        return true;
    }

}
