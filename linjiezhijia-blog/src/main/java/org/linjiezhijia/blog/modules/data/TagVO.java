package org.linjiezhijia.blog.modules.data;

import java.io.Serializable;

import org.linjiezhijia.blog.modules.entity.Tag;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author : roilat-J
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TagVO extends Tag implements Serializable {
	private static final long serialVersionUID = -7787865229252467418L;

	private PostVO post;
}
