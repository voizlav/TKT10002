
public class Main {

    public static void main(String[] args) {

        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");

        VehicleRegistry vr = new VehicleRegistry();
        vr.add(li1, "Arto");
        vr.add(li2, "Jürgen");
        vr.add(li3, "Matti");
        vr.add(li3, "Matti2");

        System.out.println(vr.get(new LicensePlate("D", "B WQ-431")));
    }
}
