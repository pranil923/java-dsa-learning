public class ArrayDeclarationTypes {
    public static void main(String[] args) {
        int nums[] = new int[2];
        nums[1] = 3;
        nums[0] = 2;
        System.out.println(nums[0]);
        System.out.println(nums[1]);
// when we know the arrays elements already
        String letter[] = {"a" , "b", "f"};
        for(int i=0; i<3; i++){
            System.out.println(letter[i]);
        }
    }
}
