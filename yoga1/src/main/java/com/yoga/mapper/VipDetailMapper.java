package com.yoga.mapper;

import com.yoga.entity.VipDetail;
import com.yoga.entity.VipDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VipDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_detail
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    long countByExample(VipDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_detail
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int deleteByExample(VipDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_detail
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int deleteByPrimaryKey(Integer useId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_detail
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int insert(VipDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_detail
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int insertSelective(VipDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_detail
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    List<VipDetail> selectByExample(VipDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_detail
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    VipDetail selectByPrimaryKey(Integer useId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_detail
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int updateByExampleSelective(@Param("record") VipDetail record, @Param("example") VipDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_detail
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int updateByExample(@Param("record") VipDetail record, @Param("example") VipDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_detail
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int updateByPrimaryKeySelective(VipDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_detail
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int updateByPrimaryKey(VipDetail record);
}