package ru.billing.stocklist;
public class TechicalItem extends GenericItem {

    private short warrantyTime; // гарантийный срок (суток)

    public TechicalItem() {
        super();
    }

    @Override
    void printAll() {
        System.out.println("ID: "+getID()+" , name: "+getName()+" , price: "+getPrice()+" , category: "+getCategory()+" , warrantyTime: "+warrantyTime);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }


    public short getWarrantyTime() {
        return warrantyTime;
    }

    public void setWarrantyTime(short warrantyTime) {
        this.warrantyTime = warrantyTime;
    }


}
