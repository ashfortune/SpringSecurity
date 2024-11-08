package kr.co.rland.boot3.repository;

import kr.co.rland.boot3.entity.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberRepository {
    Member findByUserName(String userName);


}
