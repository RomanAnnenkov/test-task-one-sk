package com.example.testTaskOneSk.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity
@Data
@Table(name = "sk_example_table")
public class Element {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "obj")
    @JdbcTypeCode(SqlTypes.JSON)
    private CurrentNumber currentNumber;
}
