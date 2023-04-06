package assignment7;

public class Assignment7 {
	public static int calc_cost(int groupSize, boolean military, boolean student){
        if (groupSize==1){
            if (military){
                return 60;
            }
            else if (student){
                return 102;
            }
            return 120;
        }
        else if (groupSize>=2 && groupSize <=9){
            if (military){
                return 48;
            }
            else if (student){
                return 90;
            }
            return 108;
        }
        else if (groupSize>9){
            if (military){
                return 42;
            }
            else if (student){
                return 84;
            }
            return 102;
        }
        else {
            return 0;
        }
    }
}
