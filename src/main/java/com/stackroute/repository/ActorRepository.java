package com.stackroute.repository;

import com.stackroute.domain.Actor;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;


@Repository
public interface ActorRepository extends Neo4jRepository<Actor, Long> {
  //@Query annotation in Spring Data JPA to execute both JPQL and native SQL queries.
    @Query("MATCH (a:Actor)<-[r:RATED]-(m:Movie) RETURN a,r,m")
    Collection<Actor> getAllActor();
    @Query("CREATE(m:Movie)-[:RATED {rating: {rating}]->(a:Actor)")
    Actor setRelation(@Param("rating") int rating);
  }
