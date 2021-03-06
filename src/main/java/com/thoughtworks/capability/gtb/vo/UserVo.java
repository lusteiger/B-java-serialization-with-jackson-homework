package com.thoughtworks.capability.gtb.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVo {
  @JsonProperty(value = "userid")
  private String id;
  @JsonProperty(value = "username")
  private String name;
}
