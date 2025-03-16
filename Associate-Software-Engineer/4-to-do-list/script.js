function addTask() {
    let taskInput = document.getElementById("taskInput");
    let taskValue = taskInput.value.trim();
    if (taskValue === "") {
        alert("Please enter a task!");
        return;
    }
    
    let li = document.createElement("li");
    let removeBtn = document.createElement("button");
    removeBtn.className = "remove-btn";
    removeBtn.innerHTML = '<i class="fa-solid fa-trash"></i>'; 
    removeBtn.onclick = function() {
        removeTask(this);
    };

    li.innerHTML = `${taskValue} `;
    li.appendChild(removeBtn); 

    document.getElementById("taskList").appendChild(li);
    taskInput.value = "";
}

function removeTask(button) {
    let li = button.parentElement;
    document.getElementById("taskList").removeChild(li);
}

