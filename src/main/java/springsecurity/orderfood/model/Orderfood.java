package springsecurity.orderfood.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter@Setter
@Table(name = "orderfood")
public class Orderfood {


    @Id@GeneratedValue
    @Column(name = "orderfood_id")
    private Long id;

    private String;

}
