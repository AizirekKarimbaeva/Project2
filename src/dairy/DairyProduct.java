package dairy;

import shop.Product;
import java.time.LocalDate;

public abstract class DairyProduct extends Product {

    public DairyProduct(String name, int id, String companyProduction,  LocalDate date) {
        super(name, id, companyProduction, date);
    }

    @Override
    public String toString() {
        return "DairyProduct: "+getName()+"\t"+getId()+"\t"+getCompanyProduction()+
                "\t"+getDate();
    }
}
