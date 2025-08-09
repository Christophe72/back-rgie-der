package com.example.restservice.controller;

import org.springframework.web.bind.annotation.*;

import model.Connection;

import java.util.*;

@RestController
@RequestMapping("/api/interrupteurs")
@CrossOrigin(origins = "*")
public class ConnectionController {

    private final List<Connection> connections = new ArrayList<>(List.of(
        new Connection(
            "Connexion d'une prise",
            "Comment connecter une prise murale standard.",
            "/images/prise.jpg",
            List.of(
                "Coupez l'alimentation électrique.",
                "Dénudez les fils sur une longueur de 10 mm.",
                "Branchez le fil de terre sur la borne centrale.",
                "Connectez les fils phase et neutre selon le schéma."
            ),
            List.of(
                "Toujours vérifier la tension avec un multimètre.",
                "Utilisez un tournevis isolé pour la sécurité."
            )
        ),
        new Connection(
            "Installation d'un interrupteur simple",
            "Guide pour installer un interrupteur simple pour un point lumineux.",
            "/images/interrupteur.jpg",
            List.of(
                "Coupez l'alimentation électrique.",
                "Connectez le fil phase à la borne L.",
                "Reliez le fil de retour lampe à la borne 1 ou 2.",
                "connecter le neutre à la borne N si bi polaire.",
                "connecter les neutres sur wago si non bi polaire.",
                "connecter toutes les terres ensembles sur wago.",
                "Vissez l'interrupteur dans le boîtier mural."
            ),
            List.of(
                "Assurez-vous que les connexions sont bien serrées.",
                "Évitez de tordre les fils trop fortement."
            )
        )
    ));

    @GetMapping
    public List<Connection> getAllConnections() {
        return connections;
    }

    @PostMapping
    public Connection addConnection(@RequestBody Connection connection) {
        connections.add(connection);
        return connection;
    }
}
