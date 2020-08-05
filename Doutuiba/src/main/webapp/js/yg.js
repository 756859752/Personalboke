$(document).ready(function(){
	$('[yg-repeat]').hide();
})
var YG={
	validmsg:true,
	setData:function(data){
			var item=data;
			for(k in item){
				var dom=	$('[yg-mod="'+k+'"]');
				debugger
				if(dom.length>0){
				var tagname=dom.get(0).tagName;
				var val=item[k];
					if(k.indexOf("date")>0){
						var val=this.msForDate(val);
					}
					if(tagname=="INPUT"||tagname=="TEXTAREA"||tagname=="SELECT"){
							dom.val(val);
							continue;
					}
					dom.html(val);
				}
			}
	},
	getData:function(){//取下所有带yg-mod属性的表单 val值
		if(this.valid()){
			var data={};
			$('[yg-mod]').each(function(){
				var k=$(this).attr("yg-mod");
				var val =$(this).val()
				var tagname=$(this).get(0).tagName;
				if(tagname=="INPUT"||tagname=="TEXTAREA"||tagname=="SELECT"){
					data[k]=val;
				}
			})
	//		data=JSON.stringify(data);
			return data;
		}else{
			return null;
		}	
	},
	getFormData(){//获取类FormData类型的数据对象
		if(this.valid()){
			var data=new FormData();
			$('[yg-mod]').each(function(){
				var k=$(this).attr("yg-mod");
				var tagname=$(this).get(0).tagName;
				var fileattr=$(this).attr("type");
				if(tagname=="INPUT"||tagname=="TEXTAREA"||tagname=="SELECT"){
					if(fileattr!=undefined&&fileattr=="file"){//搜集file类型
						var val=$(this).get(0).files[0];
						data.append(k,val);
					}else{
						var val =$(this).val()
						data.append(k,val);
					}
				}
			})
	//		data=JSON.stringify(data);
			return data;
		}else{
			return null;
		}
	},
	setRepeat:function(name,cdata){//根据数据模型循环输出
		var index=0;
		var _this=$('[yg-repeat="'+name+'"]');
				var html=_this.get(0).outerHTML;
				for(i in cdata){
					var item=cdata[i]
					var htmlitem=html;
					for(k in item){
						//先替换字段
						var val=item[k];
						if(k.indexOf("date")>0){//处理时间的
							val=this.msForDate(val);
						}
						//替换掉所有
						while(htmlitem.indexOf("#{"+k+"}")>0){
							htmlitem=htmlitem.replace("#{"+k+"}",val);
						}
						while(htmlitem.indexOf("#{index}")>0){
							htmlitem=htmlitem.replace("#{index}",index);
						}
					}
					htmlitem=htmlitem.replace('yg-repeat="'+name+'"',"");
					htmlitem=htmlitem.replace('style="display: none;"',"");
					_this.parent().append(htmlitem+'');
					index++;
				}
			//_this.remove();
	},
	setRepeatByModel:function(){
		
	},
	valid:function(){//字段验证及提示
		flag=true;
		$('[yg-mod]').each(function(){
			var val=$(this).attr("yg-valid");
			var valn=$(this).attr("yg-vmin");
			var valx=$(this).attr("yg-vmax");
			var text=$(this).val();
			var msg="";
			if(val!=undefined){
				if(val=="notnull"){
					if(text==''||text==null){
						var tagname= $(this).prev().get(0).tagName;
						if(tagname=="TD"||tagname=="SPAN"||tagname=="LABEL"){
							msg+=$(this).prev().html();
						}
						msg+=" 字段不能为空！";
						alert(msg);
						flag=false;
						return false;
					}
				}
			}
			if(valn!=undefined){
					if(text.length<valn){
						var tagname= $(this).prev().get(0).tagName;
						if(tagname=="TD"||tagname=="SPAN"||tagname=="LABEL"){
							msg+=$(this).prev().html();
						}
						msg+=" 字段太短！";
						alert(msg);
						flag=false;
						return false;
					}
			}
			if(valx!=undefined){
				if(text.length>valx){
					var tagname= $(this).prev().get(0).tagName;
					if(tagname=="TD"||tagname=="SPAN"||tagname=="LABEL"){
						msg+=$(this).prev().html();
					}
					msg+=" 字段太长！";
					alert(msg);
					flag=false;
					return false;
				}
			}
		})
		return flag;
	},
	msForDate:function(val){
		return new Date(val).toLocaleDateString();
	}
	,getMod:function(val){//获取单个
		var modval=$('[yg-mod]="'+val+'"').val();
		var data={};
		data[val]=modval;
		return data;
	}
	,getFiles:function(){
		$('[yg-file]').each(function(){
			var files={};
			var key=$(this).attr('[yg-file]');
			var file= $(this).get(0).files[0];
		})
	}
}
