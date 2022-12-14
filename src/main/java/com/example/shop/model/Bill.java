package com.example.shop.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
//import jakarta.persistence.*;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private int amount;

    private int total;

    @Column(name = "buy_date")
    private Date buyDate;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_footwear")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Footwear footwear;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_user")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private User user;

}
