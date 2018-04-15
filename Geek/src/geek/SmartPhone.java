package geek;

public final class SmartPhone extends MobilePhone{ 
    int liczbaRdzeni;
    private int imie;
    
    public SmartPhone(float pB,float pE,int imie,int lR)
    {
        super(pB,pE);
        this.imie=imie;
        this.liczbaRdzeni=lR;
    }
    
    @Override
    public float getczasPracySmartDevice() {
        return czasPracyTelefonu/liczbaRdzeni;
    }

    @Override
    public float getczasPracy() {
       return pojemnoscBaterii/przekatnaEkranu;
    }
    
    public String getImie()
    {
        return String.valueOf(imie);  
    }
    
    public String getImie1()
    {
        return Integer.toString(imie);  
    }
}
