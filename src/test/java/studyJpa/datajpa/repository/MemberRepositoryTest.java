package studyJpa.datajpa.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import studyJpa.datajpa.entity.Member;

import java.util.Optional;

@SpringBootTest
@Transactional
@Rollback(value = false)
class MemberRepositoryTest {

    @Autowired MemberRepository memberRepository;

    @Test
    public void test() {
        Member member = new Member();
        member.setUsername("sex");
        Member save = memberRepository.save(member);

        Member byId = memberRepository.findById(save.getId()).get();

        Assertions.assertThat(byId.getId()).isEqualTo(save.getId());
    }

}