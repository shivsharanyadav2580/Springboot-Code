package com.crm.controller;

import com.crm.entity.Customer;
import com.crm.repository.CustomerRepository;
import jakarta.persistence.Lob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private CustomerRepository repo;

    @GetMapping("/")
    public String showCustomer(Model model) {

        List<Customer> customers = repo.findAll();

        model.addAttribute("customers", customers);

        return "index";
    }

    @GetMapping("/addCustomer")
    public String showForm(Model model) {

        model.addAttribute("customer", new Customer());

        return "add-customer";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute Customer customer) {

        repo.save(customer);

        return "redirect:/";
    }
    @GetMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable Long id){
        repo.deleteById(id);
        return "redirect:/";
    }
    @GetMapping("/edit/{id}")
    public String editCustomer(@PathVariable Long id , Model model){
        Customer customer = repo.findById(id).orElse(null);
        model.addAttribute("customer" , customer);
        return "add-customer";
    }

}