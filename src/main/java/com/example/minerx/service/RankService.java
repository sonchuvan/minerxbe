package com.example.minerx.service;

import com.example.minerx.entity.Rank;
import com.example.minerx.repository.RankRepository;
import org.springframework.stereotype.Service;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RankService {

    private RankRepository rankRepository;

    public RankService(RankRepository rankRepository) {
        this.rankRepository = rankRepository;
    }

    public List<Rank> getAllRank(){
        return rankRepository.findAll().stream().sorted(Comparator.comparing(Rank::getTime)).collect(Collectors.toList());
    }

    public boolean saveRank(Rank rank){
        try {
            rankRepository.save(rank);
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
