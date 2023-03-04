package org.example.Seminar6;

public class Notebook {


    Integer id;
    String brand;
    Integer ram; // оперативная память 16, 32, 64
    Integer price;
    Integer discount;
    String colour;
    @Override
    public String toString() {
        return "Notebook{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                ", discount=" + discount +
                ", colour='" + colour + '\'' +
                '}';
    }

    public Notebook() {
    }

    public Notebook(Integer id, String brand, Integer ram, Integer price, Integer discount, String colour) {
        this.id = id;
        this.brand = brand;
        this.ram = ram;
        this.price = price;
        this.discount = discount;
        this.colour = colour;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
