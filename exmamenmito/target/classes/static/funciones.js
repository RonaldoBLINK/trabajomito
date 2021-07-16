function eliminar(id){
	
	swal({
  title: "¿Seguro que quiere eliminar este elemento?",
  text: "Una vez eliminado este elemento, no podra recuperarlo",
  icon: "warning",
  buttons: true,
  dangerMode: true,
})
.then((OK) => {
  if (OK) {
	$.ajax({
		url:"/eliminar/"+id,
		success: function(res){
			console.log(res);
			
		}
			
	})
	
    swal("El elemento a sido eliminado", {
      icon: "success",
    }).then ((ok)=>{
	if (ok){
		location.href="/listar";
		
	}
});
  } else {
    swal("Your imaginary file is safe!");
  }
});
}