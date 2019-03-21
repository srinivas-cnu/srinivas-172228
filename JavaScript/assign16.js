function reversePlusOne(a){
 
  a.push(1);
   a.reverse();
  return a;
  
}
function plusesEverywhere(a){
  var x=""+a[0];
 for(i=1;i<a.length;i++){
   x+="+"+a[i];
   
   
}
  return x;
  
}

function arrayQuantityPlusOne(a){
 
  return a.length+1;
  
}

console.log(reversePlusOne([5,6,4]));
console.log(plusesEverywhere([5,60,21]));
console.log(arrayQuantityPlusOne([5,60,21]));



/*
Exception: SyntaxError: expected expression, got '}'
@Scratchpad/1:5
*/