/**
 * 
 */
package org.inbio.m3s.dto.agent;

import java.io.Serializable;

/**
 * @author jgutierrez
 *
 */
public class PersonLiteDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4994487393351577195L;

	private String personKey;

	/* The name in a display ready way, i.e. first name + last name*/
	private String name;
	

	/**
	 * 
	 */
	public PersonLiteDTO() {
		super();
	}

	/**
	 * @param personKey
	 * @param name
	 */
	public PersonLiteDTO(String personKey, String name) {
		super();
		this.setPersonKey(personKey);
		this.setName(name);
	}
	
	@Override
	public String toString(){
		return "La Person Lite DTO tiene:" +
		"\n\tKey : " + this.getPersonKey() +
		"\n\tName: '"+ this.getName() +"'" +
		"";
	}

	/**
	 * @param personKey the personKey to set
	 */
	public void setPersonKey(String personKey) {
		this.personKey = personKey;
	}

	/**
	 * @return the personKey
	 */
	public String getPersonKey() {
		return personKey;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

}