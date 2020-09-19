import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.List;

public class columnSort {

    private void checkEqual(String[] charArray){
        for(int i=0;i<charArray.length;i++){
            if(charArray[i].length() != charArray[0].length()){
                System.out.println("All strings must be the same length.");
                System.out.println("[-1]");
                System.exit(0);
            }
        }
    }



    private List<Integer> minDeletionSize(String[] charArray){
        List<Integer> badCols = new ArrayList<Integer>();

        for(int i=0;i<charArray[0].length();i++) {
            for (int j = 1; j < charArray.length; j++) {
                if (charArray[j-1].charAt(i) > charArray[j].charAt(i) && badCols.contains(i)==false) {
                        badCols.add(i);
                }
                }
            }
                return badCols;
                 }

    private void solve(String[] charArray){

        checkEqual(charArray);
        System.out.println(minDeletionSize(charArray));
    }


    public static void main(String[] args){
        columnSort sort = new columnSort();
        String[] charArray = new String[3];

        charArray[0] = "xaz";
        charArray[1] = "wbu";
        charArray[2] = "tcr";

        sort.solve(charArray);



    }
}
