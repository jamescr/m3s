package org.inbio.m3s.model.atta;


import java.util.Date;

import org.inbio.m3s.model.general.Institution;

public class INBioInstitution extends Institution {

	private static final long serialVersionUID = 1L;

	public INBioInstitution() {
	}
	
	public INBioInstitution(Integer institutionId, String name) {
		super(institutionId,name);
	}

	/**
	 * @param institutionId
	 * @param name
	 * @param telephone
	 * @param fax
	 * @param streetAddress
	 * @param city
	 * @param stateProvince
	 * @param country
	 * @param acronym
	 * @param url
	 * @param logoImageId
	 * @param creationDate
	 * @param createdBy
	 * @param lastModificationDate
	 * @param lastModificationBy
	 */
	public INBioInstitution(Integer institutionId, String name, String telephone, String fax, String streetAddress, String city, String stateProvince, String country, String acronym, String url, Integer logoImageId,Date creationDate, String createdBy, Date lastModificationDate, String lastModificationBy) {
		super(institutionId,name,telephone,fax,streetAddress,city,stateProvince,country,acronym,url,logoImageId,
				creationDate, createdBy,lastModificationDate,lastModificationBy);
	}
}
