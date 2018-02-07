package gd.codility.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import gd.codility.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
}