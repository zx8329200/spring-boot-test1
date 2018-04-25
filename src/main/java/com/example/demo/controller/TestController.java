package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huwei on 2018/4/25.
 */
@RestController
@RequestMapping("test")
public class TestController {

  @RequestMapping("list")
  public List<String> list() {
    List<String> list = new ArrayList<>();
    list.add("aaa");
    list.add("bbb");
    return list;
  }
}
