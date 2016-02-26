package com.todomanager.persistent.dao;

import java.util.ArrayList;
import java.util.List;

import com.todomanager.persistent.entity.ActionItem;

public class ActionItemDaoJPA implements ActionItemDao{

	public List<ActionItem> fetchAllActionItems() {
		
		List<ActionItem> actionItemList = new ArrayList<ActionItem>();
		
		return actionItemList;
	}

}
