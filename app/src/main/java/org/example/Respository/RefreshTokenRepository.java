package org.example.Respository;
import org.example.entities.RefreshToken;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

@Repository
public interface RefreshTokenRepository  extends  CrudRepository<RefreshToken, Integer> {
    Optional<RefreshToken> findByToken(String token);

}
