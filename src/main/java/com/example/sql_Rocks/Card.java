package com.example.sql_Rocks;

import jakarta.persistence.*;

@Entity
@Table(name = "library_card")
public class Card {
    @Id
    private int cardNo;

    private int fine;

    private int bookIssued;

    @OneToOne
    @JoinColumn()
    User user;

    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;
}
