package com.stackroute.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

//@NodeEntity will be represented as nodes in the graph.
@NodeEntity
//@Data is a convenient shortcut annotation that bundles the features of @ToString, @EqualsAndHashCode, @Getter / @Setter and @RequiredArgsConstructor together:
@Data
//An all-args constructor requires one argument for every field in the class.
@AllArgsConstructor
//@NoArgsConstructor will generate a constructor with no parameters.
@NoArgsConstructor
//@ToString to let lombok generate an implementation of the toString() method.
@ToString

public class Movie {
  @Id
  private long id;
  private String title;
  private String director;
}
