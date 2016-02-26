package com.todomanager.delegate;

import java.util.List;

import com.todomanager.persistent.entity.ActionItem;
import com.todomanager.service.ActionItemBSImpl;

public class ActionItemDelegate {

	public final List<ActionItem> getAllDesignations() {
		//Service Locator design pattern
		ActionItemBSImpl actionItemBSImpl = new ActionItemBSImpl();
		return actionItemBSImpl.fetchAllActionItems();
	}
	
}
