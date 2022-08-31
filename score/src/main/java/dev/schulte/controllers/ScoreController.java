package dev.schulte.controllers;

import dev.schulte.entities.Score;
import dev.schulte.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ScoreController {

    @Autowired
    ScoreService scoreService;

    @GetMapping("/scores")
    @ResponseBody
    public List<Score> allScores(){
        return this.scoreService.getAllScores();
    }


    @PostMapping("/scores")
    @ResponseBody
    public Score createScore(@RequestBody Score score){
        return this.scoreService.createScore(score);

    @DeleteMapping("/scores/{id}")
    @ResponseBody
    public String deleteScoreById(@RequestBody String id){
        int sId = Integer.parseInt(id);
        boolean isSuccessful = this.scoreService.deleteScoreById(sId);
        if(isSuccessful){
            return "Score was deleted";
        }else{
            return "FAILURE";
        }

    }
}
