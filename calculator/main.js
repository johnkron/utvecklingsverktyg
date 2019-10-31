'use strict'

const prompt = require('prompt-sync')()

const run = () => {

    let number1 = prompt('Number1:')
    let operator = prompt ('input operator')
    let number2 = prompt('Number2:')
    number1 = parseInt(number1)
    number2 = parseInt(number2)
    if (operator == '+'){
        console.log(number1 + '+' + number2 + '=' + (number1 + number2))
    }else if (operator == '-') {
        console.log(number1 + '-' + number2 + '=' + (number1 - number2))
    }else if (operator == '*') {
        console.log(number1 + '*' + number2 + '=' + (number1 * number2))
    }else if (operator == ':' || operator == '/') {
        console.log(number1 + ':' + number2 + '=' + (number1 / number2))
    }else {console.log('ERROR FAG')}

}

run()