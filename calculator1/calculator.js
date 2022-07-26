// display number

function dis(val) {
    document.getElementById("result").value+=val 
}

// calculate the result
function solve () {
    let x = document.getElementById("result").value 
    let y = eval(x)
    document.getElementById("result").value = y 
}

// clear the input
function clr() {
    document.getElementById("result").value = ""
}

// the bug is that when the '=' button is pushed, when
// start another calculation, the input number will be
// appended to the text displayed from last time, not
// starting a new text or input for calculation
