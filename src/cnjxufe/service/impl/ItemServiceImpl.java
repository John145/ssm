package cnjxufe.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.jxufe.mapper.ItemMapper;
import cn.jxufe.po.Item;

public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private ItemMapper itemMapper;
	
	@Override
	public List<Item> findAll() {
		List<Item> list = itemMapper.findAll();
		return list;
	}

	@Override
	public Item findByPrimaryKey(Integer id) {
		return itemMapper.findByPrimaryKey(id);
	}

	@Override
	public void updateByPrimaryKey(Item item) {
		itemMapper.updateByPrimaryKey(item);
	}

}
