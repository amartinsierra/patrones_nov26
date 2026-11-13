package com.patrones.comportamiento.editor.mediador;

import com.patrones.comportamiento.editor.observer.Usuario;

public interface ChatMediador {
    void enviarMensaje(String mensaje, Usuario emisor);
    void registrarUsuario(Usuario usuario);
}
