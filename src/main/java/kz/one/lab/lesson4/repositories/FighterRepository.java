package kz.one.lab.lesson4.repositories;

import kz.one.lab.lesson4.entity.Fighter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FighterRepository extends JpaRepository<Fighter, Long> {

}
