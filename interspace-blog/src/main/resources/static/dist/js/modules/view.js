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
    require('share-css');
    require('share');

    require.async(['highlight-css', 'highlight'], function () {
        hljs.initHighlightingOnLoad();
        $('pre').each(function(i, block) {
            hljs.highlightBlock(block);
        });
    });

    $('a[data-toggle="fulltext"]').click(function () {
        $('.topic').addClass('fulltext');
    });

    if ($('.topic').outerHeight(true) <= 700) {
        $('.topic').addClass('fulltext');
    }
});