package com.gem.dao;

import com.gem.entity.Club;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 张文涛
 * @date 2019/9/11/011 10:43
 */

public interface ClubDao extends JpaRepository<Club,Long> {
}
