
function tran(id)
{
  var v, j, sj, rv = "";
  v = id.value.replace(/,/g,"").split(".");
  j = v[0].length % 3;
  sj = v[0].substr(j).toString();
  for (var i = 0; i < sj.length; i++)
  {
    rv = (i % 3 == 0) ? rv + "," + sj.substr(i, 1): rv + sj.substr(i, 1);
  }
  var rvalue = (v[1] == undefined) ? v[0].substr(0, j) + rv: v[0].substr(0, j) + rv + "." + v[1];
  if (rvalue.charCodeAt(0) == 44)
  {
    rvalue = rvalue.substr(1);
  }
  id.value = rvalue;
}

function untran(nstr){
	 return nstr.replace(new RegExp(",","g"),'');//.replace('%','').replace(' ','');
}



