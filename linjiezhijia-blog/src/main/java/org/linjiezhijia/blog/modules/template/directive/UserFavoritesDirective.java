package org.linjiezhijia.blog.modules.template.directive;

import org.linjiezhijia.blog.modules.data.FavoriteVO;
import org.linjiezhijia.blog.modules.service.FavoriteService;
import org.linjiezhijia.blog.modules.template.DirectiveHandler;
import org.linjiezhijia.blog.modules.template.TemplateDirective;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

/**
 * 根据作者取收藏列表
 *
 * @author roilat-J
 * @since 3.0
 */
@Component
public class UserFavoritesDirective extends TemplateDirective {
	@Autowired
	private FavoriteService favoriteService;

	@Override
	public String getName() {
		return "user_favorites";
	}

	@Override
	public void execute(DirectiveHandler handler) throws Exception {
		long userId = handler.getInteger("userId", 0);
		Pageable pageable = wrapPageable(handler);

		Page<FavoriteVO> result = favoriteService.pagingByUserId(pageable, userId);
		handler.put(RESULTS, result).render();
	}

}
