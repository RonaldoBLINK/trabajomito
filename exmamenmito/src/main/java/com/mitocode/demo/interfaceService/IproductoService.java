package com.mitocode.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.mitocode.demo.modelo.Producto;

@SpringBootApplication

public interface IproductoService {
 public List<Producto>listar();
 public Optional<Producto>listarId(int id);
 public int save(Producto p);
 public void delete(int id);
 
 
 
}
