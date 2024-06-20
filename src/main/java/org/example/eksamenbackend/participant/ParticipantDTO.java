package org.example.eksamenbackend.participant;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ParticipantDTO {

    private Long id;
    private String name;
    private String gender;
    private int age;
    private String club;
}
