package com.zero.api.version.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("v0")
    public Map<String, Object> showHelloWorldV0(){
        Map<String, Object> map = new HashMap<>();
        map.put("msg", "HelloWorld v0");
        return map;
    }

    //@GetMapping(params = "version=1")
    @GetMapping(value = "v1", produces = "application/vnd.company.app-v1+json")
    //@GetMapping(headers = "API-Version=1")
    public Map<String, Object> showHelloWorldV1(){
        Map<String, Object> map = new HashMap<>();
        map.put("msg", "HelloWorld v1");
        return map;
    }

    //@GetMapping(params = "version=2")
    @GetMapping(value = "v2", produces = "application/vnd.company.app-v2+json", consumes = MediaType.APPLICATION_JSON_VALUE)
    //@GetMapping(headers = "API-Version=2")
    public Map<String, Object> showHelloWorldV2(){
        Map<String, Object> map = new HashMap<>();
        map.put("msg", "HelloWorld v2");
        return map;
    }

}