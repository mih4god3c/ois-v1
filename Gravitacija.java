import java.util.*;
public class Gravitacija {
    public static void main (String[]args) {

        
        
    }
    public int gravitacijskiPospesek (int nadmorskaVisina){
        float konstanta = 6,674 * Math.pow(10, -11);
        float masaZemlje = 5,972 * Math.pow(10, 24);
        float polmerZemlje = 6,731 * Math.pow(10, 6);
        float gravitacijskiPospesek = (konstanta * masaZemlje) / (Math.pow((polmerZemlje + nadmorskaVisina), 2));
        return gravitacijskiPospesek;
        
    }
}