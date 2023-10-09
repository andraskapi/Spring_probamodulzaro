package hu.progmatic.spring_probamodulzaro.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class People {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column (name = "place_of_birth")
    private String placeOfBirth;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column (name = "date_of_birth")
    private Date dateOfBirth;
    private String email;
}
