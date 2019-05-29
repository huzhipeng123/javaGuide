package node;
/**
 * 双端链表的节点Node
 * @author hzp
 *
 * @param <E>
 */
public class Node<E> {
	//节点值
	E item;
	//后继节点
	Node<E> next;
	//前驱节点
	Node<E> prev;
	
	Node(Node<E> prev, E element, Node<E> next){
		this.item = element;
		this.prev = prev;
		this.next = next;
	}
}
