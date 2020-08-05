/*解决iframe高度不够的问题*/
	 window.onload = reinitIframe;
		function reinitIframe() {
		var iframe = document.getElementById("urlIframe");
		 try
		{
		var bHeight = iframe.contentWindow.document.body.scrollHeight;
		/*
		var dHeight = iframe.contentWindow.document.documentElement.scrollHeight;
		var height = Math.max(bHeight, dHeight);
		iframe.height = height; */
		iframe.height = bHeight;
		}
		catch (ex) { }
		}
		function aticlecontent(url){
			console.log(url);
		return "personbok/aticlecontent?aid="+url;
		}
		var PARMS ={
			parm:[],
			saveparm:function(keys,values){
				var p={fkey:"",value:""}
				p.fkey=keys;
				p.value=values;
				this.parm.push(p)
			},
			getparm:function(keys){
				var value="";
				var flag;
				var arr=this.parm;
				for(i in arr){
					var	p=this.parm[i]
					if(p.fkey==keys){
						value=p.value;
						flag=i;
					}
				}
				arr.splice(flag,1);
				return value;
		},
		}