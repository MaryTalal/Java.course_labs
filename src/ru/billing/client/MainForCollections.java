/*package ru.billing.client;

import ru.billing.client.CatalogLoader;
import ru.billing.client.CatalogStubLoader;
import ru.billing.stocklist.GenericItem;
import ru.billing.stocklist.ItemCatalog;

public class MainForCollections {

    public static void main(String[] args){

        GenericItem item1 = new GenericItem();
        GenericItem item2 = new GenericItem();
        GenericItem item3 = new GenericItem();
        GenericItem item4 = new GenericItem();
        GenericItem item5 = new GenericItem();
        GenericItem item6 = new GenericItem();
        GenericItem item7 = new GenericItem();
        GenericItem item8 = new GenericItem();
        GenericItem item9 = new GenericItem();
        GenericItem item10 = new GenericItem();

        ItemCatalog itemCatalog = new ItemCatalog();

        itemCatalog.addItem(item1);
        itemCatalog.addItem(item2);
        itemCatalog.addItem(item3);
        itemCatalog.addItem(item4);
        itemCatalog.addItem(item5);
        itemCatalog.addItem(item6);
        itemCatalog.addItem(item7);
        itemCatalog.addItem(item8);
        itemCatalog.addItem(item9);
        itemCatalog.addItem(item10);


        long begin = new java.util.Date().getTime();
        for (int i = 0; i < 100000;i++) {
            itemCatalog.findItemByID(10);
        }
        long end = new java.util.Date().getTime();
        System.out.println("In HashMap: "+(end - begin));

        begin = new java.util.Date().getTime();
        for (int i = 0; i < 100000;i++) {
            itemCatalog.findItemByIDAL(10);
        }
        end = new java.util.Date().getTime();
        System.out.println("In ArrayList: "+(end - begin));

        CatalogLoader loader = new CatalogStubLoader();
        loader.load(itemCatalog);

    }
}
*/