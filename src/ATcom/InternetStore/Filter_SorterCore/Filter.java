package ATcom.InternetStore.Filter_SorterCore;

import ATcom.InternetStore.DataBaseCore.Laptop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Gwindblaid on 05.06.2016.
 */
public class Filter {

    public static void filter(List dataBase, Criterions criterion, int value) {
        List<Laptop> laptops = new ArrayList<>();

        if (criterion == Criterions.COMPANY) {
            Collections.sort(dataBase, lComparatorByCompany);
        } else if (criterion == Criterions.CPU) {
            Collections.sort(dataBase, lComparatorByCPU);
        } else if (criterion == Criterions.PRICE) {
            Collections.sort(dataBase, lComparatorByPrice);
        } else  if (criterion == Criterions.RAM) {
            Collections.sort(dataBase, lComparatorByRAM);
        } else if (criterion == Criterions.HDD) {
            Collections.sort(dataBase,lComparatorByHDD);
        } else if (criterion == Criterions.OS) {
            Collections.sort(dataBase, lComparatorByOS);
        } else if (criterion == Criterions.BATTERY) {
            Collections.sort(dataBase, lComparatorByBattery);
        } else  if (criterion == Criterions.OPTICAL_DRIVE) {
            Collections.sort(dataBase, lComparatorByOpticalDrive);
        } else if (criterion == Criterions.GRAPHIC_CARD) {
            Collections.sort(dataBase, lComparatorByGraphicCard);
        }
    }

    public static void filter(List dataBase, Criterions criterion, String value) {
        if (criterion == Criterions.COMPANY) {
            Collections.sort(dataBase, lComparatorByCompany);
        } else if (criterion == Criterions.CPU) {
            Collections.sort(dataBase, lComparatorByCPU);
        } else if (criterion == Criterions.PRICE) {
            Collections.sort(dataBase, lComparatorByPrice);
        } else  if (criterion == Criterions.RAM) {
            Collections.sort(dataBase, lComparatorByRAM);
        } else if (criterion == Criterions.HDD) {
            Collections.sort(dataBase,lComparatorByHDD);
        } else if (criterion == Criterions.OS) {
            Collections.sort(dataBase, lComparatorByOS);
        } else if (criterion == Criterions.BATTERY) {
            Collections.sort(dataBase, lComparatorByBattery);
        } else  if (criterion == Criterions.OPTICAL_DRIVE) {
            Collections.sort(dataBase, lComparatorByOpticalDrive);
        } else if (criterion == Criterions.GRAPHIC_CARD) {
            Collections.sort(dataBase, lComparatorByGraphicCard);
        }
    }
}
