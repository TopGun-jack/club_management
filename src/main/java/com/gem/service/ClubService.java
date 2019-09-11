package com.gem.service;

import com.gem.dao.ClubDao;
import com.gem.entity.Club;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * @author 张文涛
 * @date 2019/9/11/011 10:46
 * club 业务类
 */
@Service
@Transactional
public class ClubService {

  @Autowired
  ClubDao clubDao;

  /**
   *  查询所有
   */
  public List<Club> findAll(){
    return clubDao.findAll();
  }

  /**
   * 添加或者修改
   */
  public void modifyOrSave(Club club){
    clubDao.save(club);
  }

  /**
   *  按id查询
   */
  public Club find(Long id){
    Optional<Club> clubOptional = clubDao.findById(id);
    return clubOptional.get();
  }

  /**
   * 按id删除
   */
  public void out(Long id){
    clubDao.deleteById(id);
  }

}
