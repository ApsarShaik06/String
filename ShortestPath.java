import java.util.Scanner;

public class ShorttestPath {
    
    
      /*

       Input: WNEENESENNN
      Output:The shortest distance is : 5.0
      
        N - North
        S - South
        E - East
        W - West        N
                        ^
                        |
                        |+1
                        |
    W<------minus-1-----|---+1---------->E
                        |
                        |-1
                        |
                        S
      */

      public static float findShortestPath(String path){
        int x =0;
        int y =0;
        for(int i=0; i<path.length(); i++){
            //North
            if(path.charAt(i) == 'N'){
                y++;
            } 
            //South
            else if(path.charAt(i) == 'S'){
                y--;
            }
            //East
            else if(path.charAt(i) == 'E'){
                x++;
            }
            //West
            else{
                x--;
            }
        }

        int XSquare = x*x;
        int YSquare = y*y;

        return (float)Math.sqrt(XSquare+YSquare);
      }
      public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         String path = sc.next();

         float distance = findShortestPath(path);
         System.out.println("The shortest distance is : "+distance);

     }
}
