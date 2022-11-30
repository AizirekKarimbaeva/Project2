package dairy;

import java.time.LocalDate;

public class Yogurt extends DairyProduct {

    public Yogurt(String name, int id, String companyProduction, LocalDate date) {
        super(name, id, companyProduction,  date);
    }

    @Override
    public String toString() {
        return "Yogurt: "+getName()+"\t"+getId()+"\t"+getCompanyProduction()+
                "\t"+getDate();
    }
}
