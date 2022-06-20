package com.example.minerx.controller;

import com.example.minerx.entity.Rank;
import com.example.minerx.service.RankService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RankController {

    private RankService rankService;

    public RankController(RankService rankService) {
        this.rankService = rankService;
    }

    @GetMapping("/allRank")
    public List<Rank> getAllRank(){
        System.out.println(rankService.getAllRank().get(0).toString());
        return rankService.getAllRank();
    }

    @PostMapping("/saveRank")
    public boolean saveRank(@RequestBody Rank rank){
        return rankService.saveRank(rank);
    }
}
