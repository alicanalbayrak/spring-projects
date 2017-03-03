package com.gilmour.service;

import com.gilmour.model.Item;
import com.gilmour.repository.IItemRepositoryImpl;

/**
 * Created by alicana on 03/03/2017.
 */
public class ItemServiceImpl implements IItemService {

	private IItemRepositoryImpl itemRepository;

	public ItemServiceImpl() {
	}

	@Override
	public Item getItemByID(int id) {
		return itemRepository.getItemById(id);
	}


	public void setItemRepository(IItemRepositoryImpl itemRepository){
		this.itemRepository = itemRepository;
	}

}
