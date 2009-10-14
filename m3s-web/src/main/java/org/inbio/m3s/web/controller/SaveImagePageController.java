/**
 * 
 */
package org.inbio.m3s.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.inbio.m3s.dto.message.MediaTypeDTO;
import org.inbio.m3s.dto.metadata.UsePolicyDTO;
import org.inbio.m3s.service.MessageManager;
import org.inbio.m3s.dto.util.KeyValueDTO;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * @author jgutierrez
 *
 */
public class SaveImagePageController extends AbstractController{
		
	private MessageManager messageManager;
	
	private String imageCode = "fileName";
	
	public SaveImagePageController(){}

	protected ModelAndView handleRequestInternal(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		
		ModelAndView mav = new ModelAndView("insertStep2");
		
		//nombre del archivo que voy a subir 
		//(en realidad es como el código del archivo que voy a subir)
		String filename = request.getParameter(imageCode);
		mav.addObject("fileName", filename);
		
		//Tipos de multimedios
		List<MediaTypeDTO>  mediaTypes = messageManager.getAllMediaTypes();
		mav.addObject("mediaTypes", mediaTypes);
		
		//Tipos de Asociaciones
		List<KeyValueDTO> associatedToValues = messageManager.getAllAssociatedToValues();
		//for(KeyValueDTO atDTO : associatedToValues){
	//		logger.info(atDTO.getKey()+" "+atDTO.getNameKey());
		//}
		mav.addObject("associatedToValues", associatedToValues);
		
		//Tipos de Dueños de Imágenes
		List<KeyValueDTO> ownerValues = messageManager.getAllMediaOwnerValues();
		mav.addObject("mediaOwners", ownerValues);	
		
		//Políticas de Uso
		List<UsePolicyDTO> usePolicies = messageManager.getAllUsePolicies();
		mav.addObject("usePolicies", usePolicies);
		
		return mav;
	}

	/**
	 * @param messageManager the messageManager to set
	 */
	public void setMessageManager(MessageManager messageManager) {
		this.messageManager = messageManager;
	}

	/**
	 * @return the messageManager
	 */
	public MessageManager getMessageManager() {
		return messageManager;
	}


}
