package com.todomanager.persistent.dao;

import java.util.List;

import com.todomanager.persistent.entity.ActionItem;

public interface ActionItemDao {

	
	/**
	 * This method retrieves list of ActionItem from the database.
	 *@return List of ActionItem
	 */
	 List<ActionItem> fetchAllActionItems();

	
}
