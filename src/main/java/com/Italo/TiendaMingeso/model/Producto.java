package com.Italo.TiendaMingeso.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Producto")
public class Producto {
	 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	private String Nombre;
	private int PrecioCLP;
	private double PrecioUSD;
	private double PrecioEUR;


	public Producto(){
    }

	public long getId() {
		return this.Id;
	}

	public void setId(long Id) {
		this.Id = Id;
	}

	public String getNombre() {
		return this.Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	public int getPrecioCLP() {
		return this.PrecioCLP;
	}

	public void setPrecioCLP(int PrecioCLP) {
		this.PrecioCLP = PrecioCLP;
	}

	public double getPrecioUSD() {
		return this.PrecioUSD;
	}

	public void setPrecioUSD(double PrecioUSD) {
		this.PrecioUSD = PrecioUSD;
	}

	public double getPrecioEUR() {
		return this.PrecioEUR;
	}

	public void setPrecioEUR(double PrecioEUR) {
		this.PrecioEUR = PrecioEUR;
	}
	
}
