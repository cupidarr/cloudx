package com.cloudx.auth.service;

/**
 * 验证码接口 1
 *
 * @author chachae
 * @since 2020/4/25 23:04
 */
public interface ICaptchaService {

  /**
   * 创建验证码
   *
   * @return 验证码 Base64 编码
   */
  String create();

  /**
   * 校验验证码
   *
   * @param key  验证码key
   * @param text 用户输入值
   */
  void validateCode(String key, String text);
}
