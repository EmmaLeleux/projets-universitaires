var indiceImage=0;
var nbr=indiceImage+1;

var afficheImage= function(indice){
  attenue();
  var diapo=document.querySelector('#diapo img');
  diapo.src='../'+tabImages[indice];
    devoile();
}

var imageSuivante=function(){
  if (indiceImage== tabImages.length-1){
    indiceImage=0;
  }
  else{
    indiceImage+=1;
  }
  nbr=indiceImage+1
  afficheImage(indiceImage);
  document.getElementById('texte').innerHTML='image '+nbr+'/8';
}

var imagePrecedente=function(){
  if (indiceImage== 0){
    indiceImage=tabImages.length-1;
  }
  else{
    indiceImage-=1;
  }
  nbr=indiceImage+1
  afficheImage(indiceImage);
  document.getElementById('texte').innerHTML='image '+nbr+'/8';
}

var timer=function(){
  var time=document.getElementById("temps");
  a=window.setInterval(imageSuivante,time.value*1000);
}
var stoptime= function(){
  window.clearInterval(a);}


var lecture= function(){
  var x= document.getElementById("play");
  if (x.value== 'lecture'){
    timer();
    x.innerHTML='stop';
    x.value='stop';
  }
  else{
    stoptime();
   x.innerHTML='lecture';
    x.value='lecture';
  }
}

var attenue=function(){
  var g= document.getElementById("diapo");
  g.style.opacity="0";
}

var devoile=function(){
  var f=document.getElementById("diapo");
  f.style.opacity="1"
}
var setupListeners=function(){
  document.getElementById("bouton").addEventListener("click",imageSuivante);
  document.getElementById("bouton2").addEventListener("click",imagePrecedente);
  document.getElementById("play").addEventListener("click", lecture);
}

window.addEventListener('load', setupListeners);
