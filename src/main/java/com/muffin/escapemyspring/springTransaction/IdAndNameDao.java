package com.muffin.escapemyspring.springTransaction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdAndNameDao extends JpaRepository<IdAndName,Long> {
}
