package com.gcs.ecommerce.dao;

import com.gcs.ecommerce.entity.ProdictCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProductCategoryRepository extends JpaRepository<ProdictCategory, Long> {
}
