public class Main {
    public static void main(String[] args){
        Country country1 = new Country("VN", "Viet Nam");
        Country country2 = new Country("JP", "Nhat Ban");
        Country country3 = new Country("NZ", "Nepal");

        Manufacturer manufacturer1 = new Manufacturer("FPT", country1);
        Manufacturer manufacturer2 = new Manufacturer("Toshiba", country2);
        Manufacturer manufacturer3 = new Manufacturer("LG", country3);

        ProductionDate productionDate1 = new ProductionDate(12,11,1999);
        ProductionDate productionDate2 = new ProductionDate(20,9,2000);
        ProductionDate productionDate3 = new ProductionDate(5,8,1998);

        Computer computer1 = new Computer(manufacturer1, productionDate1, 20000000, 36);
        Computer computer2 = new Computer(manufacturer2, productionDate2, 25000000, 24);
        Computer computer3 = new Computer(manufacturer3, productionDate3, 19000000, 12);

        //Yeu cau 1
        System.out.println(computer1.checkLowerPrice(computer2));
        System.out.println(computer1.checkLowerPrice(computer3));

        //Yeu cau 2
        computer1.printCountry();
        computer2.printCountry();
        computer3.printCountry();

    }
}
