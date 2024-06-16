package com.stemaze.stemazebackend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "timezonetable")
public class TimeZoneEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "zone")
	private String zone;
	
	@Column(name = "zone_description")
	private String zoneDescription;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getZoneDescription() {
		return zoneDescription;
	}

	public void setZoneDescription(String zoneDescription) {
		this.zoneDescription = zoneDescription;
	}

	/**
	 * @param id
	 * @param zone
	 * @param zoneDescription
	 */
	public TimeZoneEntity(Integer id, String zone, String zoneDescription) {
		super();
		this.id = id;
		this.zone = zone;
		this.zoneDescription = zoneDescription;
	}

	/**
	 * 
	 */
	public TimeZoneEntity() {
		super();
	}

	@Override
	public String toString() {
		return "TimeZoneEntity [id=" + id + ", zone=" + zone + ", zoneDescription=" + zoneDescription + "]";
	}

}
