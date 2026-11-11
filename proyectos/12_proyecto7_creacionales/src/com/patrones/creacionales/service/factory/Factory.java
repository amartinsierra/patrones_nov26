package com.patrones.creacionales.service.factory;

import com.patrones.creacionales.model.Usuario;

public interface Factory {
	Usuario create(String name, String email);
}
