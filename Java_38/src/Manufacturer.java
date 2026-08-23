public class Manufacturer {
    private String manufacturerName;
    private Country country;

    //Constructor
    public Manufacturer(String manufacturerName, Country country) {
        if(manufacturerName.trim().length() > 0){
            this.manufacturerName = manufacturerName;
        }else {
            this.manufacturerName = "N/A";
        }
        this.country = country;
    }

    //Get, Set
    public String getManufacturerName() {
        return this.manufacturerName;
    }
    public void setManufacturerName(String manufacturerName) {
        if(manufacturerName.trim().length() > 0){
            this.manufacturerName = manufacturerName;
        }else {
            this.manufacturerName = "N/A";
        }
    }

    public Country getCountry() {
        return this.country;
    }
    public void setCountry(Country country) {
        this.country = country;
    }

    //Yeu cau 3
    public String printCountry(){
        return this.country.getNameCountry();
    }
}
