const AddButton=document.querySelector(".Todo .head div"),
    ToDoInput=document.querySelector(".Todo input"),
    Todo=document.querySelector(".Todo ul");
var TodoTrash=document.querySelectorAll(".Todo ul div");

AddButton.addEventListener("click",function(){
    ToDoInput.classList.toggle("hide");
});

TodoTrash.forEach(el=>{
    el.addEventListener("click",removeItem)
});



