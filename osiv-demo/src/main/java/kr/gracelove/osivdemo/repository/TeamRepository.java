package kr.gracelove.osivdemo.repository;

import kr.gracelove.osivdemo.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Eunmo Hong
 * @since : 2020/06/30
 */

public interface TeamRepository extends JpaRepository<Team, Long> {
    Team findByTeamName(String teamName);
}
