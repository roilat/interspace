<#include "/classic/inc/layout.ftl"/>
<@layout "修改用户信息">

<div class="panel panel-default stacked">
	<div class="panel-heading">
		<ul class="nav nav-pills account-tab">
			<li class="active"><a href="profile">基本信息</a></li>
            <li><a href="email">修改邮箱</a></li>
			<li><a href="avatar">修改头像</a></li>
			<li><a href="password">修改密码</a></li>
		</ul>
	</div>
	<div class="panel-body">
		<div id="message">
		<#include "/classic/inc/action_message.ftl"/>
		</div>
		<div class="tab-pane active" id="profile">
			<form id="submitForm" action="profile" method="post" class="form-horizontal">
				<div class="form-group">
					<label class="control-label col-lg-3" for="username">登录名</label>
					<div class="col-lg-4">
						<input type="text" class="form-control" name="username" value="${view.username}" maxlength="20" readonly="true">
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-3" for="name">昵称</label>
					<div class="col-lg-4">
						<input type="text" class="form-control" name="name" value="${view.name}" maxlength="15" required>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-3" for="gender">性别</label>
					<div class="col-lg-4">
						<select class="form-control" name="gender" data-select="${view.gender}" >
							<option value="0">--</option>
							<option value="2">男</option>
							<option value="1">女</option>
						</select>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-3" for="nickname">个性签名</label>
					<div class="col-lg-6">
						<textarea name="signature" class="form-control" rows="3" maxlength="128">${view.signature}</textarea>
					</div>
				</div>
				<div class="form-group">
					<div class="text-center">
						<button type="submit" class="btn btn-primary">提交</button>
					</div>
				</div><!-- /form-actions -->
			</form>
		</div>
	</div><!-- /panel-content -->
</div><!-- /panel -->

<script type="text/javascript">
    seajs.use('validate', function (validate) {
        validate.updateProfile('#submitForm');
    });
</script>
</@layout>