package com.dalia.ProjetoDalia.Entity.Users;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;

@Document(collection = "search")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Search {

    private int age;
    private boolean regularMenstruation;
    private boolean useContraceptive;
    private String contraceptiveType;
    @Field(name = "lastMenstruationDay")
    private LocalDate lastMenstruationDay;
    private Integer menstruationDuration = 5;
    private int cycleDuration;
}