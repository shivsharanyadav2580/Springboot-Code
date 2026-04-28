package com.telusko.service;

import com.telusko.entity.Tourist;
import com.telusko.exception.TouristNotFoundException;
import com.telusko.repo.ITouristRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private ITouristRepo repo;

    @Override
    public String addTourist(Tourist tourist) {
        Tourist toristDb = repo.save(tourist);


        return "Tourist save with this " + toristDb.getId();
    }

    @Override
    public String UpdateTourist(Integer id, Integer cost) {
        Optional<Tourist> optional = repo.findById(id);
        if (optional.isPresent()) {
            Tourist touristDb = optional.get();
            touristDb.setCost(cost);
            repo.save(touristDb);
            return "Tourist cost update succesfully for this id " + id;

        }
        throw new TouristNotFoundException("Tourist with id not found " + id);

    }

    @Override
    public String updateTourist(Tourist tourist) {
        Tourist touristDb = repo.findById(tourist.getId()).orElseThrow(() -> new TouristNotFoundException("Tourist with this id is not present " + tourist.getId()));

        touristDb.setName(tourist.getName());
        touristDb.setId(tourist.getId());
        touristDb.setCost(tourist.getId());
        repo.save(tourist);
        return "Tourist  info update succefully with this id  " + tourist.getId();
    }


    @Override
    public String deleteTourist(Integer id) {
        Optional<Tourist> optional = repo.findById(id);
        if (optional.isPresent()) {
            repo.deleteById(id);
            return "Tourist with this id is deleted " + id;
        }
        throw new TouristNotFoundException("Tourist not found exception");


    }

    @Override
    public Tourist getTourist(Integer id) {
        Optional<Tourist> optional = repo.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        }
        throw new TouristNotFoundException("Tourist not found with this id" + id);
    }

    @Override
    public List<Tourist> getAllTourist() {
        return repo.findAll();

    }
}
