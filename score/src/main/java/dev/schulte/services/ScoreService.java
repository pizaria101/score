package dev.schulte.services;

import dev.schulte.entities.Score;

import java.util.List;

public interface ScoreService {

    List<Score> getAllScores();

    boolean deleteScoreById(int id);
}
