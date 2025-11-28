public class q4 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        // while(row<=n)
        // {
        //     int space=4;
        //     while(space>=row)
        //     {
        //         System.out.print(" ");
        //         space--;
        //     }
        //     int star=1;
        //     while(star<=row)
        //     {
        //         System.out.print("*");
        //         star++;
        //     }
        //     System.out.println();
        //     row++;
        //     space++;
        while (row<=n)
        {
            int j=row;
            while(j>=1)
            {
                if (j%2!=0)
                {
                    System.out.print(" 1 ");
                    j--;
                }
                else
                {
                    System.out.print(" 0 ");
                    j--;
                }
                
            }
            System.out.println();
            row++;
            
        }
        
        }
    }

