package kr.co.rland.boot3.repository;

import kr.co.rland.boot3.entity.RcmdMenuView;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RcmdMenuRepository {
    List<RcmdMenuView> findAllByMenuId(Long id);
}
