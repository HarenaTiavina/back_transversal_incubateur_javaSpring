package back_transversal.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import back_transversal.back_transversal.helpers.interfaces.PersonneRepository;
import back_transversal.back_transversal.models.Personne;

@Service
public class AuthService {

    @Autowired
    private PersonneRepository personneRepository;

    public Personne loadUserByUsername(String username, String mdp) throws UsernameNotFoundException {
        Personne personne = personneRepository.findByNom(username).orElse(null);

        if (personne == null) {
            throw new UsernameNotFoundException("Utilisateur non trouvé.");
        }

        if(!personne.getMdp().equals(mdp)) {
            throw new UsernameNotFoundException("Mot de passe incorrect.");
        }

        String role = "ROLE_" + personne.getProfil();

        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(role));

        return personne;
        // return new User(personne.getNom(), personne.getMdp(), authorities);
    }
}
