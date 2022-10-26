public class Problem_1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n=10;
        for(int i=0; i<n; i++)
        {
            //for I pattern
            for(int j=0; j<n; j++)
            {
                if((i==0 && j<n-1) || j==(n-1)/2 || (i==n-1 && j<n-1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            //for N pattern
            for(int j=0; j<n; j++)
            {
                if(j==0 && j<(n-1)|| i==j || j==(n-1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            //for E pattern
            for(int j=0; j<n; j++)
            {
                if(i==0 && i<(n-1) || j==0 && j<(n-1) || i==(n-1)|| i==(n/2))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            //for U pattern
            for(int j=0; j<n; j++)
            {
                if(j==0 && i<n-1||
                        i==n-1 && j<n-1&&j>0
                        ||j==n-1&& i<n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            // for O Pattern
            for(int j=0; j<n; j++)
            {
                if(i==0 && i<(n-1)|| j==0 && j<(n-1) || i==(n-1)/2 || j==(n-1)&&
                        j==(n-1)&& i<(n)/2 ||i==j && i>n/2 && j>n/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            //for R pattern

            for(int j=0; j<n; j++)
            {
                if((i==0&& j!=0 && j!=(n-1))||
                        j==0&& i!=0&& i!=(n-1)||
                        i==n-1 && j!=0 &&j!=n-1||
                        j==(n-1)&&i!=0&&i!=n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            System.out.print("   ");
            //for N Pattern
            for(int j=0; j<n; j++)
            {
                if(j==0 && j<(n-1)|| i==j || j==(n-1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();


        }

    }
}
