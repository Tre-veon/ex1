public class Main {
    public static void main(String[] args) {


        String city = "Columbus";
        System.out.println("City:"+city);

        int zipcode = 43215;
        System.out.println("City Zipcode:"+zipcode);

        double dailyHighs[] = {32,25,27,40,45};
        double total = 0;

        for(int i = 0; i<5; i++) {
            total = dailyHighs[i] + total;
        }
        System.out.println("Average temp:"+total/5);







    }
}