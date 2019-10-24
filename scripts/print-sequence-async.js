'use strict'

const Promise = require('bluebird')

const outputNumberAsync = async (number) => {
    await Promise.delay(1)
    console.log(number)
}

const run = async () => {
    let number = 0

    console.log(number)

    if (number >= 0) {
        number++
        console.log(number)
    }
    if (number > 0) {
        console.log(number)
    }
    if (number < 0 || (number == 0 && number > 0)) {
        number++
        console.log(number)
    }
    for(let i = 0; i<3; i++) {
        number = number + 1
        console.log(number)
    }
    number++
    outputNumberAsync(number)
    number = 10
    console.log(number)
}

Promise.resolve(run()).catch(console.error).finally(process.exit)