/*print the following pattern 
                1
                12
                123
                1234
                12345  */

public class pattern36 {
    public static void main(String[] args){
        
        for(int i=1;i<=5;i++){
            int num=1;
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num=num+1;
            }
            System.out.println();
        }
    }
    
}
