import java.util.ArrayList;


// DFS Traversal of a graph using adjacency list representation


public class practice {
    static ArrayList<Integer>[] graph;

    public static void dfs(int curr, boolean[] visited){
        visited[curr] = true;
        System.out.print(curr+" ");
        for(int neighbor: graph[curr]){
            if(!visited[neighbor]){
                dfs(neighbor, visited);

            }
        }
    } 
    public static void main(String[] args){
        int v =5;
        graph = new ArrayList[v];
        for(int i=0; i<v; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(1);
        graph[1].add(0);
        graph[0].add(2);
        graph[2].add(0);
        graph[1].add(3);
        graph[3].add(1);
        graph[2].add(4);
        graph[4].add(2);

        boolean[] visited = new boolean[v];
        System.out.println("DFS Traversal:");
        dfs(0, visited);

    }
}

// output : 0 1 3 2 4
    

