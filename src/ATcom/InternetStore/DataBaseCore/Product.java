package ATcom.InternetStore.DataBaseCore;

import java.io.Serializable;

/**
 * Created by Gwindblaid on 03.06.2016.
 */

public abstract class Product implements Serializable {
    private static final long serialVersionUID = 1234567890L;
    protected int id;
    protected int price;

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

abstract class ComputerEquipment extends Product {
    protected String manufacturedCompany;
    protected String processor;
    protected String OS;
    protected int ram;
    protected int hdd;

}

abstract class PortableEquipment extends ComputerEquipment {
    protected int battery;
}
