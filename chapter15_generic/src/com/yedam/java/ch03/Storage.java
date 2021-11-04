package com.yedam.java.ch03;

public interface Storage<T> {
	public void add(T item, int index);
	public T get(int index);

}
