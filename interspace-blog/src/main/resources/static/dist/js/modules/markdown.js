/*
+--------------------------------------------------------------------------
|   lijiezhijia-blog [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2019 interspace. All Rights Reserved
|   http://www.roilat.cn
|
+---------------------------------------------------------------------------
*/

define('markdown', [
    'codemirror-css',
    'codemirror-theme',
    'codemirror',
    'marked'
    ], function(require, exports, module) {

    require.async(['codemirror-markdown', 'codemirror-keymap', 'app.markdown'], function () {
        MdEditor.initEditor();
    });
});