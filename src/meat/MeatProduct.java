package meat;

import shop.Product;

import java.time.LocalDate;

public abstract class MeatProduct extends Product {

    public MeatProduct(String name, int id, String companyProduction, LocalDate date) {
        super(name, id, companyProduction,  date);
    }

    @Override
    public String toString() {
        return "MeatProduct: "+getName()+"\t"+getId()+"\t"+getCompanyProduction()+"\t"+getDate();
    }
}
