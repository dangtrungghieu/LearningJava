public class Computer {
    private Manufacturer manufacturer;
    private ProductionDate productionDate;
    private double price;
    private int warranty;

    //Constructor
    public Computer(Manufacturer manufacturer, ProductionDate productionDate, double price, int warranty) {
        this.manufacturer = manufacturer;
        this.productionDate = productionDate;
        if(price >= 0){
            this.price = price;
        }else {
            this.price = 0;
        }
        if(warranty >= 0){
            this.warranty = warranty;
        } else {
            this.warranty = 0;
        }
    }

    //Get, Set
    public Manufacturer getManufacturer() {
        return this.manufacturer;
    }
    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public ProductionDate getProductionDate() {
        return this.productionDate;
    }
    public void setProductionDate(ProductionDate productionDate) {
        this.productionDate = productionDate;
    }

    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        if(price >= 0){
            this.price = price;
        }else {
            this.price = 0;
        }
    }

    public int getWarranty() {
        return this.warranty;
    }
    public void setWarranty(int warranty) {
        if(warranty >= 0){
            this.warranty = warranty;
        } else {
            this.warranty = 0;
        }
    }

    //Yeu cau 1: Kiem tra gia thap hon
    public boolean checkLowerPrice(Computer computer){
        return this.price < computer.getPrice();
    }

    //Yeu cau 2: In ten quoc gia san xuat
    public void printCountry(){
        System.out.println("Quoc gia san xuat may tinh la: " + this.manufacturer.printCountry());
    }
}
