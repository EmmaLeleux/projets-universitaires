/* decalageLettreMinuscule: donne la nième lettre qui suit la lettre passée en paramètre.
   paramètre n: un nombre entier
   paramètre k: une lettre minuscule
   résultat: une lettre minuscule qui est le nième caractère qui suit la lettre entrée en paramètre
*/

var decalageLettreMinuscule= function(k,n){
  var d= k.charCodeAt()+n;
  if (d>'z'.charCodeAt()){
    var c=d-26;
    return String.fromCharCode(c);
  }
  else{
  return String.fromCharCode(d);
  }
}

/* decalageLettreMajuscule: donne la nième lettre qui suit la lettre passée en paramètre.
   paramètre n: un nombre entier
   paramètre k: une lettre majuscule
   résultat: une lettre majuscule qui est le nième caractère qui suit la lettre entrée en paramètre
*/

var decalageLettreMajuscule= function(k,n){
  var d= k.charCodeAt()+n;
  if (d>'Z'.charCodeAt()){
    var c=d-26;
    return String.fromCharCode(c);
  }
  else{
  return String.fromCharCode(d);
  }
}

/* minus: indique si le caractère entré en paramètre est une minuscule ou non
   paramètre c: un caractère
   résultat: true si le caractère entré en paramètre est minuscule
             false sinon
*/
var minus= function(c){
  return c.toLowerCase()==c;  
}

/* estUneLettre: indique si le caractère entré en paramètre est une lettre ou non
   paramètre c: un caractère
   résultat: booléen: true si le caractère entré en paramètre est une lettre
                      false sinon
*/

var estUneLettre=function(c){
  return minus (c.toUpperCase())==false;
}

/* decalage: donne une chaine de caractère équivalente à la chaine de caractère entrée en paramètre décalé de n lettres
   paramètre n: un nombres
   paramètre s: une chaine de caractère
   résultat: une chaine de caractère obtenue en décaltant de n lettre la chaine passée en paramètre.
*/
    
var decalage= function(s,n){
  var res='';
  for (i=0;i<s.length;i+=1){
    if (estUneLettre(s[i])){
      if (minus(s[i])){
        res+=decalageLettreMinuscule(s[i],n);
      }
      else{
        res+=decalageLettreMajuscule(s[i],n);
      }
    }
    else{
       res+=s[i];
    }
  }
  return res;
}