public class arrayFromLoop {
    public static void main(String[] args) {
        String address[] = new String[4];
        address[0] = "Kathmandu";
        address[1] = "Pokhara";
        address[2] = "Biratnagar";
        address[3] = "Lumbini";
        for(int i=0; i<4; i++){
            System.out.println(address[i]);
        }
    }
}
