package com.cricketlive.cricketlive.controller;


import com.cricketlive.cricketlive.service.CricketScoreService;
import com.cricketlive.cricketlive.model.CricketScore;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/scores")
public class CricketScoreController {

    @Autowired
    private CricketScoreService service;

    @Operation(summary = "Get all cricket scores")
    @GetMapping
    public List<CricketScore> getAllScores() {
        return service.getAllScores();
    }

    @Operation(summary = "Get cricket score by ID")
    @GetMapping("/{id}")
    public CricketScore getScoreById(@PathVariable Long id) {
        return service.getScoreById(id);
    }

    @Operation(summary = "Add or update cricket score")
    @PostMapping
    public CricketScore saveScore(@RequestBody CricketScore score) {
        return service.saveScore(score);
    }

    @Operation(summary = "Delete cricket score by ID")
    @DeleteMapping("/{id}")
    public void deleteScore(@PathVariable Long id) {
        service.deleteScore(id);
    }
}
