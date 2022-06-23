package com.fibo.ddp.common.model.datax.datainterface.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors
public class InterfaceUpdateParent {
    private Long[] ids;//规则id
    private Long parentId;//文件夹id
}
