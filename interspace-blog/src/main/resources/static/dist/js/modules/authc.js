/*
 +--------------------------------------------------------------------------
 |   lijiezhijia-lijiezhijia-blog [#RELEASE_VERSION#]
 |   ========================================
 |   Copyright (c) 2014, 2015 lijiezhijia-blog. All Rights Reserved
 |   http://www.lijiezhijia-blog.com
 |
 +---------------------------------------------------------------------------
 */

define(function(require, exports, module) {
    J = jQuery;

    var Authc = {
        isAuthced: function () {
            return (typeof(_INTERSPACE_BLOG.LOGIN_TOKEN) !== 'undefined' && _INTERSPACE_BLOG.LOGIN_TOKEN.length > 0);
        },
        showLogin : function () {
            var that = this;
            $('#login_alert').modal();
            $('#ajax_login_submit').unbind().click(function () {
                that.doPostLogin();
            });
        },
        doPostLogin: function () {
            var un = $('#ajax_login_username').val();
            var pw = $('#ajax_login_password').val();
            jQuery.post(_INTERSPACE_BLOG.BASE_PATH + '/api/login', {'username': un, 'password': pw}, function (ret) {
                if (ret && ret.code == 0) {
                    window.location.reload();
                } else {
                    $('#ajax_login_message').text(ret.message).show();
                }
            });
        }
    };

    module.exports = Authc;
});