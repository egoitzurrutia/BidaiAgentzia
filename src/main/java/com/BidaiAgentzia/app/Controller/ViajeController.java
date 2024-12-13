package com.BidaiAgentzia.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.BidaiAgentzia.app.Model.Viaje;
import com.BidaiAgentzia.app.Repository.ViajeRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class ViajeController {

    @Autowired
    private ViajeRepository viajeRepository;

    @GetMapping("/viajes")
    public String listarViajes(Model model) {
        // Obtener todos los viajes desde la base de datos
        List<Viaje> viajes = viajeRepository.findAll();
        model.addAttribute("viajes", viajes); // Pasar los datos a la vista
        return "viajes"; // Nombre de la plantilla (viajes.html)
    }
}
