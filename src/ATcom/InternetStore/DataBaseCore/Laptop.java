package ATcom.InternetStore.DataBaseCore;

/**
 * Created by Gwindblaid on 03.06.2016.
 */
public class Laptop extends PortableEquipment {
    protected boolean opticalDrive;
    protected String graphicCard;

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

    public void setOpticalDrive(boolean opticalDrive) {
        this.opticalDrive = opticalDrive;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
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

    public boolean getOpticalDrive() {
        return opticalDrive;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    @Override
    public String toString() {
        return "Id " + id + "\n" +
                "Price: " + price + " UAH\n" +
                "Manufactured company: " + manufacturedCompany + "\n" +
                "OS: " + OS + "\n" +
                "Processor inside: " + processor + "\n" +
                "RAM: " + ram + "\n" +
                "HDD: " + hdd + "\n" +
                "Battery: " + battery + " mAh" + "\n" +
                "Optical drive: " + opticalDrive + "\n" +
                "Graphic card: " + graphicCard + "\n";
    }

}
