package ru.billing.stocklist;
import java.util.Date;

public class FoodItem extends GenericItem {
    private Date dateOfIncome; // дата производства
    private short expires; // срок годности

    public FoodItem(String name, float price, FoodItem analog, Date date, short expires){
        this(name, price, expires);
        //this.analog = analog;
        this.dateOfIncome = date;
        setAnalog(analog);

    }

    public FoodItem(String name, float price, short expires){
        this(name);
        this.expires = expires;
        //this.price = price;
        setPrice(price);
    }

    public FoodItem(String name){
        super();
        //this.name = name;
        setName(name);
    }

    @Override
    void printAll() {
        System.out.println("ID: "+getID()+" , name: "+getName()+" , price: "+getPrice()+" , category: "+getCategory()+" , dateofIncome: "+dateOfIncome+" , expires: "+expires);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    public Date getDateOfIncome() {
        return dateOfIncome;
    }

    public void setDateOfIncome(Date dateOfIncome) {
        this.dateOfIncome = dateOfIncome;
    }

    public short getExpires() {
        return expires;
    }

    public void setExpires(short expires) {
        this.expires = expires;
    }
}
