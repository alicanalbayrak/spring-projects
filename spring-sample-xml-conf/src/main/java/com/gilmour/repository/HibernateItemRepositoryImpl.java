package com.gilmour.repository;

import com.gilmour.model.Item;

public class HibernateItemRepositoryImpl implements IItemRepositoryImpl {

	private String dbUsername;

	@Override
	public Item getItemById(int id) {

		System.out.println("Username\t" + dbUsername);

		Item item = new Item();
		item.setId(1);
		item.setDescription("lorem ipsum dolor ...");

		return item;
	}

	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}

}
