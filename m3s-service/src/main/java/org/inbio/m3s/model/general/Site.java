package org.inbio.m3s.model.general;


import java.util.Date;

import org.inbio.m3s.model.LogGenericEntity;

public class Site extends LogGenericEntity {
	
	private static final long serialVersionUID = 1L;

	private Integer siteId;

	private String description;

	private String longitude;

	private String latitude;

	private Integer lambertX;

	private Integer lambertY;

	private String lambertProjection;

	private Integer siteCalculationMethodId;

	private Integer crtmEast;

	private Integer crtmNorth;

	private Integer baseProjectionId;

	public Site() {
	}

	public Site(Integer siteId, String longitude, String latitude) {
		this.siteId = siteId;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public Site(Integer siteId, String description, String longitude,
			String latitude, Date creationDate, String createdBy,
			Date lastModificationDate, String lastModificationBy,
			Integer lambertX, Integer lambertY, String lambertProjection,
			Integer siteCalculationMethodId, Integer crtmEast,
			Integer crtmNorth, Integer baseProjectionId) {
		this.siteId = siteId;
		this.description = description;
		this.longitude = longitude;
		this.latitude = latitude;
		setCreationDate(creationDate);
		setCreatedBy(createdBy);
		setLastModificationDate(lastModificationDate);
		setLastModificationBy(lastModificationBy);
		this.lambertX = lambertX;
		this.lambertY = lambertY;
		this.lambertProjection = lambertProjection;
		this.siteCalculationMethodId = siteCalculationMethodId;
		this.crtmEast = crtmEast;
		this.crtmNorth = crtmNorth;
		this.baseProjectionId = baseProjectionId;
	}

	public Integer getSiteId() {
		return this.siteId;
	}

	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public Integer getLambertX() {
		return this.lambertX;
	}

	public void setLambertX(Integer lambertX) {
		this.lambertX = lambertX;
	}

	public Integer getLambertY() {
		return this.lambertY;
	}

	public void setLambertY(Integer lambertY) {
		this.lambertY = lambertY;
	}

	public String getLambertProjection() {
		return this.lambertProjection;
	}

	public void setLambertProjection(String lambertProjection) {
		this.lambertProjection = lambertProjection;
	}

	public Integer getSiteCalculationMethodId() {
		return this.siteCalculationMethodId;
	}

	public void setSiteCalculationMethodId(Integer siteCalculationMethodId) {
		this.siteCalculationMethodId = siteCalculationMethodId;
	}

	public Integer getCrtmEast() {
		return this.crtmEast;
	}

	public void setCrtmEast(Integer crtmEast) {
		this.crtmEast = crtmEast;
	}

	public Integer getCrtmNorth() {
		return this.crtmNorth;
	}

	public void setCrtmNorth(Integer crtmNorth) {
		this.crtmNorth = crtmNorth;
	}

	public Integer getBaseProjectionId() {
		return this.baseProjectionId;
	}

	public void setBaseProjectionId(Integer baseProjectionId) {
		this.baseProjectionId = baseProjectionId;
	}

}
