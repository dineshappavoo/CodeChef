/**
 * 
 */
package maximalpathscore;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author Dinesh Appavoo
 *
 */
public class MaximalPathScore {

	/**
	 * @param args
	 */
	public static Graph graph=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MaximalPathScore().constructGraph();

	}
	
	public void constructGraph()
	{
		int noOfVertices,noOfEdges;
		int u, v, w;
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNext())
		{
			noOfVertices=scanner.nextInt();
			noOfEdges=scanner.nextInt();
			graph=new Graph(noOfVertices);
			for(int i=0;i<noOfEdges;i++)
			{
				u=scanner.nextInt();
				v=scanner.nextInt();
				w=scanner.nextInt();
				graph.addEdge(u, v, w);
				graph.addEdge(v, u, w);
			}
			break;
		}
		graph.printGraph();

	}
 
	public boolean doBFS(int source, int dest)
	{
		Queue<Edge> queue=new LinkedList<Edge>();
		queue.add(source);
		
	}

}
