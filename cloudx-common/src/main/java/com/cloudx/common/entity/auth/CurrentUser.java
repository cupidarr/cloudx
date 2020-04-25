package com.cloudx.common.entity.auth;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

/**
 * @author chachae
 * @since 2020/4/14 20:49
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurrentUser implements Serializable {

  private static long serialVersionUID = 761748087824726463L;

  @JsonIgnore
  private String password;
  @JsonIgnore
  private Set<GrantedAuthority> authorities;
  private boolean accountNonExpired;
  private boolean accountNonLocked;
  private boolean credentialsNonExpired;
  private boolean enabled;
  private String userInfoId;
  private String userName;
  private String fullName;
  private String sex;
  private String avatar;
  private String email;
  private String mobile;
  private String qqNumber;
  private String profile;
  private Date birthday;
  private String blogAddress;
  private Date createTime;
  private Date updateTime;
  private Date lastLoginTime;
  private String lastLoginIp;
  private Integer deptId;
}
