let userForm = {
    name: null,
    gender: null
}

function addFio(event) {
    console.log(event.target.value)
    userForm.name = event.target.value;
}

function addGender(event) {
    console.log(event.target.value)
    userForm.gender = event.target.value;
}

function showAlert() {
    alert(JSON.stringify(userForm))
}