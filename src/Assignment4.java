package src;
//İbrahim Yaşin 30922193818
import java.util.Arrays;

public class Assignment4 {
    public static String[] sortByHeight(String[] names, int[] heights){
        int low, temp;
        String tempN;
        for(int i = 0; i < names.length-1; i++){
            for(int j = i+1; j < names.length; j++){
                low = heights[i];
                if(low < heights[j]){
                    temp = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp;
                    tempN = names[i];
                    names[i] = names[j];
                    names[j] = tempN;
                }
            }
        }
        return names;
    }

    public static void main(String[] args) {
        String[] names = {"Gizem", "Ozan", "Ege", "Meral"};
        int[] heights = {173, 171, 178, 166};

        System.out.println(Arrays.toString(sortByHeight(names, heights)));
        /*
        //Another way for printing array
        for(String ls : sortByHeight(names, heights)){
            System.out.print("\"" + ls + "\" ");
        }
         */
    }
}
