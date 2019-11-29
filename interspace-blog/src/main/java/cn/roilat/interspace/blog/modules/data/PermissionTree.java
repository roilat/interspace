package cn.roilat.interspace.blog.modules.data;

import cn.roilat.interspace.blog.modules.entity.Permission;

import java.util.LinkedList;
import java.util.List;

/**
 * @author - roilat-J on 2018/2/11
 */
public class PermissionTree extends Permission {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8701243904235420273L;
	private List<PermissionTree> items;

	public List<PermissionTree> getItems() {
		return items;
	}

	public void setItems(List<PermissionTree> items) {
		this.items = items;
	}

	public void addItem(PermissionTree item) {
		if (this.items == null) {
			this.items = new LinkedList<>();
		}
		this.items.add(item);
	}
}
