'use strict'

const prompt = require('prompt-sync')()

const run = () => {

    let number1 = prompt('Number1:')
    let operator = prompt('input operator')
    let number2 = prompt('Number2:')
    number1 = parseInt(number1)
    number2 = parseInt(number2)
    if (operator == '+') {
        let result = number1 + number2 
        let text = number1 + '+' + number2 + '=' + result
        console.log(text)
        console.log(result) 
    }
    else if (operator == '-') {
        let result = number1 - number2
        let text = number1 + '-' + number2 + '=' + result
        console.log(text)
        console.log(result)
    }
    else if (operator == '*') {
        let result = number1 * number2
        let text = number1 + '*' + number2 + '=' + result
        console.log(text)
        console.log(result)
    } 
   else if (operator == '/') {
       let result = number1 / number2
       let text = number1 + '/' + number2 + '=' + result
       console.log(text)
       console.log(result)
   }
}

run()