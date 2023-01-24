package devcamp.ottogi.userservice.repository;

import devcamp.ottogi.userservice.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findMemberByName(String name);
    Optional<Member> findByEmail(String email);
    boolean existsByEmail(String email);
    Member findMemberByEmail(String email);

}
