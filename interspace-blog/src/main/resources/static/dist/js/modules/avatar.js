/*
+--------------------------------------------------------------------------
|   lijiezhijia-blog [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2019 interspace. All Rights Reserved
|   http://www.roilat.cn
|
+---------------------------------------------------------------------------
*/

define(function(require, exports, module) {
	J = jQuery;
	require('plugins');

	var upload_url = _INTERSPACE_BLOG.BASE_PATH + '/settings/avatar';

	$('#upload_btn').change(function(){
		$(this).upload(upload_url, function(data){
            if (data.status == 200) {
				window.location.reload();
			} else {
                layer.msg(data.message, {icon: 5});
			}
		});
	});
	
});