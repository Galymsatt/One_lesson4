package kz.one.lab.lesson4.repositories;

import kz.one.lab.lesson4.entity.Arena;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArenaRepository extends JpaRepository<Arena, Long> {

//    Optional<Arena> findById(Long id);

}
