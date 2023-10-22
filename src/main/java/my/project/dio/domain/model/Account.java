package my.project.dio.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_account")
public class Account {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String nickname;

    private Integer level;
    
    public String getNickname() {
        return nickname;
    }
    public int getLevel() {
        return level;
    }
    public Long getId() {
        return id;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public void setId(Long id) {
        this.id = id;
    }

    
}