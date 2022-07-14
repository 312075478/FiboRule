package com.fibo.ddp.common.model.datax.datainterface.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors
@TableName("t_field_interface")
public class InterfaceVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id; //接口id

    private String name;    //接口名称

    private String url; //请求地址

    private String method;  //请求方法

    private String requestHeaders;    //请求体类型

    private String requestBody; //请求参数体

    private String bindParam; //绑定参数

    private String responseBody;    //请求响应体

    private Long creator; //创建者

    private Long modifier; //修改者

    private Long organId; //企业编号

    private Long status; //请求状态

    private Date createTime; //创建时间

    private Date updateTime; //更新时间

    private String requestType;

    @TableField(exist = false)
    private String username; //用户名

    @TableField(exist = false)
    private String creatorName; //创建者姓名

    @TableField(exist = false)
    private String modifierName; //修改者姓名



}
