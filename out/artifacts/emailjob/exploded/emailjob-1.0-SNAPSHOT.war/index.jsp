<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>extHelloworld</title>
    <script type="text/javascript" src="ext/js/bootstrap.js"></script>
    <script type="text/javascript" src="ext/js/ext-all.js"></script>

    <script type="text/javascript" src="ext/js/ext-lang-zh_CN.js"></script>
    <link href="ext/ext-theme-classic/ext-theme-classic-all.css" rel="stylesheet" type="text/css">
</head>
<body>
   你好。我是测试页面。
</body>
</html>
<script>
    Ext.onReady(function () {
        Ext.create('Ext.data.Store', {
            storeId:'simpsonsStore',
            fields:['name', 'email', 'phone'],
            data:{'items':[
                { 'name': 'Lisa',  "email":"lisa@simpsons.com",  "phone":"555-111-1224"  },
                { 'name': 'Bart',  "email":"bart@simpsons.com",  "phone":"555-222-1234" },
                { 'name': 'Homer', "email":"home@simpsons.com",  "phone":"555-222-1244"  },
                { 'name': 'Marge', "email":"marge@simpsons.com", "phone":"555-222-1254"  }
            ]},
            proxy: {
                type: 'memory',
                reader: {
                    type: 'json',
                    root: 'items'
                }
            }
        });

        Ext.create('Ext.grid.Panel', {
            title: 'Simpsons',
            store: Ext.data.StoreManager.lookup('simpsonsStore'),
            columns: [
                { header: 'Name',  dataIndex: 'name', field: 'textfield' },
                { header: 'Email', dataIndex: 'email', flex: 1,
                    field: {
                        xtype: 'textfield',
                        allowBlank: false
                    }
                },
                { header: 'Phone', dataIndex: 'phone' }
            ],
            selType: 'rowmodel',
            plugins: [
                Ext.create('Ext.grid.plugin.CellEditing', {
                    clicksToEdit: 1
                })
            ],
            height: 200,
            width: 800,
            renderTo: Ext.getBody()
        });

    });
</script>