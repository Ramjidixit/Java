/*print the following star pattern for m number of rows 
 *****
 *****
 *****
 *****                          */


public class pattern1 {
    public static void main(String[] args){
        int m=4;
        int n=5;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
