package com.stemaze.stemazebackend.dto;

import java.util.List;

public class DropDownDto {
	
	private String key;
	
	private List<DropDownInnerValuesDto> values = null;

	/**
	 * @param key
	 * @param values
	 */
	public DropDownDto(String key, List<DropDownInnerValuesDto> values) {
		super();
		this.key = key;
		this.values = values;
	}

	/**
	 * 
	 */
	public DropDownDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * @return the values
	 */
	public List<DropDownInnerValuesDto> getValues() {
		return values;
	}

	/**
	 * @param values the values to set
	 */
	public void setValues(List<DropDownInnerValuesDto> values) {
		this.values = values;
	}
	
	
}
