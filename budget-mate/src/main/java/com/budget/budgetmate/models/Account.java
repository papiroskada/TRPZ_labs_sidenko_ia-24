package com.budget.budgetmate.models;

import jakarta.persistence.*;
import com.budget.budgetmate.models.User;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Double balance;

    @Setter
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    public void updateBalance(Double amount) {
        this.balance += amount;
    }

    public void resetBalance() {
        this.balance = 0.0;
    }

}
