package devcamp.ottogi.userservice.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@RedisHash("refresh_token")
public class RefreshToken {

    //    @Column(name = "rt_key")
    @Id
    private String key; // member Id 값이 들어감

    //    @Column(name = "rt_value")
    private String value; // Refresh Token String 들어감
//
//        @Column(name = "created_at")
//    private LocalDateTime createdAt;
//        @Column(name = "updated_at")
//    private LocalDateTime updatedAt;
//
//    @PrePersist
//    public void createdAt() {
//        this.createdAt = LocalDateTime.now();
//        this.updatedAt = createdAt;
//    }
//
//    @PreUpdate
//    public void updatedAt() {
//        this.updatedAt = LocalDateTime.now();
//    }

    @Builder
    public RefreshToken(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public RefreshToken updateValue(String token) {
        this.value = token;
        return this;
    }
}
