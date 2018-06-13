/**
* Alopex UI v2.10.1
* http://ui.alopex.io
*
* Copyright (c) 2018 SK Holdings C&C. All rights reserved.
*
* This software is the confidential and proprietary information of SK Holdings C&C.
* You shall not disclose such confidential information and shall use it only in
* accordance with the terms of the license agreement you entered into with SK Holdings C&C.
*
* Date :  2018-02-01 13:08:57 GMT+0900 (대한민국 표준시)
**/
$a.setup({
    defaultComponentClass: {
    	webEditor: 'WebEditor',
    	webeditor: 'Webeditor'
    }
});


$a.widget.webEditor = $a.widget.webeditor = $a.inherit($a.widget.object, {
    widgetName: 'webeditor',
    properties: {
		height: 300
    },
    init: function(el, options){
		var opts = $.extend(true, {}, this.properties, options);
		$(el).webeditor(opts);
    }
});