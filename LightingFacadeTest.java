public class LightingFacadeTest {

    public static void main(String[] args) {
        LightingFacadeTest test = new LightingFacadeTest();
        test.testSetZoneLighting();
        test.testGetZoneBrightness();
        test.testGetZoneColor();
        System.out.println("All tests passed.");
    }

    public void testSetZoneLighting() {
        LightingFacade lightingFacade = new LightingFacade();
        lightingFacade.setZoneLighting("Living Room", 70, "blue");

        assert lightingFacade.getZoneBrightness("Living Room") == 70 : "Brightness should be 70%";
        assert lightingFacade.getZoneColor("Living Room").equals("blue") : "Color should be blue";
    }

    public void testGetZoneBrightness() {
        LightingFacade lightingFacade = new LightingFacade();
        lightingFacade.setZoneLighting("Bedroom", 50, "red");

        int brightness = lightingFacade.getZoneBrightness("Bedroom");
        assert brightness == 50 : "Expected brightness to be 50%";
    }

    public void testGetZoneColor() {
        LightingFacade lightingFacade = new LightingFacade();
        lightingFacade.setZoneLighting("Kitchen", 100, "yellow");

        String color = lightingFacade.getZoneColor("Kitchen");
        assert color.equals("yellow") : "Expected color to be yellow";
    }
}
