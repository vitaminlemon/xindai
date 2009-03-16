
function obj_getbyid(id) {
	itm = null;
	if (document.getElementById) {
		itm = document.getElementById(id);
	} else if (document.all)	{
		itm = document.all[id];
	} else if (document.layers) {
		itm = document.layers[id];
	}
	return itm;
}



var RegCheck = {
	
	Value : function(v,Objid){
		var isok_pass = obj_getbyid("isok_"+Objid);
		if (v==''){
			isok_pass.innerHTML = err_msg("必须填写，不得为空！");
			return false;
		}else{
			isok_pass.innerHTML = "";
			obj_getbyid("checkreg").value = "1";
			return true;
		}
	}
}

//错误提示信息
function err_msg(msg){
	obj_getbyid("checkreg").value = "0";
	return "&nbsp;<img src='"+forum_picurl+"/note_error.gif' border='0'/> <span class='redfont'>"+msg+"</span>";
}





