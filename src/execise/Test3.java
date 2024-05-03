package execise;

public class Test3 {
    public static void main(String[] args) {

        int[] array = {1,5,2,0,8,6};
        int intMin = arraylist(array);

        System.out.println(intMin);

    }
    public static int arraylist(int[] array){
        int intMax = array[0];

        for (int i= 1;i <array.length; i++){
            if (intMax < array[i]) {
                intMax = array[i];
            }
        }
        return  intMax;




        }
    }
