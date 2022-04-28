package org.progress.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Owner {

    @Id @GeneratedValue
    private long ownerId;
    private String firstName;
    private String lastName;
    private String email;

}
