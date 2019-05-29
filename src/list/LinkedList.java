package list;

import java.util.Collection;

import node.Node;

public class LinkedList {
	
	/**
	 * 空构造方法
	 */
	public LinkedList() {
		
	}
	
	/**
	 * 将已有的集合创建链表的构造方法
	 * @param c
	 */
	public LinkedList(Collection<? extends E> c) {
		this();
		addAll(c);
	}
	
	/**
	 * 将元素添加到链表尾部
	 * @param <E>
	 * @param e
	 * @return
	 */
	public <E> boolean add(E e) {
		linkLast(e);
		return true;
	}

	/**
	 * 链接使e作为最后一个元素
	 * @param e
	 */
	private void linkLast(E e) {
		final Node<E> l = last;
		final Node<E> newNode = new Node<>(l, e, null);
		
		
	}
	
	
}
