package ATcom.InternetStore;

import ATcom.InternetStore.DataBaseCore.Laptop;
import ATcom.InternetStore.DataBaseCore.Product;
import ATcom.InternetStore.Generator.EquipmentGenerator;
import ATcom.InternetStore.Filter_SorterCore.Sorter;
import ATcom.InternetStore.Filter_SorterCore.Criterions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void print(List<Laptop> dataBase) {
        for (Product product : dataBase) {
            System.out.println(product.toString());
        }
    }

    public static void main(String[] args) {
        EquipmentGenerator generator = new EquipmentGenerator();


        List<Laptop> dataBase = new ArrayList<Laptop>();
        dataBase = generator.createLaptopsDB(5);
        print(dataBase);

        System.out.println("//////////////////////////////////////////////////////////////");
        Sorter.laptopSort(dataBase, Criterions.COMPANY);
        Collections.reverse(dataBase);
        print(dataBase);


    }
}
