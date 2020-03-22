package com.zx.common.validator;

import com.zx.common.CodeMsg;
import com.zx.common.exception.BussiException;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

/**
 * 公司：武汉尚学堂
 * 作者：Mr.T
 * 类名：Validator
 * 描述: 数据校验器  校验数据是否合法
 *      主要用 Controller 层校验数据是否负责规范
 *      值类型  范围  格式  长度 等等
 * 时间：2020-03-20
 */
public class ValidatorUtil {
    //校验器对象
    private static final Validator  validator;

    static {
        //构建一个校验器
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    /**
     *  进行form 数据校验
     * @param form 更新时 提交的数据
     */
    public static void validate(Object form){
        // 如果校验不通过的异常信息的集合
        Set<ConstraintViolation<Object>> msgs = validator.validate(form);
        for (ConstraintViolation<Object> msg : msgs) {
            //校验不通过的原因
            String message = msg.getMessage();
            //主动抛出异常  让 异常处理器进行处理
            throw  new BussiException(CodeMsg.PARAM_VALIDATE_ERROR.CODE,CodeMsg.PARAM_VALIDATE_ERROR.MSG+message);
        }
    }

}
