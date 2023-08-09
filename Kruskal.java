package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Kruskal {

    public static class MySets{
        public HashMap<Node, List<Node>> setMap;
        public MySets(List<Node> nodes){
            for(Node cur : nodes){
                List<Node> set = new ArrayList<Node>();
                set.add(cur);
                setMap.put(cur,set);
            }
        }
        public boolean isSameSet(Node from, Node to){
            List<Node> fromSet = setMap.get(from);
            List<Node> toSet = setMap.get(to);
            return fromSet == toSet;
        }

        public void combine(Node from, Node to){
            /*if(!isSameSet(from, to)){
                setMap.get(from).addAll(setMap.get(to));
                setMap.put(to, setMap.get(from));
            }*/
            List<Node> fromSet = setMap.get(from);
            List<Node> toSet = setMap.get(to);
            for(Node toNode :toSet){
                fromSet.add(toNode);
                setMap.put(toNode, fromSet);
            }
        }
    }
}
