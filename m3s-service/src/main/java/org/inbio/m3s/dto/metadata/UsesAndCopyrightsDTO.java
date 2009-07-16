/**
 * 
 */
package org.inbio.m3s.dto.metadata;

import java.util.List;

import org.inbio.m3s.dto.BaseDTO;


/**
 * @author jgutierrez
 *
 */
public class UsesAndCopyrightsDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private String mediaKey;

	private String authorKey;

	private String personOwnerKey;
	
	private String institutionOwnerKey;

	private String usePolicyKey;

	private List<MediaUseDTO> mediaUsesList;

	private Character isBackup;

	private Character isPublic;
	
	public UsesAndCopyrightsDTO(){
		
	}

	/**
	 * @param authorId
	 * @param personOwnerId
	 * @param institutionOwnerId
	 * @param usePolicyId
	 * @param isBackup
	 * @param isPublic
	 */
	public UsesAndCopyrightsDTO(Integer authorId, Integer personOwnerId,
			Integer institutionOwnerId, Integer usePolicyId, Character isBackup,
			Character isPublic) {
		this.authorKey = String.valueOf(authorId);
		if(personOwnerId == null)
			this.personOwnerKey = null;
		else
			this.personOwnerKey = String.valueOf(personOwnerId);
		if(institutionOwnerId == null)
			this.institutionOwnerKey = null;
		else
			this.institutionOwnerKey = String.valueOf(institutionOwnerId);
		this.usePolicyKey = String.valueOf(usePolicyId);
		this.isBackup = isBackup;
		this.isPublic = isPublic;
	}
	
	/**
	 * @param authorKey
	 * @param personOwnerKey
	 * @param institutionOwnerKey
	 * @param usePolicyKey
	 * @param isBackup
	 * @param isPublic
	 */
	public UsesAndCopyrightsDTO(String authorKey, String personOwnerKey,
			String institutionOwnerKey, String usePolicyKey, Character isBackup,
			Character isPublic) {
		this.authorKey = authorKey;
		this.personOwnerKey = personOwnerKey;
		this.institutionOwnerKey = institutionOwnerKey;
		this.usePolicyKey = usePolicyKey;
		this.isBackup = isBackup;
		this.isPublic = isPublic;
	}
	
	
	/**
	 * @param mediaId
	 * @param authorId
	 * @param personOwnerKey
	 * @param institutionOwnerKey
	 * @param usePolicyKey
	 * @param mediaUsesList
	 * @param isBackup
	 * @param isPublic
	 */
	public UsesAndCopyrightsDTO(String mediaKey, String authorKey,
			String personOwnerKey, String institutionOwnerKey, String usePolicyKey,
			List<MediaUseDTO> mediaUsesList, Character isBackup, Character isPublic) {
		this.mediaKey = mediaKey;
		this.authorKey = authorKey;
		this.personOwnerKey = personOwnerKey;
		this.institutionOwnerKey = institutionOwnerKey;
		this.usePolicyKey = usePolicyKey;
		this.mediaUsesList = mediaUsesList;
		this.isBackup = isBackup;
		this.isPublic = isPublic;
	}



	/**
	 * 
	 */
	@Override
	public String toString(){
		return "El Uses and Copyrights Metadata DTO tiene:" +
				"\n\tMedia id: " + this.getMediaKey() +
				"\n\tAuthor id: " + this.getAuthorKey() +
				"\n\tInstitution Owner id: " + this.getInstitutionOwnerKey() +
				"\n\tPerson Owner id: " + this.getPersonOwnerKey() +
				"\n\tUse Policy Id: " + this.getUsePolicyKey() +
				"\n\tAssociated Media Uses: "+ this.getMediaUsesList().size() +
				"\n\tIs backup: "+ this.getIsBackup() +
				"\n\tIs public: "+ this.getIsPublic() +
				"";
	}


	/**
	 * @return the mediaKey
	 */
	public String getMediaKey() {
		return mediaKey;
	}


	/**
	 * @param mediaKey the mediaKey to set
	 */
	public void setMediaKey(String mediaKey) {
		this.mediaKey = mediaKey;
	}


	/**
	 * @return the authorKey
	 */
	public String getAuthorKey() {
		return authorKey;
	}


	/**
	 * @param authorKey the authorKey to set
	 */
	public void setAuthorKey(String authorKey) {
		this.authorKey = authorKey;
	}


	/**
	 * @return the personOwnerKey
	 */
	public String getPersonOwnerKey() {
		return personOwnerKey;
	}


	/**
	 * @param personOwnerKey the personOwnerKey to set
	 */
	public void setPersonOwnerKey(String personOwnerKey) {
		this.personOwnerKey = personOwnerKey;
	}


	/**
	 * @return the institutionOwnerKey
	 */
	public String getInstitutionOwnerKey() {
		return institutionOwnerKey;
	}


	/**
	 * @param institutionOwnerKey the institutionOwnerKey to set
	 */
	public void setInstitutionOwnerKey(String institutionOwnerKey) {
		this.institutionOwnerKey = institutionOwnerKey;
	}


	/**
	 * @return the usePolicyKey
	 */
	public String getUsePolicyKey() {
		return usePolicyKey;
	}


	/**
	 * @param usePolicyKey the usePolicyKey to set
	 */
	public void setUsePolicyKey(String usePolicyKey) {
		this.usePolicyKey = usePolicyKey;
	}


	/**
	 * @return the mediaUsesList
	 */
	public List<MediaUseDTO> getMediaUsesList() {
		return mediaUsesList;
	}


	/**
	 * @param mediaUsesList the mediaUsesList to set
	 */
	public void setMediaUsesList(List<MediaUseDTO> mediaUsesList) {
		this.mediaUsesList = mediaUsesList;
	}


	/**
	 * @return the isBackup
	 */
	public Character getIsBackup() {
		return isBackup;
	}


	/**
	 * @param isBackup the isBackup to set
	 */
	public void setIsBackup(Character isBackup) {
		this.isBackup = isBackup;
	}


	/**
	 * @return the isPublic
	 */
	public Character getIsPublic() {
		return isPublic;
	}


	/**
	 * @param isPublic the isPublic to set
	 */
	public void setIsPublic(Character isPublic) {
		this.isPublic = isPublic;
	}
}
