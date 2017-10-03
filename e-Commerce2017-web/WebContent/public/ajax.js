// Cria vari�veis de acesso global a todas as functions
var request;            // Objeto de Requisi��o
var idFieldResponse;    // Define qual o campo que receber� resposta
var asynchronous=true; // Define se requisi��es ser�o ass�ncronas ou s�ncronas
var response;           // Vari�vel para armazenar a responta do servidor
// Cria objeto de requisi��o para o navegador
function createRequest(){
  request  = null;
  response = null;
  try{
    // Tenta criar objeto HttpRequest
    request = new XMLHttpRequest();
  }catch(trymicrosoft){
    try{
      // Se n�o conseguiu, tenta criar objeto da biblioteca Msxml2;
      request = new ActiveXObject( "Msxml2.XMLHTTP" );
    }catch(othermicrosoft){
      try{
        // Caso n�o tenha conseguido, tenta criar objeto Microsoft
        request = new ActiveXObject( "Microsoft.XMLHTTP");
      }catch(failed){
        // Navegador n�o tem suporte a requisi��es
        request = null;
      }
    }
  }
  if( request === null ){
    alert( "N�o foi poss�vel criar objeto de requisi��o!" );
  }
}
// Verifica a resposta da requisi��o
// readyState == 4   - Request Finished and response is ready
// status     == 200 - OK
function requestOk(){
  var retorno = false;
  if ( request.readyState == 4 && ( request.status == 200 || request.status == 304 ) ){
    retorno = true;
  }
  return retorno;
}
//Classe para criar estrutura JSON de acordo com os campos informados
function dataJSON(){
  var strJson = "";
  this.addData = function( campo , valor ){
    strJson = strAddSep( strJson , '"' + campo + '": ' + '"' + valor + '"'   , "," );
  };
  this.getData = function(){
    return "{ " + strJson + " }";
  };
}
function strAddSep( str, strAdd, sep ){
  if( typeof(sep) == "undefined" ){
    sep = "AND";
  }
  if ( str === "" ){
    str = strAdd;
  }else{
    str = str + " " + sep + " " + strAdd;
  }
  return str;
}