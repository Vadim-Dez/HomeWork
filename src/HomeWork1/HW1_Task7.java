package HomeWork1;

public class HW1_Task7 {
    public static void main(String[] args) {

        String resultMethod =
                createPhoneNumber(new int[]{1,2,3,4,5,6,7,8,9,0});

        System.out.println(resultMethod);
    }

    public static String createPhoneNumber(int[] data){
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", data[0]
                , data[1], data[2], data[3], data[4], data[5], data[6]
                , data[7], data[8], data[9]);
    }
}
