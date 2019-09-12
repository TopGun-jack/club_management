package com.gem.controller;

import com.gem.entity.Club;
import com.gem.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author 张文涛
 * @date 2019/9/11/011 11:20
 */
@Controller
public class ClubController {
    @Autowired
    ClubService clubService;

    /**
     * 数据异步加载
     */
    @GetMapping("/getClub")
    public String getClub(Model model) {
        model.addAttribute("clubs", clubService.findAll());
        return "club/data";
    }

    /**
     * 去往添加页面
     */
    @GetMapping("/club")
    public String toAdd() {
        return "add";
    }

    /**
     * 添加
     */
    @PostMapping("/club")
    public String save(Club club, Model model) {
        try {
            clubService.modifyOrSave(club);
            model.addAttribute("message", "添加成功");
        } catch (Exception e) {
            model.addAttribute("message", "添加失败，请检查网络连接！");
        }
        return "club/list";
    }


    /**
     * 删除
     */
    @DeleteMapping("/club/{id}")
    @ResponseBody
    public String delete(@PathVariable("id") Long id) {
        try {
            clubService.out(id);
            return "1";
        } catch (Exception e) {
            return "0";
        }
    }

    /**
     * 去往修改页面
     */
    @GetMapping("/club/{id}")
    public String getClub(@PathVariable("id") Long id, Model model) {
        model.addAttribute("club", clubService.find(id));
        return "add";
    }

    /**
     * 修改
     */
    @PutMapping("/club")
    public String update(Club club, Model model) {
        try {
            clubService.modifyOrSave(club);
            model.addAttribute("message", "修改成功！");
        } catch (Exception e) {
            model.addAttribute("message", "您的网络连接有问题！");
        }

        return "club/list";
    }

    @GetMapping("/getClubName")
    @ResponseBody
    public String getClub(String name) {
        if (clubService.findByName(name) != null) {
            return "1";
        }
        return "0";
    }


}
