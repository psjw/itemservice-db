package hello.itemservice.repository.v2;

import hello.itemservice.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItempRepositoryV2 extends JpaRepository<Item, Long> {
}
