package com.yoga.mapper;

import com.yoga.entity.Comment;
import com.yoga.entity.CommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    long countByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int deleteByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int deleteByPrimaryKey(Integer commentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int insert(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int insertSelective(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    List<Comment> selectByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    Comment selectByPrimaryKey(Integer commentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int updateByPrimaryKeySelective(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    int updateByPrimaryKey(Comment record);
}