    package com.example.corsi.entity;

    import lombok.Data;

    import javax.persistence.*;
    import java.util.HashSet;
    import java.util.Set;


    @Data
    @Entity
    @Table(name = "users")
    public class User {

        @Id
        @Column(name = "user_id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String username;
        private String password;
        private boolean enabled;

        @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
        @JoinTable(
                name = "users_roles",
                joinColumns = @JoinColumn(name = "user_id"),
                inverseJoinColumns = @JoinColumn(name = "role_id")
        )
        private Set<Role> roles = new HashSet<>();


        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", username='" + username + '\'' +
                    ", password='" + password + '\'' +
                    ", enabled=" + enabled +
                    ", roles=" + roles +
                    '}';
        }
    }
