package com.xformation.foodordering.core;

import com.xformation.foodordering.core.item.Item;

import java.util.ArrayList;
import java.util.List;

public class Menu<T extends Item>{
	private String name;
	private List<T> items = new ArrayList<>();

	public Menu(String name) {
		this.name = name;
	}

	public void add(T t) {
		items.add(t);
	}

	public T get(int i) {
		return items.get(i);
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder
				.append("\n")
				.append(name)
				.append(":\n");
		for (int i = 0; i < items.size(); i++) {
			stringBuilder
					.append(i + 1)
					.append(". ")
					.append(items.get(i))
					.append("\n");
		}
		return stringBuilder.toString();
	}
}
