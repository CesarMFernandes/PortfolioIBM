const form = document.getElementById("formulario");
const tit = document.getElementById("titulo");
const link = document.getElementById("link");
const bcadastrar = document.getElementById("cad");
const bexcluir = document.getElementById("exc");
const bpesquisar = document.getElementById("pes");
const blistar = document.getElementById("lis");
const balterar = document.getElementById("alt");
function cadastrar(){
    if(tit.textContent != "Cadastrar"){
        form.classList.remove("conteudo");
        form.classList.add("conteudoh");
        setTimeout(function(){
            tit.textContent = "Cadastrar";
            link.href = "../AcessoBD/Cadastrar.php";
            form.classList.remove("conteudoh");
            form.classList.add("conteudo");
        }, 500);
        bcadastrar.classList.add("selected");
        bexcluir.classList.remove("selected");
        bpesquisar.classList.remove("selected");
        blistar.classList.remove("selected");
        balterar.classList.remove("selected");
    }
}

function excluir(){
    if(tit.textContent != "Excluir"){
        form.classList.remove("conteudo");
        form.classList.add("conteudoh");
        setTimeout(function(){
            tit.textContent = "Excluir";
            link.href = "../AcessoBD/excluir.php";
            form.classList.remove("conteudoh");
            form.classList.add("conteudo");
        }, 500);
        bcadastrar.classList.remove("selected");
        bexcluir.classList.add("selected");
        bpesquisar.classList.remove("selected");
        blistar.classList.remove("selected");
        balterar.classList.remove("selected");
    }
}

function pesquisar(){
    if(tit.textContent != "Pesquisar"){
        form.classList.remove("conteudo");
        form.classList.add("conteudoh");
        setTimeout(function(){
            tit.textContent = "Pesquisar";
            link.href = "../AcessoBD/pesquisar.php";
            form.classList.remove("conteudoh");
            form.classList.add("conteudo");
        }, 500);
        bcadastrar.classList.remove("selected");
        bexcluir.classList.remove("selected");
        bpesquisar.classList.add("selected");
        blistar.classList.remove("selected");
        balterar.classList.remove("selected");
    }
}

function listar(){
    if(tit.textContent != "Listar"){
        form.classList.remove("conteudo");
        form.classList.add("conteudoh");
        setTimeout(function(){
            tit.textContent = "Listar";
            link.href = "../AcessoBD/Listar.php";
            form.classList.remove("conteudoh");
            form.classList.add("conteudo");
        }, 500);
        bcadastrar.classList.remove("selected");
        bexcluir.classList.remove("selected");
        bpesquisar.classList.remove("selected");
        blistar.classList.add("selected");
        balterar.classList.remove("selected");
    }
}

function alterar(){
    if(tit.textContent != "Alterar"){
        form.classList.remove("conteudo");
        form.classList.add("conteudoh");
        setTimeout(function(){
            tit.textContent = "Alterar";
            link.href = "../AcessoBD/alterar.php";
            form.classList.remove("conteudoh");
            form.classList.add("conteudo");
        }, 500);
        bcadastrar.classList.remove("selected");
        bexcluir.classList.remove("selected");
        bpesquisar.classList.remove("selected");
        blistar.classList.remove("selected");
        balterar.classList.add("selected");
    }
}