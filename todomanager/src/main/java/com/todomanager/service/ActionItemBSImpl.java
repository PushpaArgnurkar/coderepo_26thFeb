package com.todomanager.service;

import java.util.ArrayList;
import java.util.List;

import com.todomanager.persistent.dao.ActionItemDao;
import com.todomanager.persistent.entity.ActionItem;

public class ActionItemBSImpl implements ActionItemBusinessService{

	 ActionItemDao designationDao;
	
	public ActionItemBSImpl() {
	}

	public ActionItemDao getDesignationDao() {
		return designationDao;
	}

	public void setDesignationDao(ActionItemDao designationDao) {
		this.designationDao = designationDao;
	}

	public List<ActionItem> fetchAllActionItems() {
		 List<ActionItem> actionItemsList = new ArrayList<ActionItem>();
		 
		 actionItemsList = designationDao.fetchAllActionItems();
		 
		return actionItemsList;
	}

}
