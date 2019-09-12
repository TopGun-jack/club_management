package com.gem.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ClubServiceTest {

    @Autowired
    ClubService clubService;

    @Test
    public void findAll() {
    }

    @Test
    public void modifyOrSave() {
//        Club club = new Club(null,"新点乒乓球俱乐部","张三", ClubType.PINGPONG,new Date(),"100","1000");
//        clubService.modifyOrSave(club);
    }

    @Test
    public void find() {
    }

    @Test
    public void out() {
    }

    @Test
    public void findByName() {

        System.out.println(clubService.findByName("新点羽毛球俱乐部"));
    }
}