package exam_07;
import java.io.*;
import java.util.*;

public class Graph {

 private ArrayList<ArrayList<Integer>> grafo;
 private ArrayList<Integer> persone;
 
 public Graph (String path) throws Exception {
  
  FileReader fr = new FileReader(path);
  LineNumberReader ln = new LineNumberReader(fr);
  
     
     int n_righe=0;      

     do  {
           
      n_righe++;
      
     } while (ln.readLine() != null);
    
     n_righe=n_righe-1;
     ln.close();
     fr.close();

      
     FileReader fr2 = new FileReader(path);
     Scanner scan2 =new Scanner(fr2);
     
     scan2.nextLine();
     
     grafo = new ArrayList<ArrayList<Integer>>();

     
     for (int i=0; i<=n_righe; i++) {
      
      grafo.add(new ArrayList<Integer>());
      
     }
     
     while (scan2.hasNextInt()) {
      
      int u = scan2.nextInt();
      int v = scan2.nextInt();
      
      List<Integer> adju = grafo.get(u);
      //List<Integer> adjv = grafo.get(v);
      
      adju.add(v);
     // System.out.println(grafo);
      
     }
     
     scan2.close();
     fr2.close();


 }

    public ArrayList<Integer> getPersone(String path) throws Exception {


        FileReader fr3 = new FileReader(path);
        Scanner sc3 = new Scanner(fr3);

        persone = new ArrayList<Integer>();
        sc3.nextLine();

        while (sc3.hasNextInt()) {

            int x = sc3.nextInt();

            persone.add(x);

        }

        System.out.println(persone);

        sc3.close();
        fr3.close();

        return persone;
    }


    public Iterable<Integer> adjacent(int u){
	  
	  return grafo.get(u);
	  
	 }

}