package mikezgarcia.bediscussion2.repository;

import mikezgarcia.bediscussion2.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<UsersEntity, BigInteger> {
    List<UsersEntity> findAllBy();
    UsersEntity findByEmail(String email);

}
