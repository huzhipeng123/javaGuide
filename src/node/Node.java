package node;
/**
 * ˫������Ľڵ�Node
 * @author hzp
 *
 * @param <E>
 */
public class Node<E> {
	//�ڵ�ֵ
	E item;
	//��̽ڵ�
	Node<E> next;
	//ǰ���ڵ�
	Node<E> prev;
	
	Node(Node<E> prev, E element, Node<E> next){
		this.item = element;
		this.prev = prev;
		this.next = next;
	}
}
