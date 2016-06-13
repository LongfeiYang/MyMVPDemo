package com.favor.mymvpdemo.usecase;

/**
 * author： Longfei Yang on 2016/6/13.
 * email：yanglongfei@yuanchuangyun.com
 */
public class LoginUseCase {
    public boolean isUser(String name){
        return "admin".equals(name);
    }
}
