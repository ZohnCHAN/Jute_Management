package com.zohn.bus.vo;

import com.zohn.bus.entity.Sales;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author: zohn
 * @Date: 2021/12/18 10:29
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SalesVo extends Sales {

    private Integer page = 1;

    private Integer limit = 10;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endTime;

}
