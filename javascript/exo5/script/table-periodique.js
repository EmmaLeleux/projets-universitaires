/* fonctions pour l'exercice sur la table périodique */

/* survol: copie l'élément survolé par la souris pour le faire apparaitre dans l'élément d'id focus*/
   
var survol = function(){
  var l=document.getElementById("focus")
  if(l.textContent!=this.innerText && l.innerHTML!=this.innerHTML){
  l.textContent=this.innerText;
  l.innerHTML=this.innerHTML
  var h= document.querySelector('#focus div.masseatomique');
  h.style.display='initial';
  var p= document.querySelector('#focus div.coucheselectrons');
  p.style.display='initial';
  var k= document.querySelector('#focus div.electronegativite');
  k.style.display='initial';
  var g=window.getComputedStyle(this,null).backgroundColor;
  l.style.backgroundColor=g;}
  
}

/* focus: affiche dans l'élément d'id focus le premier élément au chargement de la page*/
var focus=function(){
  var f= document.querySelector('div.ligne>div.elementChimique');
  var l=document.getElementById("focus");
  l.textContent=f.innerText;
  l.innerHTML=f.innerHTML;
  var g=window.getComputedStyle(f,null).backgroundColor;
  l.style.backgroundColor=g;
}



/* change: permet de faire apparaitre ou non l'élément d'id focus en cochant ou décochant la case focus*/
var change= function(){
  var a=document.getElementById('checkFocus');
  var b=document.getElementById('focus');
  if(a.checked==false){
    b.style.display='none';
  }
  else{
    b.style.display='initial';
  }
}

/* displayMasse: permet de faire apparaitre ou non la masse atomique des éléments en cochant ou décochant la case masse atomique*/
var displayMasse= function(){
  var h= document.querySelectorAll('div.ligne div.masseatomique');
  var t= document.getElementById('checkMasse');
  for(var i=0; i<h.length;i+=1){
  if(t.checked==false){
    h[i].style.display='none';
  }
  else{
    h[i].style.display='initial';
  }
}}

/* displayCouches: permet de faire apparaitre ou non la couche d'électrons des éléments en cochant ou décochant la case couches électrons*/
var displayCouches= function(){
  var h= document.querySelectorAll('div.ligne div.coucheselectrons');
  var t= document.getElementById('checkCouches');
  for(var i=0; i<h.length;i+=1){
  if(t.checked==false){
    h[i].style.display='none';
  }
  else{
    h[i].style.display='initial';
  }
}}

/*tous: permet de cocher les cases masse atomique, couches électrons et élevtronégativité en même temps*/
var tous=function(){
  var y=document.querySelectorAll('#checkOptions input');
  for (var g=0;g<y.length;g++){
  y[g].checked=true;}
  displayMasse();
  displayCouches();
  displayElectro();
}

/*tous: permet de décocher les cases masse atomique, couches électrons et élevtronégativité en même temps*/
var rien=function(){
  var y=document.querySelectorAll('#checkOptions input');
  for (var g=0;g<y.length;g++){
  y[g].checked=false;}
  displayMasse();
  displayCouches();
  displayElectro();
}

/* displayElectro: permet de faire apparaitre ou non l'électronégativité des éléments en cochant ou décochant la case électronégativité*/
var displayElectro= function(){
  var h= document.querySelectorAll('div.ligne div.electronegativite');
  var t= document.getElementById('checkElectro');
  for(var i=0; i<h.length;i+=1){
  if(t.checked==false){
    h[i].style.display='none';
  }
  else{
    h[i].style.display='initial';
  }
}}

var setupListeners=function(){
  
  document.getElementById("checkFocus").addEventListener("click",change);
  var c=document.getElementsByClassName("elementChimique");
  for(var t=0;t<c.length;t++){
    c[t].addEventListener('mouseover',survol)};
  document.getElementById("checkMasse").addEventListener('click',displayMasse);
  document.getElementById("checkCouches").addEventListener('click',displayCouches);
  document.getElementById("checkElectro").addEventListener('click',displayElectro);
  document.getElementById("tous").addEventListener("click",tous);
  document.getElementById("aucun").addEventListener("click",rien);
}

window.addEventListener('load', setupListeners);
window.addEventListener('load',focus);