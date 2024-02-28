package lk.ijse.SathsaraMoters.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.loading.ClassReloadingStrategy;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name = "User")
public class User {

//    @Id
//    @Column(name = "user_id")
//    @GeneratedValue (strategy = GenerationType.SEQUENCE)
//    private int userId;
    @Id
    @Column(name = "user_name")
    private String userName;

    @Column(name = "passsword")
    private String password;
}
