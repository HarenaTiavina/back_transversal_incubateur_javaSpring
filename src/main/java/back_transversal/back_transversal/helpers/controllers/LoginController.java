package back_transversal.back_transversal.helpers.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import back_transversal.back_transversal.models.Personne;
import back_transversal.service.AuthService;

@RestController
@RequestMapping("/api/login")
public class LoginController {
    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public Personne login(@RequestBody Personne request) {
        // Utilisez le service d'authentification pour vérifier les informations d'identification
        return this.authService.loadUserByUsername(request.getNom(), request.getMdp());

        // if (userDetails != null) {
        //     return ResponseEntity.ok("Connexion réussie !");
        // } else {
        //     return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Échec de la connexion !");
        // }
    }

    @GetMapping("/logout")
    public ResponseEntity<?> logout() {
        // Vous pouvez implémenter une logique de déconnexion personnalisée si nécessaire
        SecurityContextHolder.clearContext();
        return ResponseEntity.ok("Déconnexion réussie !");
    }
}