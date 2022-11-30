package dairy;

import java.time.LocalDate;

public class Kefir extends DairyProduct{

    public Kefir(String name, int id, String companyProduction,  LocalDate date) {
        super(name, id, companyProduction,  date);
    }

    @Override
    public String toString() {
        return "Kefir: "+getName()+"\t"+getId()+"\t"+getCompanyProduction()+
                "\t"+getDate();
    }
}
