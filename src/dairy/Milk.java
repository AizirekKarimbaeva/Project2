package dairy;

import java.time.LocalDate;

public class Milk extends DairyProduct {

    public Milk(String name, int id, String companyProduction,  LocalDate date) {
        super(name, id, companyProduction,  date);
    }

    @Override
    public String toString() {
        return "Milk: "+getName()+"\t"+getId()+"\t"+getCompanyProduction()+"\t"+
                "\t"+getDate();
    }
}
