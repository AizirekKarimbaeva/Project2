package wheat;

import java.time.LocalDate;

public class Pasta extends WheatProduct {

    public Pasta(String name, int id, String companyProduction,  LocalDate date) {
        super(name, id, companyProduction, date);
    }

    @Override
    public String toString() {
        return "Pasta: "+getName()+"\t"+getId()+"\t"+getCompanyProduction()+
                "\t"+getDate();
    }
}
