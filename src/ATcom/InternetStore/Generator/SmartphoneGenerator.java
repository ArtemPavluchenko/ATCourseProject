package ATcom.InternetStore.Generator;

/**
 * Created by Gwindblaid on 03.06.2016.
 */
public class SmartphoneGenerator implements GeneratorSmartphone {
    private String[] smartphoneManufacturer = {"Samsung Electronics", "Apple", "Huawei", "Lenovo", "LG", "Xiaomi",
            "BBK", "TCL", "Oppo", "ZTE", "Sony", "Microsoft", "Meizu", "Coolpad"};
    private String[] cpuNames = {"Mediatech", "Qualcom", "Exynos", "ARM", "Apple Ax", "Intel"};
    private String[] smartphonesName = {"qI7O4semQ3", "PjRjgm133U", "Fs3dCnK9Y7", "5BKKTFV0yn", "b0RDDC5RKA", "y6y7xkzmkt",
            "cp8yKJAqq1", "RhClVxE7lz", "93d84SFuqi", "Fk5sQrwdRO", "FzuAvuz2WJ", "OfqLulamKZ", "P1kS0AIUUw",
            "8HpcEX8k7B", "AMi4Vpdu79", "89hQC4o6R4", "xnxC62tUpA", "k2JHjjX99N", "vithOyV5tY", "GEueBOQwrn",
            "AmgMGa9Aeo", "lF1p93Gzty", "G1Q3UxMG1r", "kT2DxnuXyo", "2bzflHslwU", "sV88pYRaLd", "bckxafPt8m",
            "zmOvUActIg", "zKGW6Pm4qp", "rOpYWtzQNM", "b35IBjePbs", "u75UEQF396", "lm3KIbbz9f", "4JkWSjde6h",
            "uU9R9FGrye", "JKhbzMqM6B", "ABeJtQIENd", "YpgtqVnkRy", "liPWly8OGe", "wyIZA0DCbo", "j1BMfFlAo",
            "Q9m7wAvWwb", "ai7IqBeL9n", "2ar2TJr1V3", "F00TYbyrGl", "LEBNqIfOQn", "Xw86iyzpIA"};
    private String[] oSNames = {"Windows", "Android", "iOS"};

    @Override
    public String generateOS() {
        String OS = oSNames[(int)(Math.random()*oSNames.length)];
        return OS;
    }

    @Override
    public boolean generateCamera() {
        return true;
    }

    @Override
    public int generateNumOfSIM() {
        int sim = (int)(Math.random()*2)+1;
        return sim;
    }

    @Override
    public int generateBattery() {
        int bat = (int)(Math.random()*13)+18;
        int capacity = bat*100;

        return capacity;
    }

    @Override
    public String generateName() {
        String laptopName = smartphonesName[(int)(Math.random()*smartphonesName.length)];
        return laptopName;
    }

    @Override
    public String generateManufacturedCompany() {
        String manufacturer = smartphoneManufacturer[(int)(Math.random()*smartphoneManufacturer.length)];
        return manufacturer;
    }

    @Override
    public String generateProcessor() {
        String cpu = cpuNames[(int)(Math.random()*cpuNames.length)];
        return cpu;
    }

    @Override
    public int generateRam() {
        int frequency = (int)(Math.random()*3)+1;
        return frequency;
    }

    @Override
    public int generateHdd() {
        int hdd = (int)(Math.random()*5)+4;
        int hDD = hdd * 10;
        return hDD;
    }

    @Override
    public boolean generateWifi() {
        return true;
    }

    @Override
    public int generatePrice() {
        int num = (int)(Math.random()*4000)+6000;
        return num;
    }

    @Override
    public int generateId() {
        return (int)(Math.random()*900000)+999999;
    }
}


