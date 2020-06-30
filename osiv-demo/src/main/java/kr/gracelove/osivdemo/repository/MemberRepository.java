package kr.gracelove.osivdemo.repository;

import kr.gracelove.osivdemo.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Eunmo Hong
 * @since : 2020/06/30
 */

public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByName(String name);
}
