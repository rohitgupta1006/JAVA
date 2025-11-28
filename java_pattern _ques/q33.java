

public class q33 {
    public static void main(String[] args) {
        int n=10;
        int row=1;
        while(row<=n)
        {
            int space=10;
            while(space<=n)
            {
                System.out.print(" ");
                space++;
            }
            int number=9;
            while(number>=row)
            {
                System.out.print(number+" ");
                number--;
            }
            System.out.println();
            row++;
            
        }
        
        
    }
}
