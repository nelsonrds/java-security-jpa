package dev.nelson.securityjpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="users")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {
    @Id @GeneratedValue
    private Long id;
    private String username;
    private String password;
    private String roles;

    public User(String username, String password, String roles){
        this.username = username;
        this.password = password;
        this.roles = roles;
    }
}
