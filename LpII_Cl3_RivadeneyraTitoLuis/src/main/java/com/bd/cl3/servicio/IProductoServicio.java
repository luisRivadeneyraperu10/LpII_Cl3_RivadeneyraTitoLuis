package com.bd.cl3.servicio;

import java.util.List;

import com.bd.cl3.modelo.TblProducto;

public interface IProductoServicio {

	//declaro los metodos
	public List<TblProducto> ListadoProducto();
	public void RegistrarProducto(TblProducto producto);
	public TblProducto BuscarporId(Integer id);
	public void Eliminar(Integer id);
	
	
} //fin de la interface
