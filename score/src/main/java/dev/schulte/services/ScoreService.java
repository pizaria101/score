package dev.schulte.services;

import dev.schulte.entities.Score;

import java.util.List;

public interface ScoreService {

    List<Score> getAllScores();


    Score createScore(Score score);

    boolean deleteScoreById(int id);

}
