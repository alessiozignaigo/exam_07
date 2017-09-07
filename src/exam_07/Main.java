package exam_07;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

 public static void main(String[] args) throws Exception {
  // TODO Auto-generated method stub
   
  if (args[0].length()<1) System.exit(0); 

  FileReader fr1 = new FileReader(args[0]);
  Scanner scan1 =new Scanner(fr1);
  
     int chi = scan1.nextInt();
  
     scan1.close();
     fr1.close();
     
    
  
  Graph grafo = new Graph (args[0]);

  Bfs bfs = new Bfs (grafo,chi);

     ArrayList<Integer> p = grafo.getPersone(args[0]);
     bfs.confronto_visite(p);

 }

}