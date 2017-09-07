package exam_07;
import java.io.*;
import java.util.*;

public class Bfs {

 private Set<Integer> visited;
 private Queue<Integer> queue;
 public ArrayList<Integer> bfspersone;
 
 public Bfs (Graph grafo, int who) throws Exception{
  

	 
  visited = new HashSet<Integer>();
  queue = new ArrayDeque<Integer>(); //


 
  bfsVisit(grafo,who);



 //System.out.println();
 }
 
 
 private void bfsVisit(Graph grafo, int u) {
  
	 queue.add(u);
	 System.out.print("Inizio:("+u+")" + "\n");
	 Iterable<Integer> adju;
	

	 while(0 != queue.size())
	 {
	 	int j = queue.size();

	 	for (int n = 0 ; n<j ; n++) {

			Integer v = queue.poll();


			if (!visited.contains(v)) {

				adju = grafo.adjacent(v);                    ///

				System.out.print("Vertice:(" + v + ")");


				for (Integer z : adju) {

					queue.add(z); // Add all neighbors of 'vertex' to the queue
					//System.out.print("Adiacenze:(" + z + ")");

				}

				visited.add(v);


				//System.out.println("Coda:" + queue);
				//System.out.println("Visitati:" + visited);
				//System.out.println();

			}

		}

		System.out.println();

	 }  // System.out.println("1");
 }


 public void confronto_visite(ArrayList<Integer> persone){


	 bfspersone =  new ArrayList<Integer>();
	 bfspersone = persone;

 	for (int falze = 0 ; falze < bfspersone.size() ; falze++ ) {


 		if (!visited.contains(bfspersone.get(falze))){


 			System.out.print(bfspersone.get(falze) + " ");

		}


	}
 }

}