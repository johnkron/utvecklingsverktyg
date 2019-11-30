'use strict'

const prompt = require('prompt-sync')()

const run = () => {

    let number1 = prompt('Number1:')
    while (number1 < 1) {
        number1 = prompt('Number1:')
    }
    let number2 = prompt('Number2:')
    while (number2 < 1) {
        number2 = prompt('Number2:')
    }
    let wack = prompt('which sign?')
    while (wack < 1) {
        wack = prompt('which sign?')
    }
    let answer = null
    switch (wack) {
        case '+':
            answer = parseInt(number1) + parseInt(number2);
            console.log(number1 + '+' + number2 + '=' + answer)
            break;
        case '-':
            answer = parseInt(number1) - parseInt(number2);
            console.log(number1 + '-' + number2 + '=' + answer)
            break;
        case '*':
            answer = parseInt(number1) * parseInt(number2);
            console.log(number1 + '*' + number2 + '=' + answer)
            break;
        case '/':
            answer = parseInt(number1) / parseInt(number2);
            console.log(number1 + '/' + number2 + '=' + answer)
            break;
        default:
            console.log('not an accepable sign')
    }
    if (answer !== null) {
        console.log(answer)
    } 
        
    
}

run()