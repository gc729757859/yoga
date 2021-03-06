package com.yoga.mapper;

import com.yoga.entity.VenueCourse;
import com.yoga.entity.VenueCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VenueCourseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venue_course
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    long countByExample(VenueCourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venue_course
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int deleteByExample(VenueCourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venue_course
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int deleteByPrimaryKey(Integer courseid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venue_course
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int insert(VenueCourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venue_course
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int insertSelective(VenueCourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venue_course
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    List<VenueCourse> selectByExample(VenueCourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venue_course
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    VenueCourse selectByPrimaryKey(Integer courseid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venue_course
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int updateByExampleSelective(@Param("record") VenueCourse record, @Param("example") VenueCourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venue_course
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int updateByExample(@Param("record") VenueCourse record, @Param("example") VenueCourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venue_course
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int updateByPrimaryKeySelective(VenueCourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venue_course
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int updateByPrimaryKey(VenueCourse record);
}