package exam_07;
import java.io.*;
import java.util.*;

public class Bfs {

 private Set<Integer> visited;
 private Queue<Integer> queue;
 
 
 public Bfs (Graph grafo, int who) throws Exception{
  
	 System.out.println("Ciao"); 
	 
  visited = new HashSet<Integer>();
  queue = new ArrayDeque<Integer>();
 
  bfsVisit(grafo,who);
  
 //System.out.println();
 }
 
 
 private void bfsVisit(Graph grafo, int u) {
  
	 queue.add(u);
	 System.out.print("Inizio:("+u+")" + "\n");
	 Iterable<Integer> adju;
	
	 int nello=0;
	
	 while(0 != queue.size())
	 {
	        Integer v = queue.poll();
	        
	        nello++;  System.out.println(nello);
	      
	        if(!visited.contains(v))
	        {
	            
	        	adju = grafo.adjacent(v);					///
	        	
	        	System.out.print("Vertice:("+v+")");
	             							
	        	
	            for( Integer z : adju) {
	        		
	        	queue.add(z); // Add all neighbors of 'vertex' to the queue
	        	System.out.print("Adiacenze:(" + z + ")" );
	        	
	        	}
	        
	     	visited.add(v);
	        	
	
	        System.out.println("Coda:" + queue);	
	        System.out.println("Visitati:" + visited);
	        System.out.println();
   
	        }
   
	 }   System.out.println("1");
 }
 
}