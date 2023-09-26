import java.util.ArrayList;

public class HelpMethods {
    
    public static double calcularMediaArray(ArrayList<Float> arr){
        float total = 0;
        for (Float numero : arr) {
            total += numero;
        }
    return total/arr.size();
    }
}