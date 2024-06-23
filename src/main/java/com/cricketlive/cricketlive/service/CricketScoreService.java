package com.cricketlive.cricketlive.service;

import com.cricketlive.cricketlive.model.CricketScore;
import com.cricketlive.cricketlive.repository.CricketScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CricketScoreService {

    @Autowired
    private CricketScoreRepository repository;

    public List<CricketScore> getAllScores() {
        return repository.findAll();
    }

    public CricketScore getScoreById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public CricketScore saveScore(CricketScore score) {
        return repository.save(score);
    }

    public void deleteScore(Long id) {
        repository.deleteById(id);
    }
}