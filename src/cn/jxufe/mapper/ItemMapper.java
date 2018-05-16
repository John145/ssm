package cn.jxufe.mapper;

import java.util.List;

import cn.jxufe.po.Item;

public interface ItemMapper {
	public List<Item> findAll();
	public Item findByPrimaryKey(Integer id);
	public void updateByPrimaryKey(Item item);
}
