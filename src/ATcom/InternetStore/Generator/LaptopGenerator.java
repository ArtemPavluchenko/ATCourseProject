package ATcom.InternetStore.Generator;

/**
 * Created by Gwindblaid on 03.06.2016.
 */
public class LaptopGenerator implements GeneratorLaptop {
    private String[] videoCards = {"NVIDIA GeForce", "AMD Radeon", "ATI Mobility", "Intel Graphics"};
    private String[] manufacturedCompany = {
            "Acer", "Apple", "ASUS", "Dell", "Fujitsu", "Gateway", "HCL", "Hewlett-Packard", "Lenovo", "LG", "MSI",
            "Panasonic", "Samsung", "Sony", "Toshiba"};
    private String[] laptopsName = {"qI7O4semQ3", "PjRjgm133U", "Fs3dCnK9Y7", "5BKKTFV0yn", "b0RDDC5RKA", "y6y7xkzmkt",
            "cp8yKJAqq1", "RhClVxE7lz", "93d84SFuqi", "Fk5sQrwdRO", "FzuAvuz2WJ", "OfqLulamKZ", "P1kS0AIUUw",
            "8HpcEX8k7B", "AMi4Vpdu79", "89hQC4o6R4", "xnxC62tUpA", "k2JHjjX99N", "vithOyV5tY", "GEueBOQwrn",
            "AmgMGa9Aeo", "lF1p93Gzty", "G1Q3UxMG1r", "kT2DxnuXyo", "2bzflHslwU", "sV88pYRaLd", "bckxafPt8m",
            "zmOvUActIg", "zKGW6Pm4qp", "rOpYWtzQNM", "b35IBjePbs", "u75UEQF396", "lm3KIbbz9f", "4JkWSjde6h",
            "uU9R9FGrye", "JKhbzMqM6B", "ABeJtQIENd", "YpgtqVnkRy", "liPWly8OGe", "wyIZA0DCbo", "j1BMfFlAo",
            "Q9m7wAvWwb", "ai7IqBeL9n", "2ar2TJr1V3", "F00TYbyrGl", "LEBNqIfOQn", "Xw86iyzpIA"};
    private String[] cpuNames = {"Intel", "AMD", "IBM"};
    private String[] oSNames = {"Windows", "Linux", "Mac"};


    @Override
    public String generateOS() {
        String OS = oSNames[(int)(Math.random()*oSNames.length)];
        return OS;
    }

    @Override
    public boolean generateOpticalDrive() {
        int i  = (int)(Math.random()*2);
        if (i == 0){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String generateGraphicCard() {
        String videoCard = videoCards[(int)(Math.random()*videoCards.length)];
        return videoCard;
    }

    @Override
    public int generateBattery() {
        int bat = (int)(Math.random()*20)+25;
        int capacity = bat*100;
        return capacity;
    }

    @Override
    public String generateName() {
        String laptopName = laptopsName[(int)(Math.random()*laptopsName.length)];
        return laptopName;
    }

    @Override
    public String generateManufacturedCompany() {
        String company = manufacturedCompany[(int)(Math.random()*manufacturedCompany.length)];
        return company;
    }

    @Override
    public String generateProcessor() {
        String cpu = cpuNames[(int)(Math.random()*cpuNames.length)];
        return cpu;
    }

    @Override
    public int generateRam() {
        int frequency = (int)(Math.random()*4)+4;
        return frequency;
    }

    @Override
    public int generateHdd() {
        int hdd = (int)(Math.random()*5)+4;
        int hDD = hdd * 100;
        return hDD;
    }

    @Override
    public boolean generateWifi() {
        return true;
    }

    @Override
    public int generatePrice() {
        int num = (int)(Math.random()*10000)+10000;
        return num;
    }

    @Override
    public int generateId() {
        return (int)(Math.random()*900000)+999999;
    }
}