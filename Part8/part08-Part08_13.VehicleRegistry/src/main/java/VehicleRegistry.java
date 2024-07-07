import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public String get(LicensePlate licensePlate) {
        return this.registry.get(licensePlate);
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.registry.get(licensePlate) == null) {
            this.registry.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public boolean remove(LicensePlate licensePlate) {
        return this.registry.remove(licensePlate) != null;
    }

    public void printLicensePlates() {
        for (LicensePlate li : this.registry.keySet()) {
            System.out.println(li);
        }
    }

    public void printOwners() {
        ArrayList<String> ownersPrinted = new ArrayList<>();

        for (String owner : this.registry.values()) {
            if (!(ownersPrinted.contains(owner))) {
                ownersPrinted.add(owner);
                System.out.println(owner);
            }
        }
    }
}
