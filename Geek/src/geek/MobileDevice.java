package geek;

public abstract class MobileDevice {
    float pojemnoscBaterii=3300;
    String producent;
    
    MobileDevice(float pB)
    {
        this.pojemnoscBaterii=pB;
        this.producent="Sony";
    
    };
    public abstract float getczasPracy();
}
