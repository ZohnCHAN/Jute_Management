package com.zohn.sys.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * json数据实体
 * @Author: zohn
 * @Date: 2021/12/22 15:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataGridView {

    private Integer code=0;
    private String msg="";
    /**
     * 返回的记录总条数
     */
    private Long count=0L;
    /**
     * 返回的记录
     */
    private Object data;

    public DataGridView(Long count, Object data) {
        this.count = count;
        this.data = data;
    }

    public DataGridView(Object data) {
        this.data = data;
    }
}
