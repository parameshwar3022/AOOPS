public class Main {
    public static void main(String[] args) {
        LightingFacade lightingFacade = new LightingFacade();

        lightingFacade.setZoneLighting("Living Room", 75, "warm white");
        lightingFacade.setZoneLighting("Bedroom", 40, "cool blue");

        System.out.println("Living Room - Brightness: " + lightingFacade.getZoneBrightness("Living Room") + "%, Color: " + lightingFacade.getZoneColor("Living Room"));
        System.out.println("Bedroom - Brightness: " + lightingFacade.getZoneBrightness("Bedroom") + "%, Color: " + lightingFacade.getZoneColor("Bedroom"));
    }
}
