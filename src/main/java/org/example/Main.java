package org.example;

import org.example.domain.Tenis;
import org.example.service.TenisService;
import org.example.service.TenisServiceImpl;

public class Main {
    public static void main(String[] args) {
        TenisService tenisService = new TenisServiceImpl();

        // Agregar tenis
        tenisService.addTenis(new Tenis("Nike", "Air Max", 38.0, 120.0));
        tenisService.addTenis(new Tenis("Asics", "Gel-Dedicate 8", 38.0, 210.0));
        tenisService.addTenis(new Tenis("Adidas", "Superstar", 40.0, 90.0));

        // Listar todos los tenis
        tenisService.getAllTenis().forEach(System.out::println);

        // Obtener un tenis por ID
        Tenis tenis = tenisService.getTenis(1L);
        System.out.println("Tenis encontrado: " + tenis);

        // Eliminar un tenis
        tenisService.removeTenis(1L);
        System.out.println("Tenis después de la eliminación:");
        tenisService.getAllTenis().forEach(System.out::println);
    }
}