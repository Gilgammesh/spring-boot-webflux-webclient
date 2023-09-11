package com.santander.springbootwebfluxwebclient.models;

import java.util.Date;

import lombok.Data;

@Data
public class Producto {
	private String id;
	private String nombre;
	private Double precio;
	private Date createAt;
	private String foto;
	private Categoria categoria;
}
