package list;

import java.util.Collection;

import node.Node;

public class LinkedList {
	
	/**
	 * �չ��췽��
	 */
	public LinkedList() {
		
	}
	
	/**
	 * �����еļ��ϴ�������Ĺ��췽��
	 * @param c
	 */
	public LinkedList(Collection<? extends E> c) {
		this();
		addAll(c);
	}
	
	/**
	 * ��Ԫ����ӵ�����β��
	 * @param <E>
	 * @param e
	 * @return
	 */
	public <E> boolean add(E e) {
		linkLast(e);
		return true;
	}

	/**
	 * ����ʹe��Ϊ���һ��Ԫ��
	 * @param e
	 */
	private void linkLast(E e) {
		final Node<E> l = last;
		final Node<E> newNode = new Node<>(l, e, null);
		
		
	}
	
	
}
