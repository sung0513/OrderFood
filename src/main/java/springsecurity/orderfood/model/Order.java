package springsecurity.orderfood.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter@Setter
public class Order {

        @Id@GeneratedValue
        @Column(name = 'Order_id')
        private Long id;


        @ManyToOne
        @JoinColumn(name = "member_id")
        private Member member;

        private List<Orderfood> orderfoods = new ArrayList<>();




}
