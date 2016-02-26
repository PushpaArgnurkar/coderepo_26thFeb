package com.todomanager.persistent.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.SessionFactoryUtils;

import com.sun.javafx.binding.SetExpressionHelper;
import com.todomanager.persistent.entity.ActionItem;
import com.todomanager.service.ActionItemBusinessService;

public class ActionItemUT {

	 private SessionFactoryUtils sessionFactory;
     private SetExpressionHelper session = null;

 /*    @Before
     public void before() {
      // setup the session factory
      AnnotationConfigurationException configuration = new AnnotationConfigurationException();
      configuration.addAnnotatedClass(ActionItem.class)
        .addAnnotatedClass(ActionItem.class)
        .addAnnotatedClass(ActionItem.class);
      configuration.setProperty("hibernate.dialect",
        "org.hibernate.dialect.H2Dialect");
      configuration.setProperty("hibernate.connection.driver_class",
        "org.h2.Driver");
      configuration.setProperty("hibernate.connection.url", "jdbc:h2:mem");
      configuration.setProperty("hibernate.hbm2ddl.auto", "create");

      sessionFactory = configuration.buildSessionFactory();
      SetExpressionHelper<ActionItem> as  = new SetExpressionHelper<ActionItem>();
      	
    */
	
	
	   @Autowired
	    ActionItemBusinessService service;

	    @Test
	    public void testFindAllAccounts() {
	        List<ActionItem> accs = service.fetchAllActionItems();
	        assertEquals("Check DB is empty first", 0, accs.size());
	        ActionItem a = new ActionItem();
	        a.setActionItem("task1");
	        a.setPriority("high");
	        //((Object) service).fetchAllActionItems();
	        accs = service.fetchAllActionItems();
	        assertEquals("check Account has been created", 1, accs.size());
	    }
}
