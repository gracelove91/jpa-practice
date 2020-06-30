package kr.gracelove.osivdemo.domain;

import lombok.*;

import javax.persistence.*;

/**
 * @author : Eunmo Hong
 * @since : 2020/06/30
 */

@ToString(of = "name")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id")
    private Team team;

    @Builder
    public Member(String name, Team team) {
        this.name = name;
        this.team = team;
    }


}
