package com.yedam.java.ch03;

public class StorageImpl<T> implements Storage<T> {
	private T[] array;
	
	public StorageImpl(int size) {
		this.array = (T[])(new Object[size]);
	}

	@Override
	public void add(T item, int index) {
		array[index] = item;
	}

	@Override
	public T get(int index) {
		return array[index];
	}

}
