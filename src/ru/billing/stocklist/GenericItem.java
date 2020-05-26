package ru.billing.stocklist;
import ru.billing.stocklist.Category;

public class GenericItem implements Cloneable {

    private String name;
    private float price;
    private GenericItem analog;
    private Category category = Category.GENERAL;

    static int currentID = 0;

    public GenericItem(String name, float price, Category category){
        this.name = name;
        this.price = price;
        this.category = category;
        this.ID = GenericItem.currentID++;
    }
    public GenericItem(String name, float price, GenericItem analog){
        this.name = name;
        this.price = price;
        setAnalog(analog);
        this.ID = GenericItem.currentID++;
    }

    public GenericItem(){
        this.ID = GenericItem.currentID++;
    }



    void printAll() {
        System.out.println("ID: "+ID+" , name: "+name+" , price: "+price+" , category: "+category);
    }


    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected GenericItem clone() throws CloneNotSupportedException {
        GenericItem item = (GenericItem)super.clone();
        return item;
    }


    public Object analogClone() throws CloneNotSupportedException {
        return this.analog.clone();
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + this.ID;
    }


    public Integer getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setAnalog(GenericItem analog) {
        this.analog =  analog;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    private int ID;

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public GenericItem getAnalog() {
        return analog;
    }

    public Category getCategory() {
        return category;
    }

}




