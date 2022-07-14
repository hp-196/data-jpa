package studyJpa.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import studyJpa.datajpa.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {


}
