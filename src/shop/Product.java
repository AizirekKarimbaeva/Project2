package shop;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Product {
    private String name;
    private int id;
    private String companyProduction;
    private LocalDate date;

    public Product(String name, int id, String companyProduction, LocalDate date) {
        this.name = name;
        this.id = id;
        this.companyProduction = companyProduction;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyProduction() {
        return companyProduction;
    }

    public void setCompanyProduction(String companyProduction) {
        this.companyProduction = companyProduction;
    }


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Objects.equals(name, product.name) && Objects.equals(companyProduction, product.companyProduction) && Objects.equals(date, product.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, companyProduction, date);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", companyProduction='" + companyProduction + '\'' +
                ", date=" + date +
                '}';
    }

}
