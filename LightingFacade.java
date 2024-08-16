import java.util.HashMap;
import java.util.Map;

class LightingSystem {
    private Map<String, Integer> zonesBrightness = new HashMap<>();
    private Map<String, String> zonesColor = new HashMap<>();

    public void setBrightness(String zone, int level) {
        zonesBrightness.put(zone, level);
        System.out.println("Set brightness of " + zone + " to " + level + "%");
    }

    public void setColor(String zone, String color) {
        zonesColor.put(zone, color);
        System.out.println("Set color of " + zone + " to " + color);
    }

    public int getBrightness(String zone) {
        return zonesBrightness.getOrDefault(zone, 0);
    }

    public String getColor(String zone) {
        return zonesColor.getOrDefault(zone, "white");
    }
}

public class LightingFacade {
    private LightingSystem lightingSystem;

    public LightingFacade() {
        lightingSystem = new LightingSystem();
    }

    public void setZoneLighting(String zone, int brightness, String color) {
        lightingSystem.setBrightness(zone, brightness);
        lightingSystem.setColor(zone, color);
    }

    public int getZoneBrightness(String zone) {
        return lightingSystem.getBrightness(zone);
    }

    public String getZoneColor(String zone) {
        return lightingSystem.getColor(zone);
    }
}
