package wheat;

import shop.Product;

import java.time.LocalDate;

public abstract class WheatProduct extends Product {
    public WheatProduct(String name, int id, String companyProduction,  LocalDate date) {
        super(name, id, companyProduction,  date);
    }

    @Override
    public String toString() {
        return "WheatProduct: "+getName()+"\t"+getId()+"\t"+getCompanyProduction()+
                "\t"+getDate();
    }
}
