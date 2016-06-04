package ATcom.InternetStore.DataBaseCore;

/**
 * Created by Gwindblaid on 03.06.2016.
 */
public class Smartphone extends PortableEquipment{
    protected boolean camera;
    protected int numOfSIM;

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void setManufacturedCompany(String manufacturedCompany) {
        this.manufacturedCompany = manufacturedCompany;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void setCamera(boolean camera) {
        this.camera = camera;
    }

    public void setNumOfSIM(int numOfSim) {
        this.numOfSIM = numOfSim;
    }

    public int getID() {
        return id;
    }

    public String getManufacturedCompany() {
        return manufacturedCompany;
    }

    public int getPrice() {
        return price;
    }

    public String getProcessor() {
        return processor;
    }

    public String getOS() {
        return OS;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public int getBarrety() {
        return battery;
    }

    public boolean getCamera() {
        return camera;
    }

    public int getNumOfSIM() {
        return numOfSIM;
    }

    @Override
    public String toString() {
        return "Id "+id+"\n"+
                "Price: "+price+" UAH\n"+
                "Manufactured company: "+manufacturedCompany+"\n"+
                "OS: "+OS+"\n"+
                "Processor inside: "+processor+"\n"+
                "RAM: "+ram+"\n"+
                "HDD: "+hdd+"\n"+
                "Battery: "+battery+" mAh"+"\n"+
                "Camera: "+camera+"\n"+
                "Number of SIMcard: "+numOfSIM+"\n";
    }
}
