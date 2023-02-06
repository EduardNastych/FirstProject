public class Varargs {
    static void suma(int ... a){
        int suma = 0;
        for(int i =0; i<a.length; i++){
            suma+=a[i];
        }
        System.out.println(suma);
    }
    public static void main (String[] args){
        suma(6,8,-14,9,15);
    }
}
