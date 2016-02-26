package com.todomanager.service;

import java.util.List;

import com.todomanager.persistent.entity.ActionItem;

public interface ActionItemBusinessService {

	List<ActionItem> fetchAllActionItems();
	
}
