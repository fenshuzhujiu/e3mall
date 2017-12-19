package cn.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.sql.ast.expr.SQLCaseExpr.Item;

import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;

@Controller
@RequestMapping("item")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("{itemId}")
	@ResponseBody
	public TbItem getItemById(@PathVariable long itemId){
		TbItem item = itemService.getItemById(itemId);
		return item;
	}
	

}
