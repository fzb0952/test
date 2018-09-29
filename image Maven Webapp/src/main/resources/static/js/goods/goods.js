/**
 * 
 */
var vm = new Vue({

	el:"#allGoods",
	data:{
		goodsList:[]
	},
	methods:{
		getAllGoods:function(_keycontent){
			var self  = this;
			$.ajax({
			    type:"post",
			    url:"/getAllGoods",
			    async:false,
			    success:function(data){
			    	self.goodsList = data;
			    }
			});
		}
	},
	created:function(){
		this.getAllGoods("");
	}
});