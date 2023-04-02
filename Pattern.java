public class Pattern
 {
	public static void main(String[] args) 
{
	    //JAVA IS AMAZING
		int n=7;
	    for(int i=0; i<=n-1; ++i)
	    {
	        for(int j=0; j<=n-1; ++j )
	        {
               //for J character
	            if(i==0 || j==n/2 || i-j==n/2)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        //for A character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(j==0 && i!=0 || (j==n-1 && i!=0) || i==n/2 || (i==0 && j!=0 && j!=n-1))
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	         //for V character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if((i-j==n/2 && i>=n/2) || i+j==n+n/2-1)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	         //for A character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(j==0 && i!=0 || (j==n-1 && i!=0) || i==n/2 || (i==0 && j!=0 && j!=n-1))
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" \t\t");
	         //for I character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(i==0 || i==n-1 || j==n/2)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	         //for S character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if((i==0 && j!=0) || (i==n/2 && j!=0 && j!=n-1) || (i==n-1 && j!=n-1) || (j==0 && i!=0 && i<n/2) || (j==n-1 && i>n/2 && i!=n-1))
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" \t");
	        //for A character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(j==0 && i!=0 || (j==n-1 && i!=0) || i==n/2 || (i==0 && j!=0 && j!=n-1))
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	        //for M character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(j==0 || j==n-1 || (i==j && i<=n/2) || (i+j==n-1 && i<=n/2))
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	        //for A character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(j==0 && i!=0 || (j==n-1 && i!=0) || i==n/2 || (i==0 && j!=0 && j!=n-1))
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	        //for Z character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(i==0 || i==n-1 ||i+j==n-1)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	        //for I character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(i==0 || i==n-1 || j==n/2)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	        //for N character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(j==0 || j==n-1 || i==j)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	        //for G character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(i==0 || j==0 || (i==n/2 && j>=n/2) || (j==n/2 && i>=n/2) || (i==n-1 && j<=n/2) || j==n-1 && i!=n/2-1)
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
   
	    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
	    //PROUD GQTIAN
	    for(int i=0; i<=n-1; ++i)
	    {
	        for(int j=0; j<=n-1; ++j )
	        {
                 //for P character
	            if(j==0 || (i==0 || i==n/2 && j!=n-1) || (j==n-1 && i!=0 && i<n/2))
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	        // for R character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(j==0 || ((i==0 || i==n/2) && j<n/2) || i-j==n/2 || (j==n/2 && i!=0 && i<n/2))
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        // for O character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(((i==0 || i==n-1) && j!=0 && j!=n-1) || ((j==0 || j==n-1) && i!=0 && i!=n-1))
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	        // for U character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(((j==0 || j==n-1) && i!=n-1) || (i==n-1 && j!=0 && j!=n-1))
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	        // for D character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(((i==0 || i==n-1) && j!=n-1) || j==0 || (j==n-1 && i!=0 && i!=n-1))
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" \t\t\t");
	        // for G character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(i==0 || j==0 || (i==n/2 && j>=n/2) || (j==n/2 && i>=n/2) || (i==n-1 && j<=n/2) || j==n-1 && i!=n/2-1)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	        // for Q character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if((i==0 && j!=0 && j<=n/2) || (j==0 && i!=0 && i<=n/2) || (j==n/2+1 && i!=0 && i<=n/2+1) || (i==n/2+1 && j!=0 && j!=0 && j<=n/2 +1) || (i==j && i>=n/2))
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        // for T character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(i==0 || j==n/2)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	        //for I character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(i==0 || i==n-1 || j==n/2)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	        // for A character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(j==0 && i!=0 || (j==n-1 && i!=0) || i==n/2 || (i==0 && j!=0 && j!=n-1))
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	        //for N character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(j==0 || j==n-1 || i==j)
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
 System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
	    //THANK YOU GR  SIR
	    for(int i=0; i<=n-1; ++i)
	    {
	        for(int j=0; j<=n-1; ++j )
	        {
			 // for T character
	            if(i==0 || j==n/2)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        // for H character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(j==0 || j==n-1 || i==n/2)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	        // for A character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(j==0 && i!=0 || (j==n-1 && i!=0) || i==n/2 || (i==0 && j!=0 && j!=n-1))
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	        //for N character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(j==0 || j==n-1 || i==j)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	        //for K character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(j==0 || i+j==n/2 || i-j==n/2)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" \t\t");
	        //for Y character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if((i==j && j<=n/2) || i+j==n-1)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        // for O character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(((i==0 || i==n-1) && j!=0 && j!=n-1) || ((j==0 || j==n-1) && i!=0 && i!=n-1))
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	        // for U character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(((j==0 || j==n-1) && i!=n-1) || (i==n-1 && j!=0 && j!=n-1))
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" \t\t");
	        // for G character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(i==0 || j==0 || (i==n/2 && j>=n/2) || (j==n/2 && i>=n/2) || (i==n-1 && j<=n/2) || j==n-1 && i!=n/2-1)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	        // for R character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(j==0 || ((i==0 || i==n/2) && j<n/2) || i-j==n/2 || (j==n/2 && i!=0 && i<n/2))
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print("\t\t");
	      
	        //for S character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if((i==0 && j!=0) || (i==n/2 && j!=0 && j!=n-1) || (i==n-1 && j!=n-1) || (j==0 && i!=0 && i<n/2) || (j==n-1 && i>n/2 && i!=n-1))
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	        //for I character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(i==0 || i==n-1 || j==n/2)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	        // for R character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(j==0 || ((i==0 || i==n/2) && j<n/2) || i-j==n/2 || (j==n/2 && i!=0 && i<n/2))
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
	    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
	    //THANK YOU ZABI SIR
	    for(int i=0; i<=n-1; ++i)
	    {
	        for(int j=0; j<=n-1; ++j )
	        {
		      //for T character
	            if(i==0 || j==n/2)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        // for H character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(j==0 || j==n-1 || i==n/2)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	        // for A character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(j==0 && i!=0 || (j==n-1 && i!=0) || i==n/2 || (i==0 && j!=0 && j!=n-1))
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	        //for N character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(j==0 || j==n-1 || i==j)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	        //for K character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(j==0 || i+j==n/2 || i-j==n/2)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" \t\t");
	        //for Y character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if((i==j && j<=n/2) || i+j==n-1)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        // for O character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(((i==0 || i==n-1) && j!=0 && j!=n-1) || ((j==0 || j==n-1) && i!=0 && i!=n-1))
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	        // for U character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(((j==0 || j==n-1) && i!=n-1) || (i==n-1 && j!=0 && j!=n-1))
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" \t\t");
	        //for Z character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(i==0 || i==n-1 ||i+j==n-1)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	        // for A character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(j==0 && i!=0 || (j==n-1 && i!=0) || i==n/2 || (i==0 && j!=0 && j!=n-1))
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	        // for B character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(((i==0 || i==n/2 || i==n-1) && j!=n-1) || (j==0 || j==n-1 && i!=0 && i!=n/2 && i!=n-1))
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	        //for I character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(i==0 || i==n-1 || j==n/2)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print("\t\t");
	        //for S character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if((i==0 && j!=0) || (i==n/2 && j!=0 && j!=n-1) || (i==n-1 && j!=n-1) || (j==0 && i!=0 && i<n/2) || (j==n-1 && i>n/2 && i!=n-1))
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	        //for I character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(i==0 || i==n-1 || j==n/2)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	        // for R character
	        for(int j=0; j<=n-1; ++j )
	        {
	            if(j==0 || ((i==0 || i==n/2) && j<n/2) || i-j==n/2 || (j==n/2 && i!=0 && i<n/2))
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