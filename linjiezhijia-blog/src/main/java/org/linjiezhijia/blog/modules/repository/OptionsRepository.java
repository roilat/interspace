package org.linjiezhijia.blog.modules.repository;

import org.linjiezhijia.blog.modules.entity.Options;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author roilat-J
 */
public interface OptionsRepository extends JpaRepository<Options, Long>, JpaSpecificationExecutor<Options> {
	Options findByKey(String key);
}
