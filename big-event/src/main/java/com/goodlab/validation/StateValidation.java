package com.goodlab.validation;

import com.goodlab.anno.State;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class StateValidation  implements ConstraintValidator<State, String> {
    /**
     * 校验方法
     * @param value 将来要校验的数据
     * @param context 校验上下文，用于自定义错误消息、禁用默认错误消息、添加额外的约束违规信息等
     *
     *
     * @return 校验结果 true:通过  false:失败
     *
     */
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // 提供校验规则
        if(value == null){
            return false;
        }
        if(value.equals("已发布")|| value.equals("草稿")){
            return true;
        }
        return false;

    }
    
    
    
}
