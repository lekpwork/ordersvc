package com.le.work.model.mapper;


import com.le.work.model.data.UserDO;
import com.le.work.model.data.UserDOExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cq_user
     *
     * @mbg.generated
     */
    long countByExample(UserDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cq_user
     *
     * @mbg.generated
     */
    int deleteByExample(UserDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cq_user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cq_user
     *
     * @mbg.generated
     */
    int insert(UserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cq_user
     *
     * @mbg.generated
     */
    int insertSelective(UserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cq_user
     *
     * @mbg.generated
     */
    List<UserDO> selectByExample(UserDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cq_user
     *
     * @mbg.generated
     */
    UserDO selectByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cq_user
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") UserDO record, @Param("example") UserDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cq_user
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") UserDO record, @Param("example") UserDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cq_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(UserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cq_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UserDO record);
}