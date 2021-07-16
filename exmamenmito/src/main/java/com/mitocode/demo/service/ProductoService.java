package com.mitocode.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.demo.interfaceService.IproductoService;
import com.mitocode.demo.interfaces.IProducto;
import com.mitocode.demo.modelo.Producto;

@Service
public class ProductoService implements IproductoService {

	@Autowired
	private IProducto data;
	
	
	@Override
	public List<Producto> listar() {
		return (List<Producto>)data.findAll();
	}

	@Override
	public Optional<Producto> listarId(int id) {
		return data.findById(id);
		
	}

	@Override
	public int save(Producto p) {
		int res=0;
		Producto producto=data.save(p);
		if(producto.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
		
	}

}
