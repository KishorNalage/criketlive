package com.cricketlive.cricketlive.repository;


import com.cricketlive.cricketlive.model.CricketScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CricketScoreRepository extends JpaRepository<CricketScore, Long> {
}
