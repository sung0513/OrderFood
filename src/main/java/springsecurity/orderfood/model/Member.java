package springsecurity.orderfood.model;


import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter@Setter
public class Member {

    @Id@GeneratedValue
    @Column(name = "member_id")
    private Long id;

    @Column(name = "member_name")
    private String name;

    @Column(name = "member_address")
    @Embedded
    private Address address;

    @Column(name = "member_coupon")
    @Embedded
    private  Coupon coupon;

    @OneToMany(mappedBy = "member")
    private List<Order> orders= new ArrayList<>();



}
