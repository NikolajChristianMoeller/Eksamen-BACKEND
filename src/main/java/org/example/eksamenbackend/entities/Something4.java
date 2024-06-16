package org.example.eksamenbackend.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="something4")
public class Something4 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
}