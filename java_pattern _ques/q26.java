public class q26 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int star=1;
        while(row<=n)
        {
            int space=4;
            while(space>=row)
            {
                System.out.print("  ");
                space--;
            }
            int s=1;
            while(s<=star)
            {
                System.out.print(s+" ");
                s++;
            }
            System.out.println();
            row++;
            star+=2;
        }
    }
}
