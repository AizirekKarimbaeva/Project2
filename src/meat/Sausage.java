package meat;

import java.time.LocalDate;
public class Sausage extends MeatProduct {
    public Sausage(String name, int id, String companyProduction, LocalDate date) {
        super(name, id, companyProduction, date);
    }

    @Override
    public String toString() {
        return "Sausage: "+getName()+"\t"+getId()+"\t"+getCompanyProduction()+"\t"+getDate();
    }
}
