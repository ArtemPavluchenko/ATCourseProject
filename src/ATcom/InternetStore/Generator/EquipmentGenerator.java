package ATcom.InternetStore.Generator;

import ATcom.InternetStore.DataBaseCore.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gwindblaid on 03.06.2016.
 */

public class EquipmentGenerator {

    public List<Laptop> createLaptopsDB(int numOfLaptops) {
        List<Laptop> data = new ArrayList<>();
        LaptopGenerator gen = new LaptopGenerator();

        for (int i=0; i < numOfLaptops; i++) {
            Laptop obj1 = new Laptop();
            obj1.setId(gen.generateId());
            obj1.setPrice(gen.generatePrice());
            obj1.setManufacturedCompany(gen.generateManufacturedCompany());
            obj1.setOS(gen.generateOS());
            obj1.setProcessor(gen.generateProcessor());
            obj1.setRam(gen.generateRam());
            obj1.setHdd(gen.generateHdd());
            obj1.setBattery(gen.generateBattery());
            obj1.setOpticalDrive(gen.generateOpticalDrive());
            obj1.setGraphicCard(gen.generateGraphicCard());

            data.add(obj1);
        }
        return data;
    }

    public List<Smartphone> greateSmartphonesDB(int numOfSmartphones) {
        List<Smartphone> data = new ArrayList<>();
        SmartphoneGenerator gen1 = new SmartphoneGenerator();

        for (int i=0; i < numOfSmartphones; i++) {
            Smartphone obj1 = new Smartphone();
            obj1.setId(gen1.generateId());
            obj1.setPrice(gen1.generatePrice());
            obj1.setManufacturedCompany(gen1.generateManufacturedCompany());
            obj1.setOS(gen1.generateOS());
            obj1.setProcessor(gen1.generateProcessor());
            obj1.setRam(gen1.generateRam());
            obj1.setHdd(gen1.generateHdd());
            obj1.setBattery(gen1.generateBattery());
            obj1.setCamera(gen1.generateCamera());
            obj1.setNumOfSIM(gen1.generateNumOfSIM());

            data.add(obj1);
        }
        return data;
    }
}
