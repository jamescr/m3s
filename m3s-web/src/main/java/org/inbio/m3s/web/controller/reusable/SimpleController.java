/**
 * 
 */
package org.inbio.m3s.web.controller.reusable;

/* TODO: move to this package: org.inbio.common.web.controller in order to create a new jar file
/  which includes all the reusable components like this simple controllers, security stuff, etc.
 */

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * @author jgutierrez
 * 
 * Based ConfigurableContentController written by dmartin for the Gbif Portal
 * @see org.gbif.portal.web.controller.ConfigurableContentController
 *
 */
public class SimpleController extends AbstractController{

	/** The view of the ModelAndView Object **/
	private String viewName;
	
	/** The model Elements of the ModelAndView Object */
	protected Map<String, Object> modelElements;	
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView(viewName);
		
		if(modelElements!=null)
			mav.addAllObjects(modelElements);
		
		return mav;
	}

	/**
	 * @return the viewName
	 */
	public String getViewName() {
		return viewName;
	}

	/**
	 * @param viewName the viewName to set
	 */
	public void setViewName(String viewName) {
		this.viewName = viewName;
	}

	/**
	 * @return the modelElements
	 */
	public Map<String, Object> getModelElements() {
		return modelElements;
	}

	/**
	 * @param modelElements the modelElements to set
	 */
	public void setModelElements(Map<String, Object> modelElements) {
		this.modelElements = modelElements;
	}

}
