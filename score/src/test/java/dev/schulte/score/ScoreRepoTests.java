package dev.schulte.score;

import dev.schulte.entities.Score;
import dev.schulte.repos.ScoreRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Transactional // any CRUD operations will not persist outside the test, all statements are rolled back
public class ScoreRepoTests {

    @Autowired
    ScoreRepo scoreRepo;

    @Test
    void add_score(){
        Score score = new Score(0,1000,"BBB");
        Score savedScore = this.scoreRepo.save(score);
        Assertions.assertNotEquals(0,savedScore.getId());
    }

    @Test
    void all_scores(){
        Score score = new Score(0,1000,"AAA");
        Score savedScore = this.scoreRepo.save(score);

        Score score1 = new Score(0,1000,"BBB");
        Score savedScore1 = this.scoreRepo.save(score1);

        Score score2 = new Score(0,1000,"CCC");
        Score savedScore2 = this.scoreRepo.save(score2);

        List<Score> scores = this.scoreRepo.findAll();
        System.out.println(scores);
        Assertions.assertEquals(3,scores.size());

    }
}
