package pages;

import base.MedianSpecificMethods;

public class TemplateMappingEdit extends MedianSpecificMethods{
	public TemplateMappingEdit clickEdit() {
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingEdit.Edit.Xpath")));
		return this;
	}
	public TemplateMappingEdit editName1() {
	  	  enterValue(locateElement("xpath", props.getProperty("TemplateMappingEdit.editName1.Xpath")), props.getProperty("Name1"));
			return this;
	    }
	public TemplateMappingEdit editName2() {
	  	  enterValue(locateElement("xpath", props.getProperty("TemplateMappingEdit.editName2.Xpath")), props.getProperty("Name1"));
			return this;
	    }
	public TemplateMappingEdit editHeadername1() {
	  	  enterValue(locateElement("xpath", props.getProperty("TemplateMappingEdit.Headername1.Xpath")), props.getProperty("Headername1"));
			return this;
	    }
	public TemplateMappingEdit clickSave() {
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingEdit.Save.Xpath")));
		return this;
	}
	public TemplateMappingEdit clickExit() {
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingEdit.Exit.Xpath")));
		return this;
	}
}
