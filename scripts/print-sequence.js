'use strict'

const run = () => {
    let number = 0

    console.log(number)

    if (number >= 0) {
        number++
        console.log(number)
    }
    if (number > 0) {
        console.log(number)
    }
    for(let i = 0; i<3; i++) {
        number = number + 1
        console.log(number)
    }
}

run()