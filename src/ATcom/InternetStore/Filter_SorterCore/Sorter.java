package ATcom.InternetStore.Filter_SorterCore;

import ATcom.InternetStore.DataBaseCore.Laptop;
import ATcom.InternetStore.DataBaseCore.Smartphone;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Gwindblaid on 03.06.2016.
 */


public class Sorter {

    public static void laptopSort(List<Laptop> dataBase, Criterions firstCriterion, Criterions secondCriterion) {
        laptopSort(dataBase, firstCriterion);
        laptopSort(dataBase, secondCriterion);
    }

    public static void laptopSort(List<Laptop> dataBase, Criterions criterion) {

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

    public static void smartphoneSort(List<Smartphone> dataBase, Criterions firstCriterion, Criterions secondCriterion) {
        smartphoneSort(dataBase, firstCriterion);
        smartphoneSort(dataBase, secondCriterion);
    }

    public static void smartphoneSort(List<Smartphone> dataBase, Criterions criterion) {

        if (criterion == Criterions.COMPANY) {
            Collections.sort(dataBase, sComparatorByCompany);
        } else if (criterion == Criterions.CPU) {
            Collections.sort(dataBase, sComparatorByCPU);
        } else if (criterion == Criterions.PRICE) {
            Collections.sort(dataBase, sComparatorByPrice);
        } else  if (criterion == Criterions.RAM) {
            Collections.sort(dataBase, sComparatorByRAM);
        } else if (criterion == Criterions.HDD) {
            Collections.sort(dataBase,sComparatorByHDD);
        } else if (criterion == Criterions.OS) {
            Collections.sort(dataBase, sComparatorByOS);
        } else if (criterion == Criterions.BATTERY) {
            Collections.sort(dataBase, sComparatorByBattery);
        } else  if (criterion == Criterions.NUM_OF_SIM) {
            Collections.sort(dataBase, sComparatorByNumOfSIM);
        } else if (criterion == Criterions.CAMERA) {
            Collections.sort(dataBase, sComparatorByCamera);
        }
    }

    public static Laptop laptopMin(List<Laptop> dataBase, Criterions criterion) {
        Laptop laptop;

        if (criterion == Criterions.COMPANY) {
            return laptop = Collections.min(dataBase, lComparatorByCompany);
        } else if (criterion == Criterions.CPU) {
            return laptop = Collections.min(dataBase, lComparatorByCPU);
        } else if (criterion == Criterions.PRICE) {
            return laptop = Collections.min(dataBase, lComparatorByPrice);
        } else  if (criterion == Criterions.RAM) {
            return laptop = Collections.min(dataBase, lComparatorByRAM);
        } else if (criterion == Criterions.HDD) {
            return laptop = Collections.min(dataBase,lComparatorByHDD);
        } else if (criterion == Criterions.OS) {
            return laptop = Collections.min(dataBase, lComparatorByOS);
        } else if (criterion == Criterions.BATTERY) {
            return laptop = Collections.min(dataBase, lComparatorByBattery);
        } else  if (criterion == Criterions.OPTICAL_DRIVE) {
            return laptop = Collections.min(dataBase, lComparatorByOpticalDrive);
        } else {
            return laptop = Collections.min(dataBase, lComparatorByGraphicCard);
        }
    }

    public static Laptop laptopMax(List<Laptop> dataBase, Criterions criterion) {
        Laptop laptop;

        if (criterion == Criterions.COMPANY) {
            return laptop = Collections.max(dataBase, lComparatorByCompany);
        } else if (criterion == Criterions.CPU) {
            return laptop = Collections.max(dataBase, lComparatorByCPU);
        } else if (criterion == Criterions.PRICE) {
            return laptop = Collections.max(dataBase, lComparatorByPrice);
        } else  if (criterion == Criterions.RAM) {
            return laptop = Collections.max(dataBase, lComparatorByRAM);
        } else if (criterion == Criterions.HDD) {
            return laptop = Collections.max(dataBase,lComparatorByHDD);
        } else if (criterion == Criterions.OS) {
            return laptop = Collections.max(dataBase, lComparatorByOS);
        } else if (criterion == Criterions.BATTERY) {
            return laptop = Collections.max(dataBase, lComparatorByBattery);
        } else  if (criterion == Criterions.OPTICAL_DRIVE) {
            return laptop = Collections.max(dataBase, lComparatorByOpticalDrive);
        } else {
            return laptop = Collections.max(dataBase, lComparatorByGraphicCard);
        }
    }

    public static Smartphone smartphoneMin(List<Smartphone> dataBase, Criterions criterion) {
        Smartphone smartphone;

        if (criterion == Criterions.COMPANY) {
            return smartphone = Collections.min(dataBase, sComparatorByCompany);
        } else if (criterion == Criterions.CPU) {
            return smartphone = Collections.min(dataBase, sComparatorByCPU);
        } else if (criterion == Criterions.PRICE) {
            return smartphone = Collections.min(dataBase, sComparatorByPrice);
        } else  if (criterion == Criterions.RAM) {
            return smartphone = Collections.min(dataBase, sComparatorByRAM);
        } else if (criterion == Criterions.HDD) {
            return smartphone = Collections.min(dataBase,sComparatorByHDD);
        } else if (criterion == Criterions.OS) {
            return smartphone = Collections.min(dataBase, sComparatorByOS);
        } else if (criterion == Criterions.BATTERY) {
            return smartphone = Collections.min(dataBase, sComparatorByBattery);
        } else  if (criterion == Criterions.NUM_OF_SIM) {
            return smartphone = Collections.min(dataBase, sComparatorByNumOfSIM);
        } else {
            return smartphone = Collections.min(dataBase, sComparatorByCamera);
        }
    }

    public static Smartphone smartphoneMax(List<Smartphone> dataBase, Criterions criterion) {
        Smartphone smartphone;

        if (criterion == Criterions.COMPANY) {
            return smartphone = Collections.max(dataBase, sComparatorByCompany);
        } else if (criterion == Criterions.CPU) {
            return smartphone = Collections.max(dataBase, sComparatorByCPU);
        } else if (criterion == Criterions.PRICE) {
            return smartphone = Collections.max(dataBase, sComparatorByPrice);
        } else  if (criterion == Criterions.RAM) {
            return smartphone = Collections.max(dataBase, sComparatorByRAM);
        } else if (criterion == Criterions.HDD) {
            return smartphone = Collections.max(dataBase, sComparatorByHDD);
        } else if (criterion == Criterions.OS) {
            return smartphone = Collections.max(dataBase, sComparatorByOS);
        } else if (criterion == Criterions.BATTERY) {
            return smartphone = Collections.max(dataBase, sComparatorByBattery);
        } else  if (criterion == Criterions.NUM_OF_SIM) {
            return smartphone = Collections.max(dataBase, sComparatorByNumOfSIM);
        } else {
            return smartphone = Collections.max(dataBase, sComparatorByCamera);
        }
    }

    private static Comparator<Laptop> lComparatorByCompany = new Comparator<Laptop>() {
        @Override
        public int compare(Laptop o1, Laptop o2) {
            return o1.getManufacturedCompany().compareTo(o2.getManufacturedCompany());
        }
    };

    private static Comparator<Laptop> lComparatorByCPU = new Comparator<Laptop>() {
        @Override
        public int compare(Laptop o1, Laptop o2) {
            return o1.getProcessor().compareTo(o2.getProcessor());
        }
    };

    private static Comparator<Laptop> lComparatorByOS = new Comparator<Laptop>() {
        @Override
        public int compare(Laptop o1, Laptop o2) {
            return o1.getOS().compareTo(o2.getOS());
        }
    };

    private static Comparator<Laptop> lComparatorByGraphicCard = new Comparator<Laptop>() {
        @Override
        public int compare(Laptop o1, Laptop o2) {
            return o1.getGraphicCard().compareTo(o2.getGraphicCard());
        }
    };

    private static Comparator<Laptop> lComparatorByPrice = new Comparator<Laptop>() {
        @Override
        public int compare(Laptop o1, Laptop o2) {
            if (o1.getPrice() > o2.getPrice()) {
                return 1;
            } else if (o1.getPrice() < o2.getPrice()) {
                return -1;
            } else {
                return 0;
            }
        }
    };

    private static Comparator<Laptop> lComparatorByRAM = new Comparator<Laptop>() {
        @Override
        public int compare(Laptop o1, Laptop o2) {
            if (o1.getRam() > o2.getRam()) {
                return 1;
            } else if (o1.getRam() < o2.getRam()) {
                return -1;
            } else {
                return 0;
            }
        }
    };

    private static Comparator<Laptop> lComparatorByHDD = new Comparator<Laptop>() {
        @Override
        public int compare(Laptop o1, Laptop o2) {
            if (o1.getHdd() > o2.getHdd()) {
                return 1;
            } else if (o1.getHdd() < o2.getHdd()) {
                return -1;
            } else {
                return 0;
            }
        }
    };

    private static Comparator<Laptop> lComparatorByBattery = new Comparator<Laptop>() {
        @Override
        public int compare(Laptop o1, Laptop o2) {
            if (o1.getBarrety() > o2.getBarrety()) {
                return 1;
            } else if (o1.getBarrety() < o2.getBarrety()) {
                return -1;
            } else {
                return 0;
            }
        }
    };

    private static Comparator<Laptop> lComparatorByOpticalDrive = new Comparator<Laptop>() {
        @Override
        public int compare(Laptop o1, Laptop o2) {
            if (o1.getOpticalDrive() == false && o2.getOpticalDrive() == true) {
                return 1;
            } else if (o1.getOpticalDrive() == true && o2.getOpticalDrive() == false) {
                return -1;
            } else {
                return 0;
            }
        }
    };

    private static Comparator<Smartphone> sComparatorByCompany = new Comparator<Smartphone>() {
        @Override
        public int compare(Smartphone o1, Smartphone o2) {
            return o1.getManufacturedCompany().compareTo(o2.getManufacturedCompany());
        }
    };

    private static Comparator<Smartphone> sComparatorByCPU = new Comparator<Smartphone>() {
        @Override
        public int compare(Smartphone o1, Smartphone o2) {
            return o1.getProcessor().compareTo(o2.getProcessor());
        }
    };

    private static Comparator<Smartphone> sComparatorByOS = new Comparator<Smartphone>() {
        @Override
        public int compare(Smartphone o1, Smartphone o2) {
            return o1.getOS().compareTo(o2.getOS());
        }
    };

    private static Comparator<Smartphone> sComparatorByPrice = new Comparator<Smartphone>() {
        @Override
        public int compare(Smartphone o1, Smartphone o2) {
            if (o1.getPrice() > o2.getPrice()) {
                return 1;
            } else if (o1.getPrice() < o2.getPrice()) {
                return -1;
            } else {
                return 0;
            }
        }
    };

    private static Comparator<Smartphone> sComparatorByRAM = new Comparator<Smartphone>() {
        @Override
        public int compare(Smartphone o1, Smartphone o2) {
            if (o1.getRam() > o2.getRam()) {
                return 1;
            } else if (o1.getRam() < o2.getRam()) {
                return -1;
            } else {
                return 0;
            }
        }
    };

    private static Comparator<Smartphone> sComparatorByHDD = new Comparator<Smartphone>() {
        @Override
        public int compare(Smartphone o1, Smartphone o2) {
            if (o1.getHdd() > o2.getHdd()) {
                return 1;
            } else if (o1.getHdd() < o2.getHdd()) {
                return -1;
            } else {
                return 0;
            }
        }
    };

    private static Comparator<Smartphone> sComparatorByBattery = new Comparator<Smartphone>() {
        @Override
        public int compare(Smartphone o1, Smartphone o2) {
            if (o1.getBarrety() > o2.getBarrety()) {
                return 1;
            } else if (o1.getBarrety() < o2.getBarrety()) {
                return -1;
            } else {
                return 0;
            }
        }
    };

    private static Comparator<Smartphone> sComparatorByNumOfSIM = new Comparator<Smartphone>() {
        @Override
        public int compare(Smartphone o1, Smartphone o2) {
            if (o1.getNumOfSIM() > o2.getNumOfSIM()) {
                return 1;
            } else if (o1.getNumOfSIM() < o2.getNumOfSIM()) {
                return -1;
            } else {
                return 0;
            }
        }
    };

    private static Comparator<Smartphone> sComparatorByCamera = new Comparator<Smartphone>() {
        @Override
        public int compare(Smartphone o1, Smartphone o2) {
            if (o1.getCamera() == false && o2.getCamera() == true) {
                return 1;
            } else if (o1.getCamera() == true && o2.getCamera() == false) {
                return -1;
            } else {
                return 0;
            }
        }
    };
}
