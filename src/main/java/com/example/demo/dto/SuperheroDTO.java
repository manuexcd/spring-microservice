package com.example.demo.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SuperheroDTO implements Serializable {
	private static final long serialVersionUID = 6879609824711203039L;
	private long id;
	private String universe;
	private List<SuperpowerDTO> superpowers;
	private Boolean isAlive;
}
