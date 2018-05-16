package cn.juxfe.service.impl;

import java.util.List;

import cn.jxufe.po.Item;

public interface ItemService {
	//查询所有item
	public List<Item> findAll();
	//根据id查询商品信息
	public Item findByPrimaryKey(Integer id);
	//根据id修改信息
	public void updateByPrimaryKey(Item item);
}
