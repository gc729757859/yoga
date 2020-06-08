package com.yoga.mapper;

import com.yoga.entity.VipGrade;
import com.yoga.entity.VipGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VipGradeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_grade
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    long countByExample(VipGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_grade
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int deleteByExample(VipGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_grade
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int deleteByPrimaryKey(Integer gradeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_grade
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int insert(VipGrade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_grade
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int insertSelective(VipGrade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_grade
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    List<VipGrade> selectByExample(VipGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_grade
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    VipGrade selectByPrimaryKey(Integer gradeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_grade
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int updateByExampleSelective(@Param("record") VipGrade record, @Param("example") VipGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_grade
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int updateByExample(@Param("record") VipGrade record, @Param("example") VipGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_grade
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int updateByPrimaryKeySelective(VipGrade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_grade
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int updateByPrimaryKey(VipGrade record);
}