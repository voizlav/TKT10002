import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<String>());
        this.storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.storage.getOrDefault(storageUnit, new ArrayList<String>());
    }

    public void remove(String storageUnit, String item) {
        this.storage.get(storageUnit).remove(item);

        if (this.storage.get(storageUnit).isEmpty()) {
            this.storage.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> storageKeys = new ArrayList<>();

        for (String key : this.storage.keySet()) {
            if (!(this.storage.get(key).isEmpty())) {
                storageKeys.add(key);
            }
        }
        return storageKeys;
    }
}
