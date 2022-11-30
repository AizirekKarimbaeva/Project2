package meat;

import java.time.LocalDate;
public class Fish extends MeatProduct {
    public Fish(String name, int id, String companyProduction,  LocalDate date) {
        super(name, id, companyProduction,  date);
    }

    @Override
    public String toString() {
        return "Fish: "+getName()+"\t"+getId()+"\t"+getCompanyProduction()+
                "\t"+getDate();
    }
}
