/**
 * 
 */
 $(function(){
    //页面加载完成之后执行
// 	$.jgrid.defaults.styleUI = "Bootstrap";
    pageInit();
});
function pageInit(){
	jQuery("#myTable").jqGrid({
		url:"/getAllGoods",
		datatype:"json",
		colNames:['商品编号','商品名称','商品价格','商品描述'],
		colModel:[
		{name:'cBh',index:'cBh',width:350,align:"center"},
		{name:'cName',index:'cName',width:360,align:"center"},
		{name:'cPrice',index:'cPrice',width:360,align:"center"},
		{name:'cDescribe',index:'cDescribe',width:370,align:"center",sortable : false}
		],
		 // 一页显示的行记录数  
	    rowNum:10,   
	    // 表格宽度  
	    width:700,  
	    // 表格高度  
	    height:200,  
	    // 翻页控制条中 每页显示记录数可选集合  
	    rowList:[10,20,30],   
	    // 翻页DOM  
	    pager: '#pager',  
	    // 默认排序字段  
	    sortname: 'invdate',  
	    // 是否显示行号，默认值是false，不显示  
	    viewrecords: true,  
	    // 默认字段排序顺序，默认asc，正序  
	    sortorder: "desc",   
	    // 列表总标题  
	    caption:"测试",  
	    // 数据加载完成并且DOM创建完毕之后的回调函数  
	    gridComplete: function(){  
	        //TODO  
	    },  
	    // 单元格被点击选择回调函数， rowid为改行数据id值，iCol为改行索引，cellcontent为该行html代码，e为click事件  
	    onCellSelect: function(rowid, iCol, cellcontent,e){  
	        //TODO  
	    }  
	}); 