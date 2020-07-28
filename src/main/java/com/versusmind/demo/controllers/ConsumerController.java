package com.versusmind.demo.controllers;

import com.versusmind.demo.configurations.MailConfiguration;
import com.versusmind.demo.repositories.ConsumerRepository;
import com.versusmind.demo.entities.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsumerController {

    @Autowired
    private ConsumerRepository _repositry;

    @Autowired
    private MailConfiguration _config;

    @RequestMapping("/")
    public List<Consumer> index() {
        return _repositry.findAll();
    }

    @RequestMapping("/config")
    public String config() {
        return "HostName : " + _config.getHostname() + " : " + _config.getPort();
    }
}