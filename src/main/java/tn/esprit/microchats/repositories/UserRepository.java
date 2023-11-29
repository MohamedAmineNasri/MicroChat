package tn.esprit.microchats.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.microchats.entities.User;

public interface UserRepository extends JpaRepository<User,Integer> {
}
