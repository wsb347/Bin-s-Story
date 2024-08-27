package com.example.binsstory;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "`member`")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    @Column(length = 45, nullable = false, unique = true)
    private String email;

    private String password;

    private String nickname;

    private String img;

}