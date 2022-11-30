package wheat;

import java.time.LocalDate;

public class Flour extends WheatProduct{
    public Flour(String name, int id, String companyProduction, LocalDate date) {
        super(name, id, companyProduction,  date);
    }

    @Override
    public String toString() {
        return "Flour: "+getName()+"\t"+getId()+"\t"+getCompanyProduction()+
                "\t"+getDate();
    }
}
