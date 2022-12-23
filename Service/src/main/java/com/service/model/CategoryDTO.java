package com.service.model;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDTO {

	@NotBlank(message = "Enter category title ")
	private String title;
	@NotBlank(message = "Enter category description  ")
	private String description;
	@NotBlank(message = "Enter category name")
	private String name;
}
