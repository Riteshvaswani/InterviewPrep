import java.util.*;

class Graph {
	private int V;
	private ArrayList<ArrayList<Integer>> adj;

	Graph(int v) {
		V = v;
		adj = new ArrayList<ArrayList<Integer>>(v);
		for (int i = 0; i < v; i++)
			adj.add(new ArrayList<Integer>());
	}

	void addEdge(int v, int w) {
		adj.get(v).add(w);
	}
	
	boolean topologicalSortUtil(boolean visited[], Stack<Integer> stack) {
		int nodeToBeEvaluated = stack.pop();
		boolean cyclicLoop = false;
		if(visited[nodeToBeEvaluated] == true)
			return true;
		else {
			visited[nodeToBeEvaluated] = true;
			for(int j = 0; j < adj.get(nodeToBeEvaluated).size(); j++) {
				stack.push(adj.get(nodeToBeEvaluated).get(j));
				cyclicLoop = topologicalSortUtil(visited, stack);
				if(cyclicLoop == true)
					break;
			}
		}
		return cyclicLoop;
	}

	boolean verifySchedule() {
		Stack<Integer> stack = new Stack<Integer>();
		boolean hasCyclicLoop = false;
		// Mark all the vertices as not visited
		boolean visited[] = new boolean[V];
		for (int i = 0; i < V; i++) {
			for (int k = 0; k < V; k++)
				visited[k] = false;
			stack.push(i);
			hasCyclicLoop = topologicalSortUtil(visited, stack);
			if(hasCyclicLoop == true)
				break;
		}
		return hasCyclicLoop;
	}
}

public class CourseSchedule {
	public static void main(String args[]) {
		int numCourses = 5;
		int[][] prerequisites = {{1,4},{2,4},{3,1},{3,2}};
		Graph g = new Graph(numCourses);
		for(int i = 0; i < prerequisites.length; i++) {
			g.addEdge(prerequisites[i][1], prerequisites[i][0]);
		}
		System.out.println("Can Schedule: " + !(g.verifySchedule()));
	}
}