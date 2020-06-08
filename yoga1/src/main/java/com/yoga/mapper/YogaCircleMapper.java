package com.yoga.mapper;

import com.yoga.entity.YogaCircle;
import com.yoga.entity.YogaCircleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YogaCircleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yoga_circle
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    long countByExample(YogaCircleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yoga_circle
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int deleteByExample(YogaCircleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yoga_circle
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int deleteByPrimaryKey(Integer yogaCircleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yoga_circle
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int insert(YogaCircle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yoga_circle
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int insertSelective(YogaCircle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yoga_circle
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    List<YogaCircle> selectByExample(YogaCircleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yoga_circle
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    YogaCircle selectByPrimaryKey(Integer yogaCircleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yoga_circle
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int updateByExampleSelective(@Param("record") YogaCircle record, @Param("example") YogaCircleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yoga_circle
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int updateByExample(@Param("record") YogaCircle record, @Param("example") YogaCircleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yoga_circle
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int updateByPrimaryKeySelective(YogaCircle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yoga_circle
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int updateByPrimaryKey(YogaCircle record);
}