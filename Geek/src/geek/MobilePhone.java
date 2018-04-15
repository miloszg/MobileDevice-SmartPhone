package geek;

public abstract class MobilePhone extends MobileDevice {
    float przekatnaEkranu=0;
    float czasPracyTelefonu=0;
    
    public MobilePhone(float pB,float pE)
    {
        super(pB);
        this.przekatnaEkranu=pE;
        czasPracyTelefonu=getczasPracy();
        
    }
   
    @Override
    public float getczasPracy()
    {
            return pojemnoscBaterii/przekatnaEkranu;
    }
    
    public abstract float getczasPracySmartDevice();
    
}
