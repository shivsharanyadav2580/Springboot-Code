package com.telusko.service;

import com.telusko.entity.Tourist;

import java.util.List;

public interface IStudentService {
    public String addTourist(Tourist tourist);
    public String UpdateTourist(Integer id , Integer cost);
    public String updateTourist(Tourist tourist);
    public String deleteTourist(Integer id);
    public Tourist getTourist(Integer id);
    public List<Tourist> getAllTourist();
}
