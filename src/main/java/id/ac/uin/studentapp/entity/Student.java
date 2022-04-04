package id.ac.uin.studentapp.entity;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@Table(name = "student")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty (message = "First Name is required")
    @Column(name = "first_name")
    private String firstName;

    @NotEmpty (message = "Last Name is required")
    @Column(name = "last_name")
    private String lastName;

    @NotEmpty (message = "Email is required")
    @Column(name = "email", unique = true)
    private String email;

    @NotEmpty (message = "Phone Number is required")
    @Column(name = "phone_number", unique = true)
    private String phoneNumber;

    @NotEmpty(message = "Jurusan is required")
    @Column(nullable = false, unique = true)
    private String jurusan;
}