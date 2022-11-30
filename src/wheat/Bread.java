package wheat;

import java.time.LocalDate;

public class Bread extends WheatProduct{

    public Bread(String name, int id, String companyProduction,  LocalDate date) {
        super(name, id, companyProduction, date);
    }

    @Override
    public String toString() {
        return "Bread: "+getName()+"\t"+getId()+"\t"+getCompanyProduction()+
                "\t"+getDate();
    }
}
