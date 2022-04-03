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
    @Column(nullable = false,name = "first_name")
    private String firstName;

    @NotEmpty (message = "Last Name is required")
    @Column(nullable = false,name = "last_name")
    private String lastName;

    @NotEmpty (message = "Email is required")
    @Column(nullable = false,name = "email", unique = true)
    private String email;

    @NotEmpty (message = "Phone number is required")
    @Column(nullable = false,name = "phone_number", unique = true)
    private String phoneNumber;

    @NotEmpty (message = "Jurusan is required")
    @Column(nullable = false,name = "jurusan", unique = true)
    private String jurusan;

}
