package overloading;

public class mtk {
    private double result;

    void sum(int x, int y){
        result=x+y;
    }

    void sum(int x, int y, int z){
        result=x+y+z;
    }

    void sum(double x, double y){
        result=x+y;
    }

    void sum(double x, double y, double z){
        result=x+y+z;
    }

    void min(int x, int y){
        result=x-y;
    }

    void min(int x, int y, int z){
        result=x-y-z;
    }

    void min(double x, double y){
        result=x-y;
    }

    void min(double x, double y, double z){
        result=x-y-z;
    }

    void multi(int x,int y){
        result=x*y;
    }

    void multi(int x, int y, int z){
        result=x*y*z;
    }

    void multi(double x, double y){
        result=x*y;
    }

    void multi(double x,double y, double z){
        result=x*y*z;
    }

    void divide(int x,int y){
        result= x/y;
    }

    void divide(int x, int y, int z){
        result=x/y/z;
    }

    void divide(double x, double y){
        result=x/y;
    }

    void divide(double x,double y, double z){
        result=x/y/z;
    }

    double getRes(){
        return result;
    }
}
