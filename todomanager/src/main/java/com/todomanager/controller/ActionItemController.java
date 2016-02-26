package com.todomanager.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.todomanager.persistent.entity.ActionItem;
import com.todomanager.persistent.entity.ActionItemListContainer;

@Controller
public class ActionItemController {


	
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public ModelAndView showActionItems() {
		
		ActionItemListContainer actionItemListContainer  = new ActionItemListContainer();
		
		List<ActionItem> actionItemList = new ArrayList<ActionItem>();
		actionItemList.add(new ActionItem(101,"Task1","High"));
		actionItemList.add(new ActionItem(102,"Task2","Medum"));
		actionItemList.add(new ActionItem(103,"Task3","Low"));
		actionItemList.add(new ActionItem(104,"Task4","Low"));
		actionItemList.add(new ActionItem(105,"Task5","High"));
		
		actionItemListContainer.setActionItemList(actionItemList);
		
		return new ModelAndView("ActionItemListPage" , "actionItemListContainer", actionItemListContainer);
	}
	
	/**
     * Method used to add a new ActionItem into database.
     * @param user
     * @return Redirect to /index page to display ActionItem list
     */
    @RequestMapping(value = "/editActionItem", method = RequestMethod.POST)
    public String edit(@ModelAttribute("actionItem") ActionItem actionItem) {
 
    	boolean addFlag=true;
    	String forwardMsg="";
    	
    	if(actionItem !=null && actionItem.getActionItem()!=null && !actionItem.getActionItem().isEmpty())
        {
    		ActionItem actionItem2 = new ActionItem();
    		actionItem2.setActionItem(actionItem.getActionItem());
           
    		//addFlag=DBOperations.addActionItem(actionItem2);
    		if(addFlag)
    			forwardMsg = "Please enter a valid Action Item.";
    		else
    			forwardMsg = "Added succesfully";
    	
    		
        }
        return  "redirect:index.html";
        
    }
    
    @RequestMapping(value = "/addActionItem", method = RequestMethod.POST)
    public String add(@ModelAttribute("actionItem") ActionItem actionItem) {
 
    	boolean addFlag=true;
    	String forwardMsg="";
    	
    	if(actionItem !=null && actionItem.getActionItem()!=null && !actionItem.getActionItem().isEmpty())
        {
    		ActionItem actionItem2 = new ActionItem();
    		actionItem2.setActionItem(actionItem.getActionItem());
           
    		//addFlag=DBOperations.addActionItem(actionItem2);
    		if(addFlag)
    			forwardMsg = "Please enter a valid Action Item.";
    		else
    			forwardMsg = "redirect:index.html";
    			
        }
        return  "redirect:index.html";
    }

	
}
