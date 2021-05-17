let states = document.getElementById("statedd");
var stateList = ["AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "DC", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY"];
stateList.forEach(state => {
    states.innerHTML += '\n<option value="' + state + '">'+ state + '</option>';
});
states.selectedIndex = 38;      // PA

function validateForm() {
    let name = document.getElementById("name").value;
    let email = document.getElementById("email").value;
    let pass = document.getElementById("pass").value;
    let passchk = document.getElementById("passchk").value;
    let zip = document.getElementById("zip").value;
    let validForm = true;
    const re = /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    if (re.test(String(email).toLowerCase())==false) {
        alert("Email must be in form \"johndoe@site.com\"! Please correct.");
        validForm = false;
    }
    if (pass != passchk) {
        alert("Passwords do not match! Please correct.");
        validForm = false;
    }
    if (Number.isNaN(parseInt(zip)) || zip.length < 5 || zip.length > 9) {
        alert(`Invalid zip code entered (${zip})! Please correct.`);
        validForm = false;
    }
    return validForm;
}