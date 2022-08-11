package section_six;

import java.lang.reflect.Array;
import java.util.Arrays;

public class updating_array {
    public static void main(String[] args) {
        String[] menu = {"Espresso", "Iced Coffee", "Macchiato"};
        System.out.println(Arrays.toString(menu));
        menu[2] = "Cappucino";
        System.out.println(Arrays.toString(menu));
        String[] newMenu = new String[5];
        for(int i = 0; i < menu.length; i++) {
            newMenu[i] = menu[i];
        }
        System.out.println(Arrays.toString(newMenu));
        newMenu[3] = "Latte Macchiato";
        newMenu[4] = "Flat coffee";
        System.out.println(Arrays.toString(newMenu));
    }
    
}
