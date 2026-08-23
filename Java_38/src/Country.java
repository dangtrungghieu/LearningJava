public class Country {
    private String idCountry;
    private String nameCountry;

    //Constructor
    public Country(String idCountry, String nameCountry) {
        if(idCountry.trim().length() > 0){
            this.idCountry = idCountry;
        }else {
            this.idCountry = "N/A";
        }

        if (nameCountry.trim().length() > 0){
            this.nameCountry = nameCountry;
        }else {
            this.nameCountry = "N/A";
        }
    }

    //Get, Set
    public String getIdCountry() {
        return this.idCountry;
    }
    public void setIdCountry(String idCountry) {
        if(idCountry.trim().length() > 0){
            this.idCountry = idCountry;
        }else {
            this.idCountry = "N/A";
        }
    }

    public String getNameCountry() {
        return this.nameCountry;
    }
    public void setNameCountry(String nameCountry) {
        if(nameCountry.trim().length() > 0){
            this.nameCountry = nameCountry;
        }else  {
            this.nameCountry = "N/A";
        }
    }
}
