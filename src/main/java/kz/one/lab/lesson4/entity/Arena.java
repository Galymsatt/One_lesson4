package kz.one.lab.lesson4.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Component
@Getter
@Setter
@Entity
@Table(name = "t_arenas")
public class Arena {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

//    @Builder.Default
    @OneToMany(fetch = FetchType.LAZY)
    List<Fighter> fighters;

//    List<Fighter> fighters = new ArrayList<>();

//    public List<Fighter> getFighters() {//Jpa eto zameniaet
//        return fighters;
//    }

}
