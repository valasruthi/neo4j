package com.stackroute.repository;

import com.stackroute.domain.Movie;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface MovieRepository extends Neo4jRepository<Movie,Long> {
}
