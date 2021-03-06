package cn.roilat.interspace.blog.modules.repository;

import cn.roilat.interspace.blog.modules.entity.SecurityCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author roilat-J on 2015/8/14.
 */
public interface SecurityCodeRepository
		extends JpaRepository<SecurityCode, Long>, JpaSpecificationExecutor<SecurityCode> {
	SecurityCode findByKeyAndType(String key, int type);

	SecurityCode findByKey(String key);
}
