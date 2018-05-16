package cn.jxufe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.juxfe.service.impl.ItemService;
import cn.jxufe.po.Item;

@Controller
@RequestMapping("/item")
public class ItemController {
	@Autowired
	private ItemService ItemService;
	/**
	 * 查找所有item
	 * @return
	 */
	@RequestMapping("/findAllItem")
	public ModelAndView findAllItem() {
		List<Item> items = ItemService.findAll();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("items", items);
		modelAndView.setViewName("/WEB-INF/jsp/item/itemlist.jsp");
		return modelAndView;
	}
	
	/**
	 * 通过id查找item
	 */
	@RequestMapping("/findByPrimaryKey")
	public ModelAndView findByPrimaryKey(Integer id) {
		Item item = ItemService.findByPrimaryKey(id);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("item", item);
		modelAndView.setViewName("/WEB-INF/jsp/item/editItem.jsp");
		return modelAndView;
	}
	
	/**
	 * 通过id修改item
	 */
	@RequestMapping("/updateByPrimaryKey")
	public ModelAndView updateByPrimaryKey(Item item) {
		ItemService.updateByPrimaryKey(item);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("redirect:findAllItem.action");
		return modelAndView;
	}
}
