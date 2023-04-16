package com.code.jewelleryshop.repo;

import com.code.jewelleryshop.entity.Jewellery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JewelleryRepository extends JpaRepository<Jewellery, Integer>
{

}
