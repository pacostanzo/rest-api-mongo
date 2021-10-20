package com.costanzopa.restapimongo.model;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Student {
  @Id
  private String id;
  private String firstName;
  private String lastName;
  @Indexed(unique=true)
  private String email;
  private Gender gender;
  private Address address;
  private List<String> fovouriteSubjects;
  private BigDecimal totalSpentInBooks;
  private ZonedDateTime zonedDateTime;

}
