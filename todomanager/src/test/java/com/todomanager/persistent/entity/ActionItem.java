package com.todomanager.persistent.entity;

public class ActionItem {
	
	private int actionItemId;
	private String actionItem;
	private String priority;
	
	

	public ActionItem()
	{}

	public ActionItem(int actionItemId, String actionItem, String priority)
	{
		this.actionItemId = actionItemId;
		this.actionItem = actionItem;
		this.priority = priority;
		
	}
	
	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}
	public int getActionItemId() {
		return actionItemId;
	}
	public void setActionItemId(int actionItemId) {
		this.actionItemId = actionItemId;
	}
	public String getActionItem() {
		return actionItem;
	}
	public void setActionItem(String actionItem) {
		this.actionItem = actionItem;
	}
}
