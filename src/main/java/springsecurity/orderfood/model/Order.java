package springsecurity.orderfood.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter@Setter
@Table(name = "orderlist")
public class Order<Totaltime> {

        @Id@GeneratedValue
        @Column(name = 'Order_id')
        private Long id;


        @ManyToOne
        @JoinColumn(name = "member_id")
        private Member member;

        @OneToMany(mappedBy = "orderfood")
        private List<Orderfood> orderfoods = new ArrayList<>();

        @OneToOne
        @JoinColumn(name = "delivery_id")
        private Delivery delivery;


        private Totaltime totaltime;

        @Enumerated(EnumType.STRING)
        private OrderStatus status;



}
