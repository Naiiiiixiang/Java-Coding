package hahaha.lalala.link;

public class TestNode2 {
    public static void main(String[] args) {
       /* Node node = new Node(null, "李白", node1);
        Node node1 = new Node(node, "杜甫", node2);
        Node node2 = new Node(node1, "王安石", null);*/
    }
    static class Node {

        //前一个节点
        Node preNode;
        //数据
        Object data;
        //后一个节点
        Node nextNode;

        public Node(Node preNode, Object data, Node nextNode) {
            this.preNode = preNode;
            this.data = data;
            this.nextNode = nextNode;
        }
    }
}
