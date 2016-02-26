package com.todomanager.persistent.entity;

import java.util.ArrayList;
import java.util.List;

import com.todomanager.persistent.entity.ActionItem;

public class ActionItemListContainer {

	
	private List<ActionItem> actionItemList = new ArrayList<ActionItem>();

	
	public ActionItemListContainer() {
		// TODO Auto-generated constructor stub
	}
	
	public ActionItemListContainer(List<ActionItem> actionItemList) {
		this.actionItemList = actionItemList;
	}
	public List<ActionItem> getActionItemList() {
		return actionItemList;
	}

	public void setActionItemList(List<ActionItem> actionItemList) {
		this.actionItemList = actionItemList;
	}
	
	
	
}
