public class Main {

    public static void main(String[] args) {

    int a=10,b=5,c=20;
    sumar(a,b,c);

    Coche miCoche= new Coche();
    miCoche.incrementarpuertas();
    System.out.println(miCoche.num_puertas);
    }

    public static void sumar (int a,int b,int c){

        System.out.println(a+b+c);

    }
}