package com.beans;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member {

	private Integer id;
	private String name;
	private String email;
	private String location;
}
