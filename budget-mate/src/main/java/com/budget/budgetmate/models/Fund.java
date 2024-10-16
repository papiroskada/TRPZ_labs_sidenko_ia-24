package com.budget.budgetmate.models;

import jakarta.persistence.*;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Fund {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Double balance;

    @ManyToMany
    private List<Account> accounts;

}
