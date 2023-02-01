package com.example.demo.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SuperpowerDTO implements Serializable {
	private static final long serialVersionUID = -2528321720760601962L;
	private long id;
	private String name;
	private String description;
}
