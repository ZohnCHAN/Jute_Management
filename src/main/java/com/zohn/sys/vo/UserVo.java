package com.zohn.sys.vo;

import com.zohn.sys.entity.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author: zohn
 * @Date: 2021/12/2 8:21
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UserVo extends User {

    private Integer page=1;
    private Integer limit=10;

    /**
     * 验证码
     */
    private String code;
}
