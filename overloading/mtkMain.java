package overloading;
//nama: Muhammad Abdullah Azzam
//NIM: 09020623036
public class mtkMain {
    public static void main(String[] args) {
        mtk Mtk=new mtk();

        Mtk.sum(12.5, 28.7, 14.2);
        System.out.println("1. 12.5+28.7+14.2 = "+Mtk.getRes());

        Mtk.sum(23, 34);
        System.out.println("2. 23+34 = "+Mtk.getRes());

        Mtk.sum(12, 28, 14);
        System.out.println("3. 12+28+14 = "+Mtk.getRes());

        Mtk.sum(3.4, 4.9, 0);
        System.out.println("4. 3.4+4.9 = "+Mtk.getRes());

        mtkCanggih matematika=new mtkCanggih();

        matematika.mod(3.4, 0.3);
        System.out.println("5. 3.4%0.3 = "+matematika.getRes());
    }
}
