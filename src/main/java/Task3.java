import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
The first line of input contains a positive number n, next n lines contains pairs of positive integers,
where each pair identifies a connection between two vertices in a graph.
Please provide a working code that will give us the answer for the following questions:
how many separated graphs are in the input?
 */
public class Task3 {

    int branches;
    List<List<Integer>> graphs;     //graphs list

    private void caltulateInput(){
        Scanner scanner = new Scanner(System.in);
        graphs = new ArrayList<>();
        try {
            this.branches = scanner.nextInt();
            for (int i = 0; i < branches; i++) {
                int node1 = scanner.nextInt();
                int node2 = scanner.nextInt();
                Integer graph1 = findGraphContainNode(node1);
                Integer graph2 = findGraphContainNode(node2);
                if (graph1 == null && graph2 == null) {         //nodes not found in existing graphs
                    graphs.add(createNewGraph(node1, node2));
                } else {
                    if (graph1 != null && graph2 == null) {     //node1 found in graph1 node2 not, so add node2 to graph1
                        graphs.get(graph1).add(node2);
                    } else if (graph1 == null) {                //graph2 != null - is always true
                        graphs.get(graph2).add(node1);
                    } else if (graph1.equals(graph2)) {      //node1 found in graph1, node2 found in other -> join two graphs
                        joinGraphs(graph1, graph2);
                    }
                }
            }
        }catch (Exception e){
            System.out.println("error reading input");
            System.out.println(e.getMessage());
        }
    }


    private void joinGraphs(Integer graph1, Integer graph2) {
        graphs.get(graph1).addAll(graphs.get(graph2));
        graphs.remove(graphs.get(graph2));
    }

    private Integer findGraphContainNode(int node) {
        for(int i=0; i<graphs.size(); i++){
            if(graphs.get(i).contains(node)){
                return i;
            }
        }
        return null;
    }

    private List<Integer> createNewGraph(Integer node1, Integer node2){
        List<Integer> graph = new ArrayList<>();
        graph.add(node1);
        graph.add(node2);
        return graph;
    }

    public void calculate(){
        caltulateInput();
        System.out.println(graphs.size());      //answer
    }




}
