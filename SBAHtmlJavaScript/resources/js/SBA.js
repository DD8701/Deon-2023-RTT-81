function validateEmail() {
    let email = document.getElementById('email').value;
    let emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    if (!emailRegex.test(email)) {
        alert("Please enter a valid email address");
        return false;
    }

    return true;
}