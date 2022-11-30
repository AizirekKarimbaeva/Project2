package meat;

import java.time.LocalDate;

public class Meat extends MeatProduct {
    public Meat(String name, int id, String companyProduction,  LocalDate date) {
        super(name, id, companyProduction,  date);
    }

    @Override
    public String toString() {
        return "Chicken: "+getName()+"\t"+getId()+"\t"+getCompanyProduction()+
                "\t"+getDate();
    }
}
