package com.stemaze.stemazebackend.dto;

import java.util.Objects;

public class DropDownInnerValuesDto {
	
	private String code;
	
	private String description;
	
	public DropDownInnerValuesDto code(String code) {
		this.code = code;
		return this;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, description);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DropDownInnerValuesDto other = (DropDownInnerValuesDto) obj;
		return Objects.equals(code, other.code) && Objects.equals(description, other.description);
	}

	@Override
	public String toString() {
		return "DropDownInnerValuesDto [code=" + code + ", description=" + description + "]";
	}

	/**
	 * @param code
	 * @param description
	 */
	public DropDownInnerValuesDto(String code, String description) {
		super();
		this.code = code;
		this.description = description;
	}

	/**
	 * 
	 */
	public DropDownInnerValuesDto() {
		super();
	}

	
}
