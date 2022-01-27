package com.project.exoplanet.exceptions;

public class ValueReturnMessageEventErro extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ValueReturnMessageEventErro(String msg) {
		super(String.format(msg));
 	}
}
