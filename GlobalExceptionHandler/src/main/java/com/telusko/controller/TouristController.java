package com.telusko.controller;


import com.telusko.entity.Tourist;
import com.telusko.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tourist")
public class TouristController {
    @Autowired
    private IStudentService service;
    @PostMapping("/save")
    public ResponseEntity<String> addTourist(@RequestBody Tourist tourist){
        String response = service.addTourist(tourist);
        return new ResponseEntity<String>(response , HttpStatus.CREATED);


    }

    @PatchMapping("/updateCost/{id}/{cost}")
    public ResponseEntity<String> updateTouristCost(@PathVariable("id") Integer id ,
                                                @PathVariable("cost") Integer cost){
        String response = service.UpdateTourist(id, cost);
        return new ResponseEntity<String>(response , HttpStatus.CREATED);

    }
    @PutMapping("/updateTourist")
    public ResponseEntity<String> updateTourist(@RequestBody Tourist tourist){
        String response = service.updateTourist(tourist);
        return new ResponseEntity<String>(response , HttpStatus.CREATED);
    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteTourist(@PathVariable("id") Integer id){
        String response = service.deleteTourist(id);
        return new ResponseEntity<String>(response , HttpStatus.OK);
    }
    @GetMapping("/getTourist/{id}")
    public ResponseEntity<?> getTourist(@PathVariable("id") Integer id){
        Tourist response = service.getTourist(id);
        return new ResponseEntity<>(response , HttpStatus.OK);
    }
    @GetMapping("/getTourist")
    public ResponseEntity<?> getTourist(){
        return new ResponseEntity<>(service.getAllTourist() , HttpStatus.OK);
    }

}
