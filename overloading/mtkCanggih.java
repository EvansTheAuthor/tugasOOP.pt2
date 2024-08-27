package overloading;

public class mtkCanggih{
    private double result;
    
    void mod(int x, int y){
        result=x%y;
    }

    void mod(int x, int y, int z){
        result=x%y%z;
    }

    void mod(double x, double y){
        result=x%y;
    }

    void mod(double x, double y, double z){
        result=x%y%z;
    }

    double getRes(){
        return result;
    }
}
