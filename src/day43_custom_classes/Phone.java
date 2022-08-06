package day43_custom_classes;

public class Phone {
    String brand, model;
    int storage;
    double version;

    public Phone(String brand){
        this.brand = brand;
    }
    public Phone(String brand, String model){
        this.brand = brand;
        this.model = model;
    }
    public Phone(String brand, String model, int storage, double version){
        this.brand = brand;
        this.model = model;
        this.storage = storage;
        this.version = version;
    }

    @Override
    public String toString() {

        String obj = brand;

        if (brand != null){
            obj += " | " + brand;
        }
        if (storage != 0){
            obj += " | " + storage;
        }
        if (version != 0){
            obj += " | " + version;
        }
        return obj;
    }
}
