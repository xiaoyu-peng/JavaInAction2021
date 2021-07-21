package com.xhh.DesignPatterns.Creation_Mode_6.D005_PrototypePatterns;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchWord {
  private String keyword;
  private Long count;
  private Long lastUpdateTime;
}
