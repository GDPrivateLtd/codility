package gd.codility.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import gd.codility.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}