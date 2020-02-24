package kz.one.lab.lesson4.entity;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Getter
@Entity
@Table(name = "t_fighters")
public class Fighter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//bazada avtomatom koydyk nege myna zherde identiti turdy?
    @Column(name = "id")
    private Long id;
    @Setter

//    @Builder.Default
    @Column(name = "name")
    String name = "Незванный Гость";
    @Setter

    @Column(name = "strength")
    int strength;
    @Setter

    @Column(name = "agility")
    int agility;
    @Setter

    @Column(name = "skill")
    int skill;

    public int getPowerLevel(){
        return strength+agility+skill;
    }

    @Override
    public String toString() {
        return "Fighter{" + "name='" + name + "'}";
    }
}
